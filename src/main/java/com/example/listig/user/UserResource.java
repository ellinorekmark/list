
package com.example.listig.user;


import com.example.listig.lists.ListDto;
import com.example.listig.exceptions.ErrorResponce;
import com.example.listig.exceptions.InvalidPasswordException;
import com.example.listig.exceptions.UserCreationException;
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
        UserDto user = userService.getUser(userAuth);
        return ResponseEntity.ok().body(user);
    }

    @PostMapping("/newAccount")
    ResponseEntity<Object> addUser(@RequestBody CreateUserDto user){
        try {
            UserDto createdUser = userService.createUser(user);
            return ResponseEntity.ok().body(createdUser);
        } catch (InvalidPasswordException | UserCreationException e) {
            return ResponseEntity.badRequest().body(new ErrorResponce("error", e.getMessage()));
        }

    }

    @GetMapping("/requests/")
    ResponseEntity<List<ListDto>>getLists(){
        return ResponseEntity.ok().body(null);
    }







}

