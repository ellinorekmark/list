
package com.example.listig.resources;


import com.example.listig.dto.ListDto;
import com.example.listig.dto.UserDto;
import com.example.listig.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api/user")
public class UserResource {
    private static final Logger logger = Logger.getLogger(UserResource.class.getName());

    @Autowired
    UserService userService;

    @GetMapping()
    ResponseEntity<UserDto> getUser(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String userAuth = authentication.getName();
        return ResponseEntity.ok().body(new UserDto());
    }

    @PostMapping()
    ResponseEntity<UserDto> addUser(@RequestBody UserDto user){

        return ResponseEntity.ok().body(user);
    }

    @GetMapping("/requests/")
    ResponseEntity<List<ListDto>>getLists(){
        return ResponseEntity.ok().body(null);
    }







}

