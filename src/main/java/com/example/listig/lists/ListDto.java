package com.example.listig.lists;

import com.example.listig.lists.entities.ListItem;
import com.example.listig.lists.entities.UserList;

import java.util.List;

public class ListDto {
    UserList list;
    private String owner;
    private List<String> editors;
    private List<String> viewers;
    private List<ListItem> items;

    public ListDto() {
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<String> getEditors() {
        return editors;
    }

    public void setEditors(List<String> editors) {
        this.editors = editors;
    }

    public List<String> getViewers() {
        return viewers;
    }

    public void setViewers(List<String> viewers) {
        this.viewers = viewers;
    }

    public UserList getList() {
        return list;
    }

    public void setList(UserList list) {
        this.list = list;
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
    public void updateItem(ListItem item){
        for (int i = 0; i < items.size(); i++) {
            ListItem listItem = items.get(i);
            if (listItem.getId().equals(item.getId())) {
                items.set(i, item);
                break;
            }
        }
    }
    public void removeItem(ListItem item){
        items.remove(item);
    }

}
