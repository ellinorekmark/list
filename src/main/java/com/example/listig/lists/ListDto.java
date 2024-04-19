package com.example.listig.lists;

import com.example.listig.lists.entities.ListItem;
import com.example.listig.lists.entities.UserList;

import java.util.List;

public class ListDto {
    UserList list;
    private List<String> owners;
    private List<String> viewers;
    private List<ListItem> items;

    public ListDto() {
    }

    public List<String> getOwners() {
        return owners;
    }

    public void setOwners(List<String> owners) {
        this.owners = owners;
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
