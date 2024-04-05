package com.example.listig.dao;


import com.example.listig.ListType;
import com.example.listig.dto.ListDto;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "user_lists")
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
    private boolean isPublic;

    @Column
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "listId", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ListItem> items;



    public UserList() {
    }
    public UserList(ListDto list) {
        this.id = list.getId();
        this.listName = list.getName();
        this.type = ListType.valueOf(list.getType());
        this.listDesc = list.getDescription();
        this.isPublic = list.isPublic();
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

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public List<ListItem> getItems() {
        return items;
    }

    public void setItems(List<ListItem> items) {
        this.items = items;
    }


}
