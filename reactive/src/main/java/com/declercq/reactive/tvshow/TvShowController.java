package com.declercq.reactive.tvshow;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/tvshows")
public class TvShowController {

    private final TvShowService tvShowService;
    public TvShowController(TvShowService tvShowService) {
        this.tvShowService = tvShowService;
    }

    //http://localhost:8080/api/tvshows
    @GetMapping
    public Flux<TvShow> getAllTVShows() {
        return tvShowService.getAllTvShows();
    }
}
