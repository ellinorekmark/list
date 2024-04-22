package com.example.listig.user.repositories;

import com.example.listig.user.entities.LUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<LUser, Long> {

    LUser findUserByUsername(String username);

    Boolean existsByEmail(String email);

    Boolean existsByUsername(String username);

    LUser findByUsername(String username);

    LUser getUserByUsername(String username);

    LUser getUserById(Long userId);
}
