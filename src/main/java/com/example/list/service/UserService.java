package com.example.list.service;

import com.example.list.dao.User;
import com.example.list.repositories.ListItemRepository;
import com.example.list.repositories.UserListRepository;
import com.example.list.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;


@Service
@SessionScope
public class UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserListRepository userListRepository;
    @Autowired
    ListItemRepository listItemRepository;



    User login(String email, String password){
        return new User();
    }

}
