
package com.example.list;


import com.example.list.dto.ListDto;
import com.example.list.dto.UserDto;
import com.example.list.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api")
public class RsController {
    private static final Logger logger = Logger.getLogger(RsController.class.getName());

    @Autowired
    UserService userService;

    @GetMapping("/user/")
    ResponseEntity<UserDto> getUser(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String userAuth = authentication.getName();
        return ResponseEntity.ok().body(new UserDto(userAuth,"user@email.com","pass"));
    }

    @PostMapping("/user")
    ResponseEntity<UserDto> addUser(@RequestBody UserDto user){

        return ResponseEntity.ok().body(user);
    }

    @GetMapping("/lists/")
    ResponseEntity<List<ListDto>>getLists(){
        userService.getLists();
        return ResponseEntity.ok().body(null);
    }

    @GetMapping("/list/{id}")
    ResponseEntity<ListDto>getList(@PathVariable Long id){

        return ResponseEntity.ok().body(null);
    }




}

