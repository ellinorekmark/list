package com.example.list.repositories;

import com.example.list.dao.ItemTag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemTagRepository extends JpaRepository<ItemTag, Long> {
}
