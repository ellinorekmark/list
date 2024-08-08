package com.example.listig.lists;

import com.example.listig.lists.entities.ListItem;
import com.example.listig.lists.entities.UserList;

import java.util.List;

public class ListDto {
    UserList listInfo;
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

    public UserList getListInfo() {
        return listInfo;
    }

    public void setListInfo(UserList listInfo) {
        this.listInfo = listInfo;
    }

    public List<ListItem> getItems() {
        return items;
    }

    public void setItems(List<ListItem> items) {
        this.items = items;
    }


}
