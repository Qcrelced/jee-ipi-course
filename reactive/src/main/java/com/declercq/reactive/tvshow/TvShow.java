package com.declercq.reactive.tvshow;


import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table
public class TvShow {

    @Id // Indique la clé primaire
    private Long id;
    private String name;
    private String genre;
    private Integer seasons;

    //GETTER Setter
}
