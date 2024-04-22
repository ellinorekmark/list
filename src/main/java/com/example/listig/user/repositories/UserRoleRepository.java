package com.example.listig.user.repositories;

import com.example.listig.user.entities.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
}
