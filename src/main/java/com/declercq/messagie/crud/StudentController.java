package com.declercq.messagie.crud;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        if (user != null){
            return ResponseEntity.ok(user);
        }
        return null;
    }

    @PostMapping("/post{login}and{password}")
    public HttpStatus CreatUser(@PathVariable String login,
                                @PathVariable String password){
        User user = new User(null, login, password);
        UserService.save(user);
        return HttpStatus.CREATED;
    }

    @PutMapping("/users/{id}by{newid}")
    public HttpStatus getUserById(@PathVariable long id,
                                  @PathVariable long newid){
        User user = new User();
        user = UserService.findById(id);
        if (user != null){
            user.setId(newid);
            UserService.save(user);
            return HttpStatus.OK;
        }
        return HttpStatus.NOT_FOUND;
    }

    @DeleteMapping("/users/delete/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable long id){
        User user = new User();
        user = UserService.findById(id);
        if (user != null){
            user.setId(id);
        }
        UserService.deleteById(id);
        return ResponseEntity.ok(user);
    }

}
