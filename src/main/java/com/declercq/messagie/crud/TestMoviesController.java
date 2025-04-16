package com.declercq.messagie.crud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mymovies")
public class TestMoviesController {

    //Accès classique par lien direct à un autre MicroService
    //http://localhost:8080/mymovies/directAccess
    @GetMapping("/directAccess")
    public Movie directAccess() {
        System.out.println("/directAccess");
        //TODO
        return null;
    }


    //http://localhost:8080/mymovies/directAccessLB
    @GetMapping("/directAccessLB")
    public Movie directAccessLB() {
        System.out.println("/directAccessLB");

        //TODO
        return null;
    }
}