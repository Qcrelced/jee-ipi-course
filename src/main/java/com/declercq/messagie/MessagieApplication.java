package com.declercq.messagie;

import com.declercq.messagie.crud.User;
import com.declercq.messagie.crud.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MessagieApplication implements CommandLineRunner {

    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(MessagieApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setLogin("admin");
        user.setPassword("admin");
        userRepository.save(user);
    }
}
