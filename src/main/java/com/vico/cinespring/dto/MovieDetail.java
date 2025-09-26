package com.vico.cinespring.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class MovieDetail {
    private String name;
    private String slug;
    private String director;
    private Integer duration;
    private String image;
    private String synopsis;
    private String actors;
    private LocalDate releaseDate;
    private Float note; 
}
