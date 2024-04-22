package com.example.listig.social;

import com.example.listig.social.entities.Friends;

public class FriendsDto {

    String friend;
    FriendStatus status;

    public FriendsDto() {
    }

    public FriendsDto(String username, FriendStatus status) {
        this.friend = username;
        this.status = status;
    }

    public String getFriend() {
        return friend;
    }

    public void setFriend(String friend) {
        this.friend = friend;
    }

    public FriendStatus getStatus() {
        return status;
    }

    public void setStatus(FriendStatus status) {
        this.status = status;
    }

    public enum FriendStatus {
        SENT,
        RECEIVED,
        MUTUAL
    }

}
