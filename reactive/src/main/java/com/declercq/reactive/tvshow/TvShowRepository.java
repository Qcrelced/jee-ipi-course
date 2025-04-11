package com.declercq.reactive.tvshow;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface TvShowRepository extends ReactiveCrudRepository<TvShow, Long> {
    // Méthode personnalisée pour rechercher par genre
    Flux<TvShow> findByGenre(String genre);
}
