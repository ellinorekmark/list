package com.example.listig.admin;

import com.example.listig.admin.controller.AdminController;
import com.example.listig.lists.repositories.ListItemRepository;
import com.example.listig.lists.repositories.UserListRepository;
import com.example.listig.user.UserDto;
import com.example.listig.user.UserService;
import com.example.listig.user.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    UserRepository userRepository;
    UserService userService;
    ListItemRepository listItemRepository;
    UserListRepository listRepository;

    @Autowired
    public AdminService(UserRepository userRepository, UserService userService, ListItemRepository listItemRepository, UserListRepository listRepository) {
        this.userRepository = userRepository;
        this.userService = userService;
        this.listItemRepository = listItemRepository;
        this.listRepository = listRepository;
    }

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

    public List<UserDto> getAllUsers() {
        return userService.getAllUsers();
    }
    //
}
