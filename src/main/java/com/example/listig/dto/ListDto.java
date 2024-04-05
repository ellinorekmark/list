package com.example.listig.dto;

import com.example.listig.ListType;
import com.example.listig.dao.UserList;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;
import java.util.List;

public class ListDto {
    private Long id;
    @NotBlank(message = "Please give your list a name.")
    private String name;

    //TODO: create validation for list types
    private String type;
    private String description = "";
    private boolean isPublic = false;
    private LocalDateTime createdAt;

    private List<String> owners;
    private List<String> viewers;

    private List<ItemDto> items;



    public ListDto() {
    }
    public ListDto(UserList list) {
        this.id = list.getId();
        this.name = list.getListName();
        this.type = list.getType().toString();
        this.description = list.getListDesc();
        this.isPublic = list.isPublic();
        this.createdAt = list.getCreatedAt();
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
    public void setType(ListType type) {
        this.type = type.toString();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public List<ItemDto> getItems() {
        return items;
    }

    public void setItems(List<ItemDto> items) {
        this.items = items;
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


}
