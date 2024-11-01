package com.example.listig.publicLists;

import com.example.listig.lists.ListDto;
import com.example.listig.lists.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublicService {

    ListService listService;

    @Autowired
    public PublicService(ListService listService) {
        this.listService = listService;
    }

    public ListDto getList(String id) {
        return listService.getListByUUID(id);
    }
}
