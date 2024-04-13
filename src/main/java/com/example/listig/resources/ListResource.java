package com.example.listig.resources;

import com.example.listig.dto.ListDto;
import com.example.listig.service.ListService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/list")
public class ListResource {

    @Autowired
    ListService listService;

    @GetMapping()
    ResponseEntity<List<ListDto>> getAllUserLists(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        List<ListDto> lists = listService.getAllListsFromUser(username);

        return ResponseEntity.ok(lists);
    }
    @GetMapping("/{id}")
    ResponseEntity<ListDto> getSpecificListFromUser(@PathVariable("id") Long id){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        ListDto list = null;
        try {
            list = listService.getListFromUser(id, username);
            return ResponseEntity.ok(list);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }

    }

    @PostMapping()
    ResponseEntity<ListDto> createOrUpdateList(@RequestBody @Valid ListDto list){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        try{
            list = listService.createOrUpdateList(username, list);
            return ResponseEntity.ok(list);
        }
        catch(Exception e){

            return ResponseEntity.badRequest().build();
        }
    }
}
