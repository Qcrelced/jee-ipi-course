package com.declercq.messagie.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public void save(Message message) {
        messageRepository.save(message);
    }

    public Message findById(long id){
        Optional<Message> OptionalMessage = messageRepository.findById(id);
        Message message = OptionalMessage.get();
        return message;
    }

    public List<Message> get10Last() {
        return messageRepository.findFirst10ByOrderByIdDesc();
    }

    public Message findById(Long id) {
        return messageRepository.findById(id).orElse(null);
    }

}
