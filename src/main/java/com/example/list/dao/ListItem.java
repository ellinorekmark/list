package com.example.list.dao;
import com.example.list.ListType;
import jakarta.persistence.*;


@Entity
@Table(name = "list_items")
public class ListItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Long listId;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ListType type;

    @Column
    private String status;

    @Column
    private String text;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getListId() {
        return listId;
    }

    public void setListId(Long listId) {
        this.listId = listId;
    }

    public ListType getType() {
        return type;
    }

    public void setType(ListType type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

