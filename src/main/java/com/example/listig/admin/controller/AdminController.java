package com.example.listig.admin.controller;

import com.example.listig.admin.AdminService;
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
        return ResponseEntity.accepted().body(stats);
    }

public record Stats(Long users, Long lists, Long items, Long sharedLists){

}
}
