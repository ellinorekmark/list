package com.example.listig.lists.entities;


import com.example.listig.lists.ListType;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "user_lists")
@SuppressWarnings("unused")
public class UserList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String listName;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ListType type;

    @Column
    private String listDesc;

    @Column
    private LocalDateTime createdAt;

    @Column
    private LocalDateTime lastEdited;

    public UserList() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public ListType getType() {
        return type;
    }

    public void setType(ListType type) {
        this.type = type;
    }

    public String getListDesc() {
        return listDesc;
    }

    public void setListDesc(String listDesc) {
        this.listDesc = listDesc;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getLastEdited() {
        return lastEdited;
    }

    public void setLastEdited(LocalDateTime lastEdited) {
        this.lastEdited = lastEdited;
    }
}
