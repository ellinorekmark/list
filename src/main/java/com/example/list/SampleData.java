package com.example.list;

import com.example.list.dao.ListUser;
import com.example.list.repositories.ListItemRepository;
import com.example.list.repositories.UserListRepository;
import com.example.list.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleData implements CommandLineRunner {

    @Autowired
    UserRepository repository;
    @Autowired
    UserListRepository listRepository;
    @Autowired
    ListItemRepository listItemRepository;

    ListUser user = new ListUser();

    @Override
    public void run(String... args) throws Exception {

    }


}
