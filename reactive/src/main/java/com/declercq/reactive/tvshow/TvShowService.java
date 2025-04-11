package com.declercq.reactive.tvshow;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class TvShowService {

    private final TvShowRepository tvShowRepository;

    public TvShowService(TvShowRepository tvShowRepository) {
        this.tvShowRepository = tvShowRepository;
    }

    // Récupérer toutes les séries
    public Flux<TvShow> getAllTvShows() {
        return tvShowRepository.findAll();
    }
}
