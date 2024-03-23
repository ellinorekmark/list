package com.example.list.repositories;

import com.example.list.dao.ListItemDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListItemRepository extends JpaRepository<ListItemDAO, Long> {
}