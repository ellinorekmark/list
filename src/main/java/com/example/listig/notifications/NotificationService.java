package com.example.listig.notifications;

import com.example.listig.notifications.entities.ListigNotification;
import com.example.listig.notifications.repositories.NotificationRepository;
import com.example.listig.user.UserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class NotificationService {

    private static final String ADDED_TO_LIST = "You have been added as %s on list %s by %s.";
    @Autowired
    NotificationRepository repository;
    @Autowired
    UserService userService;



    public void addedToList(Long userId, String listName, String role, String listOwner) {
        ListigNotification notification = new ListigNotification();
        notification.setMessage(String.format(ADDED_TO_LIST, role, listName, listOwner));
        notification.setCreatedAt(LocalDateTime.now());
        notification.setUserId(userId);
        repository.save(notification);
    }

    public void deleteNotification(Long notificationId){
        repository.deleteById(notificationId);
    }

    @Transactional
    public List<ListigNotification> getNotifications(String username){
        List<ListigNotification> notifications = repository.findAllByUserId(userService.findUserIdByUsername(username));
        repository.deleteAllByUserId(userService.findUserIdByUsername(username));
        return notifications;
    }


}
