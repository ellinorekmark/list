package com.example.list.service;

import com.example.list.dao.ListItem;
import com.example.list.dao.ListUser;
import com.example.list.dao.UserList;
import com.example.list.dto.ItemDto;
import com.example.list.ListType;
import com.example.list.dto.ListDto;
import com.example.list.repositories.ListItemRepository;
import com.example.list.repositories.UserListRepository;
import com.example.list.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


@Service
public class UserService {
    private static final Logger logger = Logger.getLogger( UserService.class.getName() );
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserListRepository listRepository;
    @Autowired
    ListItemRepository itemRepository;


    ListUser user;





    public ListUser updateUser(){
        this.user = userRepository.findUserById(user.getId());
        return user;
    }
    public ListUser saveUser(ListUser userToSave){
        this.user = userRepository.save(user);
        return user;
    }

    public UserList addList(ListDto newList){
        UserList list = new UserList();
        list.setUserId(user.getId());
        list.setName(newList.getName());
        list.setType(ListType.valueOf(newList.getType().toUpperCase()));
        list = listRepository.save(list);
        user = updateUser();
        logger.log(Level.INFO, "AWESDGWFESEDES LIST HAS ID: "+list.getId());

        return list;

    }


    public boolean isLoggedIn() {
        return user != null;
    }
    public ListUser getUser(){
        return user;
    }

    public List<UserList> getLists() {
        return user.getLists();
    }

    public String getUsername() {
        return user.getUsername();
    }

    public Object getEmail() {
        return user.getEmail();
    }

    public UserList addToList(UserList list, ItemDto item) {
        logger.log(Level.INFO,"item has listId: "+item.getListId());
        ListItem listItem = (new ListItem(item));
        logger.log(Level.INFO,"listItem has listId: "+listItem.getListId());


        itemRepository.save(listItem);

        list = listRepository.getUserListById(list.getId());
        user = updateUser();
        return list;
    }

    public UserList getList(Long id) {
        return listRepository.getUserListById(id);
    }


    public void delete(String username) {
        ListUser user = userRepository.findUserByUsername(username);
        userRepository.delete(user);
    }


    public ListUser loadUserByUsername(String username){
        return userRepository.findUserByUsername(username);
    }
}
