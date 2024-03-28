package com.example.list;

import com.example.list.dao.User;
import com.example.list.repositories.ItemTagRepository;
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
    @Autowired
    ItemTagRepository itemTagRepository;

    User user = new User();

    @Override
    public void run(String... args) throws Exception {
/*

        user.setEmail("eeeemail");
        user.setPassword("pww");
        user.setUsername("elli");
        user = repository.save(user);

        list.setUserId(user.getId());
        list.setType("ranked");
        list.setName("Toplist");
        list = listRepository.save(list);

        item.setListId(list.getId());
        item.setText("Hunger Games");
        item = listItemRepository.save(item);

        tag.setListItemId(item.getId());
        tag.setTag("rank");
        tag.setValue("Top");
        itemTagRepository.save(tag);

        user = repository.findUserById(user.getId());

        System.out.println(String.format("%s: %s: \n %s", user.getUsername(), user.getUserLists().get(0).getName(), user.getUserLists().get(0).getItems().get(0).getText()));

*/
/*        user.setEmail("ellinor@dummyemail.com");
        user.setUsername("Ellinor");
        user.setPassword("pw");
        user.setId(1L);
        repository.save(user);*/

    }


}
