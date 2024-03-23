package com.example.list;

import com.example.list.dao.UserDAO;
import com.example.list.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;
import java.util.List;

@Controller
public class ListController {
    Collection<String> accountPages = List.of("Account","New List");
    Collection<String> lists = List.of("List1", "List2", "List3");

    @Autowired
    UserService userService;

    UserDAO user;


    @GetMapping("/")
    String homepage(Model m){
        m.addAttribute("accountPages", accountPages);
        m.addAttribute("lists", lists);
        return "startPageTemplate";
    }


}
