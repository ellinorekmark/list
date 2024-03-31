package com.example.list.dto;

import jakarta.validation.constraints.NotBlank;

import java.util.List;

public class ListDto {
    @NotBlank(message = "Please give your list a name.")
    private String name;

    private String description;

    //TODO: create validation for list types
    private String type;


    public ListDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }
    List<ItemDto> items;

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
