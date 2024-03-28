package com.example.list;

import com.example.list.dao.User;
import com.example.list.dao.UserList;
import com.example.list.model.CreateList;
import com.example.list.model.SimpleUser;
import com.example.list.model.ListType;
import com.example.list.service.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebController {
    @Autowired
    UserService userService;
    @Autowired
    ListService listService;

    private final static String HOME = "startPageTemplate";
    private final static String LOGIN = "loginTemplate";
    private final static String CREATE_USER = "createAccountTemplate";
    private final static String VIEW_LIST = "viewListTemplate";
    private final static String CREATE_LIST = "createListTemplate";




    @GetMapping("/")
    String homepage(Model m)  {
        if(userService.isLoggedIn()){
            m.addAttribute("user", userService.getUser());
        }
        return HOME;
    }

    @GetMapping("/login")
    String login(Model m){
        m.addAttribute("userLogin", new SimpleUser());
        return LOGIN;
    }
    @PostMapping("/login")
    String loginUser(Model m, SimpleUser userLogin){
        try{
            User user  = userService.login(userLogin.getEmail(), userLogin.getPassword());
            m.addAttribute("user",user);
            return HOME;
        } catch (AccountMissingException e) {
            m.addAttribute("error","No account associated with email.");
        } catch (InvalidPasswordException e) {
            m.addAttribute("error","Invalid password");
        }
        m.addAttribute("userLogin", new SimpleUser());
        return LOGIN;
    }
    @GetMapping("/createAccount")
    String createAccountPage(Model m){
        m.addAttribute("newUser", new SimpleUser());
        return CREATE_USER;
    }

    @PostMapping("/createAccount")
    String newAccount(Model m, @Valid SimpleUser simpleUser){
        try {
            User user  = userService.createAccount(simpleUser);
            m.addAttribute("user", user);
            return HOME;
        } catch (EmailExistsException e) {
            m.addAttribute("There is already an account associated with that email.");
            return CREATE_USER;
        }
    }

    @GetMapping("/createList")
    String list(Model m){
        m.addAttribute("list", new CreateList());
        m.addAttribute("listTypes", ListType.values());

        return CREATE_LIST;
    }

    @PostMapping("/createList")
    String createList(Model m, @Valid CreateList createList){
        UserList list = userService.addList(createList);
        m.addAttribute("list",list);

        return VIEW_LIST;
    }

}
