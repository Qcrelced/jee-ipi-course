package com.declercq.moviesservices;

import com.declercq.moviesservices.movie.Movie;
import com.declercq.moviesservices.movie.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoviesServicesApplication implements CommandLineRunner {

    @Autowired
    private MovieRepository movieRepository;

    public static void main(String[] args) {
        SpringApplication.run(MoviesServicesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Movie movie = new Movie();
        movie.setTitle("Movie");
        movie.setLenght(154);
        movieRepository.save(movie);
        //Code appelé après le démarrage du serveur
        //Fill your data base with your service or Repository
    }
}
