package com.example.list.dto;

import jakarta.validation.constraints.NotBlank;

public class ListDto {
    @NotBlank(message = "Please give your list a name.")
    private String name;
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

    public void setType(String type) {
        this.type = type;
    }
}
