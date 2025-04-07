package com.declercq.messagie.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessageController {

    @Autowired
    private MessageService messageService;

    @PostMapping(path="add-message")
    public void saveMessage(@RequestBody Message message) {
        messageService.save(message);
    }

    @GetMapping("/get-message")
    public Message getMessage(@RequestParam(value = "id") int id) {
        return messageService.findById(id);
    }
}
