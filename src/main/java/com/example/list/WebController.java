package com.example.list;

import com.example.list.dao.User;
import com.example.list.dao.UserList;
import com.example.list.exceptions.AccountMissingException;
import com.example.list.exceptions.EmailExistsException;
import com.example.list.exceptions.InvalidPasswordException;
import com.example.list.dto.ItemDto;
import com.example.list.dto.ListDto;
import com.example.list.dto.UserDto;
import com.example.list.service.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
        m.addAttribute("userLogin", new UserDto());
        return LOGIN;
    }
    @PostMapping("/login")
    String loginUser(Model m, UserDto userLogin){
        try{
            User user  = userService.login(userLogin.getEmail(), userLogin.getPassword());
            m.addAttribute("user",user);
            return HOME;
        } catch (AccountMissingException e) {
            m.addAttribute("error","No account associated with email.");
        } catch (InvalidPasswordException e) {
            m.addAttribute("error","Invalid password");
        }
        m.addAttribute("userLogin", new UserDto());
        return LOGIN;
    }
    @GetMapping("/createAccount")
    String createAccountPage(Model m){
        m.addAttribute("newUser", new UserDto());
        return CREATE_USER;
    }

    @PostMapping("/createAccount")
    String newAccount(Model m, @Valid @ModelAttribute("newUser") UserDto newUser, BindingResult br){
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
        m.addAttribute("newList", new ListDto());
        m.addAttribute("listTypes", ListType.values());

        return CREATE_LIST;
    }

    @PostMapping("/createList")
    String createList(Model m, @Valid @ModelAttribute("newList") ListDto newList, BindingResult br){
        if(br.hasErrors()){
            m.addAttribute("listTypes", ListType.values());
            return CREATE_LIST;
        }

        UserList createdList = userService.addList(newList);
        editListAttributes(m, createdList);

        return VIEW_LIST;
    }

    private void editListAttributes(Model m, UserList list) {
        m.addAttribute("list", list);
        m.addAttribute("newItem", new ItemDto(list.getType()));
    }

}
