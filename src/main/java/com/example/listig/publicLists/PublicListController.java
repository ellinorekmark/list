package com.example.listig.publicLists;

import com.example.listig.lists.ListDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/public")
public class PublicListController {

    PublicService publicService;

    @Autowired
    public PublicListController(PublicService publicService) {
        this.publicService = publicService;
    }

    @GetMapping("/{id}")
    ResponseEntity<Object> getPublicList(@PathVariable("id") String id) {
        ListDto list = publicService.getList(id);
        return ResponseEntity.ok(list);

    }


}
