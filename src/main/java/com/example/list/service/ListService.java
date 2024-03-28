package com.example.list.service;

import com.example.list.dao.UserList;
import com.example.list.repositories.UserListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@SessionScope
public class ListService {
    @Autowired
    UserListRepository listRepository;


    public UserList save(UserList userList) {
        return listRepository.save(userList);
    }
}
