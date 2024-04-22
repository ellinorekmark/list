package com.example.listig.notifications;

import com.example.listig.AuthUtil;
import com.example.listig.notifications.entities.ListigNotification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/notifications")
public class NotificationResource {

    @Autowired
    NotificationService notificationService;

    @GetMapping()
    public ResponseEntity<List<ListigNotification>> getNotifications() {
        List<ListigNotification> notifications = notificationService.getNotifications(AuthUtil.getUserName());

        return ResponseEntity.ok().body(notifications);
    }

}
