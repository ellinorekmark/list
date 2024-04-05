package com.example.listig.repositories;

import com.example.listig.dao.LUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<LUser, Long> {

    LUser findUserById(Long id);
    LUser findUserByEmail(String email);
    LUser findUserByUsername(String username);
    boolean existsByEmail(String email);
    boolean existsByUsername(String username);

    LUser findByUsername(String username);

    LUser getUserByUsername(String username);


}
