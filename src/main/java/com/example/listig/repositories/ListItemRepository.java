package com.example.listig.repositories;

import com.example.listig.dao.ListItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ListItemRepository extends JpaRepository<ListItem, Long> {
    List<ListItem> getItemsByListId(Long id);
}