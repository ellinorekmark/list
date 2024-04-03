package com.example.list.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @DeleteMapping("/delete/user/{id}")
    void deleteUser(@PathVariable Long id){
        //delete user
    }
    @GetMapping("/stats")
    ResponseEntity<Object> getStats(){
        //get and return stats
        //Get app wide stats, like how many users, how many total lists
        return null;
    }



}
