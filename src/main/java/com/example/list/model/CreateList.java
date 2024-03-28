package com.example.list.model;

import jakarta.validation.constraints.NotBlank;

public class CreateList {
    @NotBlank
    private String name;
    //TODO: create validation for list types
    @NotBlank
    private String type;


    public CreateList() {
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
