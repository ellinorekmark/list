package com.example.list.dao;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Entity
@Table(name = "list_items")
public class ListItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Long listId;

    @Column
    private String text;


    @OneToMany(mappedBy = "listItemId", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<ItemTag> itemTags;

    @Transient
    private Map<String,Integer> tags;

    public ListItem() {
        itemTags = new ArrayList<>();
        tags = new HashMap<>();
    }

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

    public List<ItemTag> getItemTags() {
        return itemTags;
    }

    public void setItemTags(List<ItemTag> itemTags) {
        this.itemTags = itemTags;
        tags.clear();
        for (ItemTag itemTag : itemTags) {
            tags.put(itemTag.getTag(), itemTag.getValue());
        }
    }


    public Map<String, Integer> getTags() {
        return tags;
    }

    public Long getListId() {
        return listId;
    }

    public void setListId(Long listId) {
        this.listId = listId;
    }

    public void setTags(Map<String, Integer> tags) {
        this.tags = tags;
    }
    public void addTag(ItemTag tag){
        tags.put(tag.getTag(),tag.getValue());
        itemTags.add(tag);
    }
    public void removeTag(String tag){
        for (ItemTag itemTag : itemTags){
            if(itemTag.getTag().equals(tag)){
                itemTags.remove(itemTag);
            }
        }
    }
}

