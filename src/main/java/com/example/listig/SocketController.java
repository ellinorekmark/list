package com.example.listig;

import com.example.listig.lists.ListDto;
import com.example.listig.lists.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class SocketController {

    @Autowired
    ListService listService;

    @MessageMapping("/hello")
    @SendTo("/topic/list")
    public ListDto updateList(ListDto list) throws Exception {
        ListDto updated = listService.createOrUpdateList("elli", list);
        return updated;
    }

    @GetMapping("/getList/{id}")
    public ListDto getList(@PathVariable Long id) throws Exception {
        ListDto list =listService.getListFromUser(id, "elli");
        return list;
    }
}
