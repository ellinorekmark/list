package com.example.listig.dao;

import com.example.listig.dto.UserDto;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


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
    private LocalDate birthday;

    @Column(nullable = false)
    private String pwHash;

    @Column(nullable = false)
    private LocalDateTime memberSince;

    @Column(nullable = false)
    private boolean anonymousDataAllowed;

    @Column
    private boolean activeAccount;

    @OneToMany(mappedBy = "user_id", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<UserRoles> roles;

    @ElementCollection
    @CollectionTable(name = "user_lists", joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "list_id")
    private List<Long> listIds;

    public LUser() {

    }
    public LUser(UserDto dto) {
    this.username = dto.getUsername();
    this.email = dto.getEmail();
    this.birthday = dto.getBirthday();
    this.anonymousDataAllowed = dto.isAnonymous_data_allowed();
    }


    public LUser(Long id, String email, String username, LocalDate birthday, String pwHash, boolean anonymousData, List<UserRoles> roles) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.birthday = birthday;
        this.pwHash = pwHash;
        this.anonymousDataAllowed = anonymousData;
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

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
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

    public boolean isAnonymousDataAllowed() {
        return anonymousDataAllowed;
    }

    public void setAnonymousDataAllowed(boolean anonymousData) {
        this.anonymousDataAllowed = anonymousData;
    }

    public boolean isActiveAccount() {
        return activeAccount;
    }

    public void setActiveAccount(boolean activeAccount) {
        this.activeAccount = activeAccount;
    }

    public List<UserRoles> getRoles() {
        return roles;
    }

    public void setRoles(List<UserRoles> roles) {
        this.roles = roles;
    }

    public List<Long> getListIds() {
        return listIds;
    }

    public void setListIds(List<Long> listIds) {
        this.listIds = listIds;
    }
}