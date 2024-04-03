
package com.example.list.resources;


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
@RequestMapping("/api/user")
public class UserResource {
    private static final Logger logger = Logger.getLogger(UserResource.class.getName());

    @Autowired
    UserService userService;

    @GetMapping()
    ResponseEntity<UserDto> getUser(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String userAuth = authentication.getName();
/*        logger.log(Level.INFO,"Credentials! "+authentication.getCredentials().toString() );
        logger.log(Level.INFO,"Details!! "+authentication.getDetails().toString() );*/
        return ResponseEntity.ok().body(new UserDto(userAuth,"user@email.com","pass"));
    }

    @PostMapping()
    ResponseEntity<UserDto> addUser(@RequestBody UserDto user){

        return ResponseEntity.ok().body(user);
    }

    @GetMapping("/requests/")
    ResponseEntity<List<ListDto>>getLists(){
        return ResponseEntity.ok().body(null);
    }

    @GetMapping("/list/{id}")
    ResponseEntity<ListDto>getList(@PathVariable Long id){

        return ResponseEntity.ok().body(null);
    }




}

