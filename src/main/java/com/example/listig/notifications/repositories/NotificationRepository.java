package com.example.listig.notifications.repositories;

import com.example.listig.notifications.entities.ListigNotification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotificationRepository extends JpaRepository<ListigNotification, Long> {
    List<ListigNotification> findAllByUserId(Long userId);

    void deleteAllByUserId(Long userIdByUsername);
}
