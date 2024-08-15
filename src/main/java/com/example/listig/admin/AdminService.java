package com.example.listig.admin;

import com.example.listig.admin.controller.AdminController;
import com.example.listig.lists.repositories.ListItemRepository;
import com.example.listig.lists.repositories.UserListRepository;
import com.example.listig.user.UserDto;
import com.example.listig.user.UserService;
import com.example.listig.user.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    UserService userService;
    @Autowired
    ListItemRepository listItemRepository;
    @Autowired
    UserListRepository listRepository;


    public Long userCount() {
        return userRepository.count();
    }
    public Long listCount() {
        return listRepository.count();
    }

    public Long itemCount() {
        return listItemRepository.count();
    }

    public AdminController.Stats getStats(){
        Long userCount = userCount();
        Long listCount = listCount();
        Long itemCount = itemCount();
        Long shared = (long) listRepository.countSharedLists().size();
        return new AdminController.Stats(userCount,listCount,itemCount,shared);
    }


    public UserDto resetPassword(AdminController.ResetPassword resetInfo) throws Exception {
        return userService.renewPassword(resetInfo.username(), resetInfo.password());
    }
}
