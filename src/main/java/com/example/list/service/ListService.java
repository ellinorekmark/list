package com.example.list.service;

import com.example.list.dao.UserList;
import com.example.list.repositories.UserListRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@SessionScope
public class ListService {
    UserListRepository listRepository;


    public UserList save(UserList userList) {
        return listRepository.save(userList);
    }
}
