package com.example.listig.social.entities;

import java.io.Serializable;

public class FriendsId implements Serializable {

    private Long userAId;
    private Long userBId;

    public FriendsId() {
    }

    public FriendsId(Long userA, Long userB) {
        this.userAId = userA;
        this.userBId = userB;
    }

    public Long getUserAId() {
        return userAId;
    }

    public void setUserAId(Long userAId) {
        this.userAId = userAId;
    }

    public Long getUserBId() {
        return userBId;
    }

    public void setUserBId(Long userBId) {
        this.userBId = userBId;
    }
}
