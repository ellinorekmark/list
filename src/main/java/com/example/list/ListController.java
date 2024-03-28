package com.example.list;

import com.example.list.dao.User;
import com.example.list.service.UserService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ListController {

    Collection<String> lists = List.of("List1", "List2", "List3");

    @Autowired
    UserService userService;

    User user;




    @GetMapping("/")
    String homepage(Model m){
        if(user!=null){
            m.addAttribute("user", user);
        }
        return "startPageTemplate";
    }

    @GetMapping("/login")
    String login(Model m){
        return "loginTemplate";
    }
    @GetMapping("/createAccount")
    String createAccountPage(Model m){
        return "createAccountTemplate";
    }


}
