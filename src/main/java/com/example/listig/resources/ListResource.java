package com.example.listig.resources;

import com.example.listig.dto.ListDto;
import com.example.listig.dto.UserDto;
import com.example.listig.service.ListService;
import com.example.listig.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/list")
public class ListResource {

    @Autowired
    ListService listService;

    @GetMapping()
    ResponseEntity<List<ListDto>> getAllUserLists(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String userAuth = authentication.getName();
        List<ListDto> lists = listService.getAllListsFromUser(userAuth);
        return ResponseEntity.ok().body(lists);
    }
    @GetMapping("/{id}")
    ResponseEntity<ListDto> getSpecificListFromUser(@PathVariable("id") Long id){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        try {
            ListDto dto = listService.getListFromUser(username, id);
            return ResponseEntity.ok(dto);

        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
}
