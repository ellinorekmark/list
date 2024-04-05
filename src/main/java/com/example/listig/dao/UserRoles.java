package com.example.listig.dao;

import jakarta.persistence.*;


@Entity
@Table(name = "user_roles")
public class UserRoles {
    @Id
    private Long id;
    private Long userId;

    @Column
    private String accountRole;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private LUser user;

    public UserRoles() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getAccountRole() {
        return accountRole;
    }

    public void setAccountRole(String accountRole) {
        this.accountRole = accountRole;
    }

    public LUser getUser() {
        return user;
    }

    public void setUser(LUser user) {
        this.user = user;
    }
}
