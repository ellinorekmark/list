package com.example.list.dao;

import com.example.list.dto.UserDto;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "users")
public class ListUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String username;

    @OneToMany(mappedBy = "userId", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<UserList> userLists;

    public ListUser() {
        userLists = new ArrayList<>();
    }

    public ListUser(String email, String username, String passwordHash) {
        this.email = email;
        this.username = username;
        this.password = passwordHash;
    }

    public ListUser(UserDto user) {
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.username = user.getUsername();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<UserList> getLists() {
        return userLists;
    }

    public void setUserLists(List<UserList> userLists) {
        this.userLists = userLists;
    }
    public void addList(UserList list){
        userLists.add(list);
    }

    public String getRole() {
        return "USER";
    }
}
