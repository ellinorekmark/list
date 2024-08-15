package com.example.listig.admin.controller;

import com.example.listig.admin.AdminService;
import com.example.listig.user.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    AdminService adminService;

    @GetMapping()
    ResponseEntity<Object> getStats() {

        Stats stats = adminService.getStats();
        return ResponseEntity.ok().body(stats);
    }


    @PostMapping("/resetPassword")
    ResponseEntity<UserDto> resetPassword(@RequestBody ResetPassword resetInfo){
        try{
            UserDto updated = adminService.resetPassword(resetInfo);
            return ResponseEntity.ok(updated);
        }
        catch(Exception e){
            return ResponseEntity.badRequest().build();
        }

    }

public record Stats(Long users, Long lists, Long items, Long sharedLists){
}
public record ResetPassword(String username, String password){}
}
