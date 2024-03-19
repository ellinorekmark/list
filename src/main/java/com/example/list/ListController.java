package com.example.list;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ListController {


    @GetMapping("/")
    String homepage(Model m){
        return "startPageTemplate";
    }


}
