package com.example.list.repositories;

import com.example.list.dao.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {

    User findUserById(Long id);
    User findUserByEmail(String email);
    boolean existsByEmail(String email);

    @Query("SELECT user.password FROM User user WHERE user.email = :email")
    String findPasswordByEmail(String email);
}
