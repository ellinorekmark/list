package com.example.listig;

import com.example.listig.dao.LUser;
import com.example.listig.repositories.ListItemRepository;
import com.example.listig.repositories.UserListRepository;
import com.example.listig.repositories.UserRepository;
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

    LUser user = new LUser();

    @Override
    public void run(String... args) throws Exception {

    }


}
