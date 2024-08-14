package com.example.listig;

import com.example.listig.lists.ListDto;
import com.example.listig.lists.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

    private final SimpMessagingTemplate messagingTemplate;

    @Autowired
    ListService listService;

    @Autowired
    public WebSocketController(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    @MessageMapping("/list/{id}")
    public void handleListUpdate(@DestinationVariable String id, ListDto list) {
        ListDto update = listService.socketUpdate(list);
        messagingTemplate.convertAndSend("/topic/list/" + id, update);
    }
}

