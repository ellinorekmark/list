package com.example.list.dto;

import com.example.list.ListType;

public class ItemDto {
    Long listId;
    String text;
    ListType type;
    String status;

    public ItemDto() {
    }

    public ItemDto(ListType type) {
        this.type = type;
        status = setDefaultStatus(type);
    }

    public ItemDto(Long id) {
        this.listId = id;
    }

    private String setDefaultStatus(ListType type) {
        switch(type){
            case CHECK -> {
                return "false";
            }
            case COLOR -> {
                return "white";
            }
            default -> {
                return null;
            }
        }
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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

    public Long getListId() {
        return listId;
    }

    public void setListId(Long listId) {
        this.listId = listId;
    }

}
