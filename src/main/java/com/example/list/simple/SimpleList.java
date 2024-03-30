package com.example.list.simple;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class SimpleList {
    @NotBlank(message = "Please give your list a name.")
    private String name;
    //TODO: create validation for list types

    private String type;


    public SimpleList() {
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
