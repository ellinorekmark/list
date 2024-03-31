
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
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class RsController {/*
    @Autowired
    UserService userService;
    @Autowired
    ListService listService;

    private static final Logger logger = Logger.getLogger( RsController.class.getName() );


    @GetMapping("/")
    Response homepage(Model m)  {
        if(userService.isLoggedIn()){
            addUserDetails(m);
        }
        return new Response();
    }

    private void addUserDetails(Model m) {
        m.addAttribute("loggedIn", userService.isLoggedIn());
        m.addAttribute("username", userService.getUsername());
        m.addAttribute("email", userService.getEmail());
        m.addAttribute("lists", userService.getLists());
    }

    @GetMapping("/login")
    String login(Model m){
        if(userService.isLoggedIn()){
            addUserDetails(m);
            return HOME;
        }
        m.addAttribute("userLogin", new UserDto());
        return LOGIN;
    }
    @PostMapping("/login")
    String loginUser(Model m, UserDto userLogin){
        try{
            User user  = userService.login(userLogin.getEmail(), userLogin.getPassword());
            addUserDetails(m);
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
        if(userService.isLoggedIn()){
            addUserDetails(m);
            return HOME;
        }
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

    @GetMapping("/list")
    String list(Model m){
        if(!userService.isLoggedIn()){
            return HOME;
        }
        addUserDetails(m);
        m.addAttribute("newList", new ListDto());
        m.addAttribute("listTypes", ListType.values());

        return CREATE_LIST;
    }

    @PostMapping("/list")
    String createList(Model m, @Valid @ModelAttribute("newList") ListDto newList, BindingResult br){
        if(!userService.isLoggedIn()){
            return HOME;
        }
        addUserDetails(m);
        if(br.hasErrors()){
            m.addAttribute("listTypes", ListType.values());
            return CREATE_LIST;
        }

        UserList createdList = userService.addList(newList);
        logger.log(Level.INFO,"createdList has id: "+createdList.getId());
        editListAttributes(m, createdList);

        return VIEW_LIST;
    }

    @PostMapping("/list/{id}")
    String addToList(Model m,@PathVariable Long id, @Valid @ModelAttribute("newItem") ItemDto item, @ModelAttribute("list")UserList list, BindingResult br){
        logger.log(Level.INFO,"modelAttribute list haas id "+list.getId());
        logger.log(Level.INFO,"modelAttribute item haas id "+item.getListId());

        if(!userService.isLoggedIn()){
            return HOME;
        }
        addUserDetails(m);
        if(br.hasErrors()){
            return VIEW_LIST;
        }
        list = userService.addToList(list, item);
        editListAttributes(m, list);

        return VIEW_LIST;
    }

    @GetMapping("/list/{id}")
    String getViewList(Model m, @PathVariable Long id){
        if(!userService.isLoggedIn()){
            return HOME;
        }
        addUserDetails(m);
        editListAttributes(m, userService.getList(id));
        return VIEW_LIST;
    }

    private void editListAttributes(Model m, UserList list) {
        m.addAttribute("list", list);
        m.addAttribute("newItem", new ItemDto(list.getId()));
    }*/

}

