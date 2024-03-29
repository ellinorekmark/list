package com.example.list;

import com.example.list.dao.User;
import com.example.list.dao.UserList;
import com.example.list.exceptions.AccountMissingException;
import com.example.list.exceptions.EmailExistsException;
import com.example.list.exceptions.InvalidPasswordException;
import com.example.list.simple.SimpleList;
import com.example.list.simple.SimpleUser;
import com.example.list.simple.ListType;
import com.example.list.service.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
    String newAccount(Model m, @Valid @ModelAttribute("newUser") SimpleUser newUser, BindingResult br){
        if(br.hasErrors()){
            return CREATE_USER;
        }
        try {
            User user  = userService.createAccount(newUser);
            m.addAttribute("user", user);
            return HOME;
        } catch (EmailExistsException e) {
            m.addAttribute("error", "There is already an account associated with that email.");

            return CREATE_USER;
        }
    }

    @GetMapping("/createList")
    String list(Model m){
        m.addAttribute("list", new SimpleList());
        m.addAttribute("listTypes", ListType.values());

        return CREATE_LIST;
    }

    @PostMapping("/createList")
    String createList(Model m, @Valid @ModelAttribute("list") SimpleList createList, BindingResult br){
        if(br.hasErrors()){
            return CREATE_LIST;
        }
        UserList list = userService.addList(createList);
        m.addAttribute("list",list);

        return VIEW_LIST;
    }

}
