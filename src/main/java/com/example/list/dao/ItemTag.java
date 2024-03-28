package com.example.list.dao;

import jakarta.persistence.*;

@Entity
@Table(name = "item_tags")
public class ItemTag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "list_item_id")
    private Long listItemId;

    @Column(nullable = false)
    private String tag;

    @Column
    private String value;

    public ItemTag() {
    }

    public ItemTag(String tag, String value) {
        this.tag = tag;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Long getListItemId() {
        return listItemId;
    }

    public void setListItemId(Long listItemId) {
        this.listItemId = listItemId;
    }
}
