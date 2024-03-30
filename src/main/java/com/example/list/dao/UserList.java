package com.example.list.dao;


import com.example.list.ListType;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "user_lists")
public class UserList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long userId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ListType type;

    @OneToMany(mappedBy = "listId", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ListItem> items;

    public UserList() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListType getType() {
        return type;
    }

    public void setType(ListType type) {
        this.type = type;
    }
    public void setType(String type){
        this.type = ListType.valueOf(type.toUpperCase());
    }

    public List<ListItem> getItems() {
        return items;
    }

    public void setItems(List<ListItem> items) {
        this.items = items;
    }
    public void addItem(ListItem item){
        items.add(item);
    }
}
