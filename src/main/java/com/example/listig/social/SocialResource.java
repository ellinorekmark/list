package com.example.listig.social;

import com.example.listig.AuthUtil;
import com.example.listig.social.entities.Friends;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/social")public class SocialResource {

    @Autowired
    SocialService service;

    @GetMapping()
    ResponseEntity<List<Friends>> getFriends(){
    List<Friends> friends = service.getFriends(AuthUtil.getUserName());
    return ResponseEntity.ok().body(friends);
    }

    @PostMapping("/sendFriendRequest/{username}")
    ResponseEntity<Object> sendFriendRequest(@PathVariable("username")String user){
        try {
            Friends request = service.sendFriendRequest(AuthUtil.getUserName(), user);
            return ResponseEntity.ok().body(request);

        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }

    }
    @PostMapping("/acceptRequest/{username}")
    ResponseEntity<Object> acceptFriendRequest(@PathVariable("username") String user){
        try{
            Friends friends = service.acceptRequest(AuthUtil.getUserName(), user);
            return ResponseEntity.ok().body(friends);
        }
        catch(Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    @PostMapping("/rejectRequest/{username}")
    ResponseEntity<Object> rejectFriendrequest(@PathVariable("username") String user){
        service.rejectFriend(AuthUtil.getUserName(), user);
        return ResponseEntity.ok().build();
    }
}
