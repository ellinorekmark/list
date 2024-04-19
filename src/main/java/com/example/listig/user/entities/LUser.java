package com.example.listig.user.entities;

import com.example.listig.user.UserDto;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


@Entity
@Table(name = "users")
public class LUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String pwHash;

    @Column
    private LocalDateTime memberSince;

    @OneToMany(mappedBy = "userId", fetch = FetchType.EAGER)
    private List<UserRole> roles;

    public LUser() {

    }
    public LUser(UserDto dto) {
    this.username = dto.getUsername();
    this.email = dto.getEmail();
    }


    public LUser(Long id, String email, String username, String pwHash, List<UserRole> roles) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.pwHash = pwHash;
        this.roles = roles;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getPwHash() {
        return pwHash;
    }

    public void setPwHash(String pwHash) {
        this.pwHash = pwHash;
    }

    public LocalDateTime getMemberSince() {
        return memberSince;
    }

    public void setMemberSince(LocalDateTime memberSince) {
        this.memberSince = memberSince;
    }

    public List<UserRole> getRoles() {
        return roles;
    }

    public void setRoles(List<UserRole> roles) {
        this.roles = roles;
    }

}
