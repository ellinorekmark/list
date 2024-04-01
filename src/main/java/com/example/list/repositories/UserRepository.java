package com.example.list.repositories;

import com.example.list.dao.ListUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<ListUser, Long> {

    ListUser findUserById(Long id);
    ListUser findUserByEmail(String email);
    ListUser findUserByUsername(String username);
    boolean existsByEmail(String email);
    boolean existsByUsername(String username);

    ListUser findByUsername(String username);

    ListUser getUserByUsername(String username);
}
