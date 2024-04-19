package com.example.listig.lists;

import com.example.listig.lists.entities.ListItem;
import com.example.listig.lists.entities.UserList;
import com.example.listig.lists.repositories.ListItemRepository;
import com.example.listig.lists.repositories.UserListRepository;
import com.example.listig.user.UserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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


    private static final Logger logger = Logger.getLogger(ListService.class.getName());

    @Transactional
    public ListDto createOrUpdateList(String username, ListDto listDto) throws Exception {
        Long userId = userService.findUserIdByUsername(username);
        UserList list = listDto.getList();

        if(list.getId() !=null){
            if (repository.userOwnsList(userId, list.getId()) == null) {
                logger.log(Level.WARNING,"User does not own list");
                throw new Exception("User does not own list");
            }
        }
        list = repository.save(list);
        Long listId = list.getId();

        List<String> owners = listDto.getOwners();
        owners.forEach(o -> repository.upsertUserRoleInList(listId, userService.findUserIdByUsername(o), "Owner"));

        List<String> viewers = listDto.getViewers();
        viewers.forEach(v -> repository.upsertUserRoleInList(listId, userService.findUserIdByUsername(v), "Viewer"));

        List<ListItem> items = listDto.getItems();
        items.forEach(i-> {
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
        dto.setList(l);
        dto.setOwners(repository.findListUserByListAndRole(l.getId(), "Owner"));
        dto.setViewers(repository.findListUserByListAndRole(l.getId(), "Viewer"));
        dto.setItems(itemRepository.getItemsByListId(l.getId()));
        return dto;
    }

    public ListDto getListFromUser(Long id, String username) throws Exception {
        Long userId = userService.findUserIdByUsername(username);
        UserList list = repository.getUserListById(id);
        if(repository.userOwnsList(userId, list.getId()) == null){
            throw new Exception("User does not own list");
        }
        else{
            return populateListDto(list);
        }
    }

    @Transactional
    public void deleteList(String username, Long listId) throws Exception {
        Long userId = userService.findUserIdByUsername(username);
        UserList userList = repository.getUserListById(listId);
        if(repository.userOwnsList(userId, listId) == null){
            throw new Exception("User does not own list");
        }
        else{
            itemRepository.deleteAll(itemRepository.getItemsByListId(listId));
            repository.deleteListsAndUsers(listId);
            repository.delete(userList);
        }
    }
}
