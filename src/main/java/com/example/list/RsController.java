
package com.example.list;


import com.example.list.dto.UserDto;
import com.example.list.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api")
public class RsController {
    private static final Logger logger = Logger.getLogger(RsController.class.getName());

    @Autowired
    UserService userService;




    @GetMapping("/user/{username}")
    ResponseEntity<UserDto> getUser(@PathVariable String username){
        return ResponseEntity.ok().body(new UserDto());
    }

    @PostMapping("/user")
    ResponseEntity<UserDto> addUser(@RequestBody UserDto user){

        return ResponseEntity.ok().body(user);
    }

    @DeleteMapping("/user/{username}")
    ResponseEntity removeUser(@PathVariable String username){
        userService.delete(username);
        return ResponseEntity.ok().build();
    }




}

