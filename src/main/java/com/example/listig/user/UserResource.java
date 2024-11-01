
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

    UserService userService;

    @Autowired
    public UserResource(UserService userService) {
        this.userService = userService;
    }

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

    @PostMapping("/userExists")
    ResponseEntity<Boolean> checkIfUserExists(@RequestBody Username username){
        Boolean exists = userService.doesUserExist(username.username);
        if(exists){
            return ResponseEntity.ok(true);
        }
        else{
            return ResponseEntity.ok(false);
        }
    }

    @PostMapping("/newPassword")
    ResponseEntity<UserDto> renewPassword(@RequestBody Password pw){
        try{
            UserDto updatedUser = userService.renewPassword(AuthUtil.getUserName(), pw.password());
            return ResponseEntity.ok(updatedUser);
        }
        catch(Exception e){
            return ResponseEntity.badRequest().build();
        }
    }

    public record Username(String username) {}
    public record Password(String password){}

}

