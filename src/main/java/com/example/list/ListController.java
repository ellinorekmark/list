package com.example.list;

import com.example.list.dao.User;
import com.example.list.model.CreateUser;
import com.example.list.service.AccountMissingException;
import com.example.list.service.EmailExistsException;
import com.example.list.service.InvalidPasswordException;
import com.example.list.service.UserService;
import jakarta.annotation.PostConstruct;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ListController {
    @Autowired
    UserService userService;


    @GetMapping("/")
    String homepage(Model m)  {
        if(userService.isLoggedIn()){
            m.addAttribute("user", userService.getUser());
        }
        return "startPageTemplate";
    }

    @GetMapping("/login")
    String login(Model m){
        m.addAttribute("newUser", new CreateUser());
        return "loginTemplate";
    }
    @PostMapping("/login")
    String loginUser(Model m, CreateUser userLogin){
        try{
            User user  = userService.login(userLogin.getEmail(), userLogin.getPassword());
            m.addAttribute("user",user);
            return "homePageTemplate";
        } catch (AccountMissingException e) {
            m.addAttribute("error","No account associated with email.");
            return "loginTemplate";
        } catch (InvalidPasswordException e) {
            m.addAttribute("error","Invalid password");
            return "loginTemplate";
        }
    }
    @GetMapping("/createAccount")
    String createAccountPage(Model m){
        m.addAttribute("newUser", new CreateUser());
        return "createAccountTemplate";
    }

    @PostMapping("/createAccount")
    String newAccount(Model m, @Valid CreateUser createUser){
        try {
            User user  = userService.createAccount(createUser);
            m.addAttribute("user", user);
            return "homePageTemplate";
        } catch (EmailExistsException e) {
            m.addAttribute("There is already an account associated with that email.");
            return "createAccountTemplate";
        }
    }


}
