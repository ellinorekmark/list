package com.example.listig.dto;

import com.example.listig.ListType;

public class ItemDto {
    String item;
    ListType type;
    String status;

    public ItemDto() {
    }

    public ItemDto(ListType type) {
        this.type = type;
        status = setDefaultStatus(type);
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

    public String getItem() {
        return item;
    }


    public void setItem(String item) {
        this.item = item;
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
