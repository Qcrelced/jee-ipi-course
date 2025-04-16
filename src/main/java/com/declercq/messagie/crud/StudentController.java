package com.declercq.messagie.crud;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/users")
public class StudentController {

    @GetMapping("/")
    public ResponseEntity<ArrayList<User>> getUserById(){
        ArrayList<User> users = UserService.load();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id){
        User user = new User();
        user = UserService.findById(id);
        return null;
    }

}
