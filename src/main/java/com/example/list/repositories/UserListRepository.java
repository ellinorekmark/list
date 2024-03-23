package com.example.list.repositories;

import com.example.list.dao.UserListDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserListRepository extends JpaRepository<UserListDAO, Long> {
}