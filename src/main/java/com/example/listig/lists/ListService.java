package com.example.listig.lists;

import com.example.listig.AuthUtil;
import com.example.listig.lists.entities.ListItem;
import com.example.listig.lists.entities.UserList;
import com.example.listig.lists.repositories.ListItemRepository;
import com.example.listig.lists.repositories.UserListRepository;
import com.example.listig.notifications.NotificationService;
import com.example.listig.user.UserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class ListService {

    @Autowired
    UserListRepository repository;
    @Autowired
    ListItemRepository itemRepository;
    @Autowired
    UserService userService;
    @Autowired
    NotificationService notificationService;


    private static final Logger logger = Logger.getLogger(ListService.class.getName());

    @Transactional
    public ListDto createOrUpdateList(String username, ListDto listDto) throws Exception {
        Long userId = userService.findUserIdByUsername(username);
        UserList list = listDto.getListInfo();

        if (list.getId() != null) {
            if (repository.userHasEditRights(userId, list.getId()) == null) {
                logger.log(Level.WARNING, "User does not have edit rights on list");
                throw new Exception("User does not have edit rights on list");
            }
        }
        if (list.getCreatedAt() == null) {
            list.setCreatedAt(LocalDateTime.now());
        }
        list.setLastEdited(LocalDateTime.now());
        list = repository.save(list);
        Long listId = list.getId();

        String owner = listDto.getOwner();
        repository.upsertUserRoleInList(listId, userService.findUserIdByUsername(owner), ListRole.OWNER.toString());

        List<String> editors = listDto.getEditors();
        editors.forEach(v -> repository.upsertUserRoleInList(listId, userService.findUserIdByUsername(v), ListRole.EDITOR.toString()));

        List<String> viewers = listDto.getViewers();
        viewers.forEach(v -> repository.upsertUserRoleInList(listId, userService.findUserIdByUsername(v), ListRole.VIEWER.toString()));

        List<ListItem> items = listDto.getItems();
        items.forEach(i -> {
            i.setListId(listId);
            itemRepository.save(i);
        });

        UserList updatedList = repository.getUserListById(listId);
        return populateListDto(updatedList);

    }

    public List<ListDto> getAllListsFromUser(String username) {
        Long userId = userService.findUserIdByUsername(username);
        List<UserList> userLists = repository.findListsByUserId(userId);
        return userLists.stream().map(this::populateListDto).toList();
    }


    private ListDto populateListDto(UserList l) {
        ListDto dto = new ListDto();
        dto.setListInfo(l);
        dto.setOwner(repository.findListUserByListAndRole(l.getId(), "Owner").get(0));
        dto.setEditors(repository.findListUserByListAndRole(l.getId(), "Editor"));
        dto.setViewers(repository.findListUserByListAndRole(l.getId(), "Viewer"));
        List<ListItem> items = itemRepository.getItemsByListId(l.getId());
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getItemOrder() == null) {
                items.get(i).setItemOrder(i + 1);
            }
        }
        List<ListItem> sorted = items.stream()
                .sorted(Comparator.comparing(ListItem::getItemOrder))
                .toList();
        dto.setItems(sorted);
        return dto;
    }

    public ListDto getListFromUser(Long id, String username) throws Exception {
        Long userId = userService.findUserIdByUsername(username);
        UserList list = repository.getUserListById(id);
        List<UserList> allLists = repository.findListsByUserId(userId);

        if (allLists.contains(list)) {
            return populateListDto(list);
        } else {
            throw new Exception("User does not own list");
        }
    }

    @Transactional
    public void deleteList(String username, Long listId) throws Exception {
        Long userId = userService.findUserIdByUsername(username);
        UserList userList = repository.getUserListById(listId);
        if (repository.userOwnsList(userId, listId) == null) {
            throw new Exception("User does not own list");
        } else {
            itemRepository.deleteAll(itemRepository.getItemsByListId(listId));
            repository.deleteListsAndUsers(listId);
            repository.delete(userList);
        }
    }

    public boolean userOwnsList(String username, Long listId) {
        Long userId = userService.findUserIdByUsername(username);
        return repository.userOwnsList(userId, listId) != null;
    }
    private boolean userIsEditor(String username, Long listId) {
        List<String> editors=  repository.findListUserByListAndRole(listId, "Editor");
        return editors.contains(username);

    }
    @Transactional
    public ListDto addUserToList(Long listId, String user, ListRole role) throws Exception {

        Long userId = userService.findUserIdByUsername(user);
        if (userId == null) {
            throw new Exception("User doesn't exist");
        }

        Optional<UserList> optionalUserList = repository.findById(listId);
        if (optionalUserList.isPresent()) {
            repository.addListUser(listId, userId, role.toString());
            notificationService.addedToList(
                    userService.findUserIdByUsername(user),
                    optionalUserList.get().getListName(),
                    role.toString(),
                    AuthUtil.getUserName());
        }

        UserList updatedList = repository.getUserListById(listId);
        return populateListDto(updatedList);

    }

    public ListDto deleteItem(String username, ListItem item) throws Exception {
        if (userOwnsList(username, item.getListId()) || userIsEditor(username, item.getListId()) ){
            itemRepository.delete(item);
        }

        return getListFromUser(item.getListId(), username);
    }



    @Transactional
    public ListDto removeUserFromList(ListResource.RemoveUser removeUser) throws Exception {
        Long userId = userService.findUserIdByUsername(removeUser.user());
        Optional<UserList> optionalUserList = repository.findById(removeUser.listId());

        if (optionalUserList.isPresent()) {
            repository.removeListUser(removeUser.listId(), userId);
            UserList updatedList = repository.getUserListById(removeUser.listId());
            return populateListDto(updatedList);
        } else throw new Exception("Can't find list");

    }

    public List<ListOverview> getSummaryFromUser(String username) {
        Long userId = userService.findUserIdByUsername(username);
        List<UserList> userLists = repository.findListsByUserId(userId);
        return userLists.stream().map(l ->
                        getOverview(l))
                .toList();
    }

    @Transactional
    public ListDto socketUpdate(ListDto update) {
        String owner = update.getOwner();
        try {
            return createOrUpdateList(owner, update);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "unable to update: " + e);
            UserList current = repository.getUserListById(update.getListInfo().getId());
            return populateListDto(current);
        }

    }

    @Transactional
    public ListDto makePublic(ListDto list, String username) throws Exception {

        String uuid = UUID.randomUUID().toString();
        list.listInfo.setUuid(uuid);


        return createOrUpdateList(username,list);
    }

    @Transactional
    public ListDto makePrivate(ListDto list) {
        Long id = list.listInfo.getId();
        repository.setUuidToNullById(id);
        UserList updated = repository.getUserListById(id);
        list.setListInfo(updated);
        return list;
    }

    private ListOverview getOverview(UserList userList) {
        return new ListOverview(
                userList.getId(),
                userList.getUuid(),
                userList.getListName(),
                userList.getListDesc(),
                repository.findListUserByListAndRole(userList.getId(), "Owner").get(0),
                repository.countUsers(userList.getId()).size(),
                userList.getType(),
                userList.getCreatedAt(),
                userList.getLastEdited());
    }

    public ListDto getListByUUID(String uuid) {
        UserList list = repository.getUserListByUuid(uuid);
        return populateListDto(list);
    }

}
