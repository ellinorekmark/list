package com.example.listig.repositories;

import com.example.listig.dao.ListItem;
import com.example.listig.dto.ItemDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ListItemRepository extends JpaRepository<ListItem, Long> {
    List<ItemDto> getItemsByListId(Long id);
}