package com.declercq.messagie.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@Service
public class UserService {

    private static final ArrayList<User> list = new ArrayList<>();
    private static long idNumber = 1;

    @Autowired
    private static RestTemplate restTemplate;


    //Retourne la liste
    public static ArrayList<User> load() {
        return list;
    }

    //Permet de trouver l'utilisateur qui utilise cette session
    public static User findById(Long id) {
        User user = restTemplate.getForObject("https://messagie/users/1" + id, User.class);
        return user;
    }
}
