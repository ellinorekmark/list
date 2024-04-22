package com.example.listig.lists.repositories;

import com.example.listig.lists.entities.UserList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserListRepository extends JpaRepository<UserList, Long> {
    UserList getUserListById(Long id);

    @Query(value = "SELECT * FROM user_lists l JOIN list_users lu ON l.id = lu.list_id WHERE lu.user_id = :userId", nativeQuery = true)
    List<UserList> findListsByUserId(@Param("userId") Long userId);

    @Query(value = "SELECT username FROM users u JOIN list_users lu ON u.id = lu.user_id WHERE lu.list_id = :listId AND list_role = :role", nativeQuery = true)
    List<String> findListUserByListAndRole(@Param("listId") Long listId, @Param("role") String role);

    @Modifying
    @Query(value = "INSERT INTO list_users (list_id, user_id, list_role) VALUES (:listId, :userId, :role) " +
            "ON DUPLICATE KEY UPDATE list_role = :role", nativeQuery = true)
    void upsertUserRoleInList(@Param("listId") Long listId, @Param("userId") Long userId, @Param("role") String role);

    @Query(value = "SELECT list_id FROM user_lists l JOIN list_users lu ON l.id = lu.list_id WHERE lu.user_id = :userId AND lu.list_id = :listId AND lu.list_role = 'Owner'", nativeQuery = true)
    Long userOwnsList(@Param("userId") Long userId, @Param("listId") Long listId);

    @Modifying
    @Query(value = "DELETE FROM list_users WHERE list_id = :listId", nativeQuery = true)
    void deleteListsAndUsers(@Param("listId") Long listId);

    @Modifying
    @Query(value = "INSERT INTO list_users (list_id, user_id, list_role) VALUES (:listId, :listUser, :listRole)", nativeQuery = true)
    void addListUser(Long listId, Long listUser, String listRole);
}