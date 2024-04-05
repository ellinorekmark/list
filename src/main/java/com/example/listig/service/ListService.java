package com.example.listig.service;

import com.example.listig.dao.LUser;
import com.example.listig.dao.UserList;
import com.example.listig.dto.ItemDto;
import com.example.listig.dto.ListDto;
import com.example.listig.repositories.ListItemRepository;
import com.example.listig.repositories.UserListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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


    public List<ListDto> getAllListsFromUser(String username) {
        Long userId = userService.findUserIdByUsername(username);
        List<UserList> lists = repository.findListsByUserId(userId);
        List<ListDto> listDtos = lists.stream().map(ListDto::new).toList();
        listDtos.forEach(list -> {
            populateDto(list);
        });


        return listDtos;
    }

    private void populateDto(ListDto list) {
        list.setOwners(repository.findListUserByListAndRole(list.getId(), "Owner"));
        list.setViewers(repository.findListUserByListAndRole(list.getId(), "Viewer"));
        list.setItems(getItems(list.getId()));

    }

    private List<ItemDto> getItems(Long id) {
        return itemRepository.getItemsByListId(id);
    }

    public void updateListUsers(ListDto list) {
        list.getOwners().forEach(u -> {
            Long userId = userService.findUserIdByUsername(u);
            repository.upsertUserRoleInList(list.getId(), userId, "Owner");
        });
        list.getViewers().forEach(u -> {
            Long userId = userService.findUserIdByUsername(u);
            repository.upsertUserRoleInList(list.getId(), userId, "Viewer");
        });
    }

    public ListDto getListFromUser(String username, Long id) throws Exception {
        LUser user = userService.userRepository.findUserByUsername(username);
        List<Long> listIds = user.getListIds();
        if(listIds.contains(id)){
            UserList list = repository.getUserListById(id);
            ListDto dto = new ListDto(list);
            populateDto(dto);
            return dto;
        }
        else throw new Exception("You don't have access to specified list.");



    }
}
