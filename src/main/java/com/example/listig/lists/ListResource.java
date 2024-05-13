package com.example.listig.lists;

import com.example.listig.AuthUtil;
import com.example.listig.exceptions.ExceptionResponse;
import com.example.listig.lists.entities.ListItem;
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
    ResponseEntity<List<ListDto>> getAllUserLists() {
        List<ListDto> lists = listService.getAllListsFromUser(AuthUtil.getUserName());

        return ResponseEntity.ok(lists);
    }

    @GetMapping("/{id}")
    ResponseEntity<Object> getSpecificListFromUser(@PathVariable("id") Long id) {
        ListDto list;
        try {
            list = listService.getListFromUser(id, AuthUtil.getUserName());
            return ResponseEntity.ok(list);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new ExceptionResponse(e.getMessage()));
        }

    }

    @PostMapping()
    ResponseEntity<Object> createOrUpdateList(@RequestBody ListDto list) {
        try {
            list = listService.createOrUpdateList(AuthUtil.getUserName(), list);
            return ResponseEntity.ok(list);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new ExceptionResponse(e.getMessage()));
        }
    }

    @DeleteMapping()
    ResponseEntity<Object> deleteList(@RequestBody Long list) {
        try {
            listService.deleteList(AuthUtil.getUserName(), list);
            List<ListDto> all = listService.getAllListsFromUser(AuthUtil.getUserName());
            return ResponseEntity.ok().body(all);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new ExceptionResponse(e.getMessage()));
        }
    }

    @DeleteMapping("/item")
    ResponseEntity<Object> deleteItem(@RequestBody ListItem item) {
        try {
            ListDto updatedList = listService.deleteItem(AuthUtil.getUserName(), item);
            return ResponseEntity.ok().body(updatedList);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new ExceptionResponse(e.getMessage()));
        }
    }

    @PostMapping("/invite")
    ResponseEntity<Object> inviteToList(@RequestBody Invitation invitation) {
        if (userOwnsList(invitation.listId())) {
            try {
                ListDto updatedList = listService.addUserToList(invitation.listId(), invitation.user(), invitation.role);
                return ResponseEntity.accepted().body(updatedList);
            } catch (Exception e) {
                return ResponseEntity.badRequest().body(new ExceptionResponse(e.getMessage()));
            }
        } else {
            return ResponseEntity.badRequest().body(new ExceptionResponse("You are not authorized to invite users to this list"));
        }

    }

    @PostMapping("/removeUser")
        ResponseEntity<Object> removeUserFromList(@RequestBody RemoveUser removeUser){
        if(removeUser.user.equals(AuthUtil.getUserName()) || userOwnsList(removeUser.listId())){
            ListDto updatedList;
            try {
                updatedList = listService.removeUserFromList(removeUser);
            } catch (Exception e) {
                return ResponseEntity.badRequest().body(new ExceptionResponse(e.getMessage()));
            }
            return ResponseEntity.ok().body(updatedList);
        }
        else{
            return ResponseEntity.badRequest().body(new ExceptionResponse("Unauthorized"));
        }
    }


    private boolean userOwnsList(Long listId) {
        return listService.userOwnsList(AuthUtil.getUserName(), listId);
    }

    public record Invitation(Long listId, String user, ListRole role) {
    }
    public record RemoveUser(Long listId, String user){}

}
