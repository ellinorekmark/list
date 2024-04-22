package com.example.listig.lists;

import com.example.listig.AuthUtil;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/list")
public class ListResource {

    @Autowired
    ListService listService;

    @GetMapping()
    ResponseEntity<List<ListDto>> getAllUserLists(){
        List<ListDto> lists = listService.getAllListsFromUser(AuthUtil.getUserName());

        return ResponseEntity.ok(lists);
    }
    @GetMapping("/{id}")
    ResponseEntity<ListDto> getSpecificListFromUser(@PathVariable("id") Long id){
        ListDto list;
        try {
            list = listService.getListFromUser(id, AuthUtil.getUserName());
            return ResponseEntity.ok(list);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }

    }

    @PostMapping()
    ResponseEntity<ListDto> createOrUpdateList(@RequestBody @Valid ListDto list){
        try{
            list = listService.createOrUpdateList(AuthUtil.getUserName(), list);
            return ResponseEntity.ok(list);
        }
        catch(Exception e){

            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping()
    ResponseEntity<String> deleteList(@RequestBody Long list){
        try{
            listService.deleteList(AuthUtil.getUserName(), list);
            return ResponseEntity.ok().build();
        }
        catch(Exception e){
            return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping("/invite")
    ResponseEntity<Object> inviteToList(@RequestBody Invitation invitation){
        if(userOwnsList(invitation.listId())){
            try {
                listService.addUserToList(invitation.listId(), invitation.user(), invitation.role);
                return ResponseEntity.accepted().build();
            } catch (Exception e) {
                return ResponseEntity.badRequest().body(e.getMessage());
            }
        }
        else{
            return ResponseEntity.badRequest().body("User does not own list.");
        }

    }

    private boolean userOwnsList(Long listId) {
        return listService.userOwnsList(AuthUtil.getUserName(),listId);
    }

     public record Invitation(Long listId, String user, ListRole role){}

}
