package com.example.listig.social;

import com.example.listig.social.entities.Friends;
import com.example.listig.social.entities.FriendsId;
import com.example.listig.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SocialService {

    @Autowired
    SocialRepository repository;
    @Autowired
    UserService userService;


    public Friends sendFriendRequest(String username, String user) throws Exception {
        if(alreadyFriends(username, user)){
            throw new Exception("Already friends");
        }
        Long userB = userService.findUserIdByUsername(user);
        if(userB==null){
            throw new Exception("User does not exist");
        }
        else{
            Long userA = userService.findUserIdByUsername(username);
            return repository.save(Friends.aRequestsB(userA, userB));
            //TODO: send notification to recipient?
            }
        }

    private boolean alreadyFriends(String username, String user) {
        SocialService.friendUsers friendUsers = getFriendUsers(username, user);
        Optional<Friends> optionalFriends = repository.findById(new FriendsId(friendUsers.userA(), friendUsers.userB()));
        return optionalFriends.isPresent();
    }

    public Friends acceptRequest(String username, String user) throws Exception {
        SocialService.friendUsers friendUsers = getFriendUsers(username, user);
        Optional<Friends> optionalFriends = repository.findById(new FriendsId(friendUsers.userA(), friendUsers.userB()));
        if(optionalFriends.isPresent()){
            Friends friends = optionalFriends.get();
            friends.setRequestStatus("Mutual");
            return repository.save(friends);

        }
        else{
            throw new Exception("Friend request doesn't exist.");
        }
    }
    public void rejectFriend(String username, String user){
        SocialService.friendUsers friendUsers = getFriendUsers(username, user);
        Optional<Friends> optionalFriends = repository.findById(new FriendsId(friendUsers.userA(), friendUsers.userB()));
        optionalFriends.ifPresent(friends -> repository.delete(friends));

    }

    private friendUsers getFriendUsers(String username, String user) {
        Long userA = userService.findUserIdByUsername(username);
        Long userB = userService.findUserIdByUsername(user);
        return new friendUsers(userA, userB);
    }

    public List<Friends> getFriends(String username) {
        return repository.findAllByUserId(userService.findUserIdByUsername(username));
    }

    private record friendUsers(Long userA, Long userB) {
    }
}
