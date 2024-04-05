package com.example.listig.repositories;

import com.example.listig.dao.LUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<LUser, Long> {

    LUser findUserById(Long id);
    LUser findUserByEmail(String email);
    LUser findUserByUsername(String username);
    boolean existsByEmail(String email);
    boolean existsByUsername(String username);

    LUser findByUsername(String username);

    LUser getUserByUsername(String username);
}
