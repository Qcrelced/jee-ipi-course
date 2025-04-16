package com.declercq.messagie.crud;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieService {

    @Autowired
    private RestTemplate restTemplate;

    public Movie getMovieById(int id) {
        Movie movie = restTemplate.getForObject("https://localhost:8080/movie/" + id, Movie.class);
        return movie;
    }
}
