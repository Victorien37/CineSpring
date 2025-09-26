package com.vico.cinespring.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class MovieList {
    private String name;
    private String slug;
    private Integer duration;
    private String image;
    private String synopsis;
    private LocalDate releaseDate;
    private Float note;
}