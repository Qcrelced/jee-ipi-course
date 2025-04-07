package com.declercq.messagie.services;

import com.declercq.messagie.message.Message;
import com.declercq.messagie.message.MessageService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MessageServiceTest {

    @Autowired
    private MessageService messageService;

    @Test
    public void testAddMessage() {
        Message message = new Message();
        message.setPseudo("toto");
        message.setMessage("lorem ipsum");
        messageService.save(message);

        Message toto = messageService.findById(1L);

        Assertions.assertEquals(1, toto.getId());
    }

    @Test
    public void testGet10LastMessage() {

    }

}
