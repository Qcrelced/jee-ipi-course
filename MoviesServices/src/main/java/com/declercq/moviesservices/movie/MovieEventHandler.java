package com.declercq.moviesservices.movie;

import org.springframework.data.rest.core.annotation.*;
import org.springframework.stereotype.Component;

@Component
@RepositoryEventHandler
public class MovieEventHandler {

    // Intercepte les événements avant la création d'une nouvelle entité
    @HandleBeforeCreate
    public void handleBeforeCreate(Movie movie) {
        System.out.println("Before creating entity: " + movie);
    }

    // Intercepte les événements après la création d'une nouvelle entité
    @HandleAfterCreate
    public void handleAfterCreate(Movie movie) {
        System.out.println("After creating entity: " + movie);
    }

    // Intercepte les événements avant la mise à jour d'une entité existante
    @HandleBeforeSave
    public void handleBeforeSave(Movie movie) {
        System.out.println("Before saving entity: " + movie);
    }

    // Intercepte les événements après la mise à jour d'une entité existante
    @HandleAfterSave
    public void handleAfterSave(Movie movie) {
        System.out.println("After saving entity: " + movie);
    }

    // Intercepte les événements avant la suppression d'une entité
    @HandleBeforeDelete
    public void handleBeforeDelete(Movie movie) {
        System.out.println("Before deleting entity: " + movie);
    }

    // Intercepte les événements après la suppression d'une entité
    @HandleAfterDelete
    public void handleAfterDelete(Movie author) {
        System.out.println("After deleting entity: " + author);
    }
}