package com.example.listig.social.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "friends")
@IdClass(FriendsId.class)
public class Friends {

    @Id
    @Column(name = "userA_id")
    private Long userAId;

    @Id
    @Column(name = "userB_id")
    private Long userBId;

    @Column(name = "request_status")
    private String requestStatus;


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

    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

    public static Friends aRequestsB(Long userAId, Long userBId){
        Friends friends = new Friends();
        friends.setUserAId(userAId);
        friends.setUserBId(userBId);
        friends.setRequestStatus("REQUEST");
        return friends;
    }
}
