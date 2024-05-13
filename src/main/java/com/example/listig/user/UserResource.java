
package com.example.listig.user;


import com.example.listig.AuthUtil;
import com.example.listig.exceptions.ExceptionResponse;
import com.example.listig.exceptions.InvalidPasswordException;
import com.example.listig.exceptions.UserCreationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserResource {

    @Autowired
    UserService userService;

    @GetMapping()
    ResponseEntity<UserDto> getUser() {
        UserDto user = userService.getUser(AuthUtil.getUserName());
        return ResponseEntity.ok().body(user);
    }

    @PostMapping("/newAccount")
    ResponseEntity<Object> addUser(@RequestBody CreateUserDto user) {
        try {
            UserDto createdUser = userService.createUser(user);
            return ResponseEntity.ok().body(createdUser);
        } catch (InvalidPasswordException | UserCreationException e) {
            return ResponseEntity.badRequest().body(new ExceptionResponse(e.getMessage()));
        }
    }

}

