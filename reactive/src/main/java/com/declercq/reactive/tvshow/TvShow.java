package com.declercq.reactive.tvshow;

import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

@Table(name = "tv_show")
public class TvShow {

    @Id // Indique la clé primaire
    private Long id;
    private String name;
    private String genre;
    private Integer seasons;
}
