package com.declercq.messagie.services;

import com.declercq.messagie.message.Message;
import com.declercq.messagie.message.MessageRepository;
import com.declercq.messagie.message.MessageService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;

@ExtendWith(MockitoExtension.class)
public class MessageServiceTest {

    private final MessageRepository messageRepository = Mockito.mock(MessageRepository.class);

    @InjectMocks
    private MessageService messageService;

    @Test
    public void testAddMessage() {
        Message message = new Message();
        message.setPseudo("toto");
        message.setMessage("lorem ipsum");

        messageService.save(message);
        Mockito.verify(messageRepository, times(1)).save(message);
        assertEquals("toto", message.getPseudo());

//        Message toto = messageService.findById(1L);
//        Mockito.when(messageRepository.findFirstMessage()).thenReturn(new Message(1L, "toto", "lorem ipsum"));
//        assertEquals(1, toto.getId());
    }

    @Test
    public void testGet10Last() {

        List<Message> messages = new ArrayList<>();
        messages.add(new Message("User1", "Hello, this is a test message."));
        messages.add(new Message("User2", "Testing the service with another message."));
        messages.add(new Message("User3", "This is a test from User3."));
        messages.add(new Message("Admin", "Admin message for service testing."));
        messages.add(new Message("TestUser", "Final test message."));
        messages.add(new Message("Alex", "Message from Alex to test the service."));
        messages.add(new Message("BetaUser", "BetaUser sends a message to the test service."));
        messages.add(new Message("Charlie", "Testing with a message from Charlie."));
        messages.add(new Message("Guest", "Guest message for testing purposes."));
        messages.add(new Message("Support", "Support team testing message to verify service."));
        messages.add(new Message("Developer", "Developer testing the service functionality."));
        messages.add(new Message("Manager", "Manager's message to check the service."));
        messages.add(new Message("Moderator", "Moderator testing message for validation."));
        messages.add(new Message("Tester", "Tester message to ensure everything works."));
        messages.add(new Message("SupportTeam", "Support team sending a test message."));

        // Préparation des données
        for (int i = 1; i <= 15; i++) {
            Message message = new Message(null, "User" + i, "Message " + i);
            messageService.save(message);
        }

        Mockito.verify(messageRepository, times(1)).findFirst10ByOrderByIdDesc();
        Mockito.when(messageRepository.findFirst10ByOrderByIdDesc()).thenReturn(messages);


        // Exécution de la méthode à tester
            messages = messageService.get10Last();

        // Vérifications
        assertEquals(10, messages.size());
        assertEquals("Message 15", messages.get(0).getMessage());
    }

}
