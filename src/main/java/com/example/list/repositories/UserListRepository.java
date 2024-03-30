package com.example.list.repositories;

import com.example.list.dao.UserList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserListRepository extends JpaRepository<UserList, Long> {
    UserList getUserListById(Long id);
}