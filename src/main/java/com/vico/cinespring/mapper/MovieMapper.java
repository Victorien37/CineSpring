package com.vico.cinespring.mapper;

import org.springframework.stereotype.Component;

import com.vico.cinespring.dto.MovieDetail;
import com.vico.cinespring.dto.MovieList;
import com.vico.cinespring.model.Movie;

@Component
public class MovieMapper {

    public MovieList toList(Movie movie) {
        MovieList dto = new MovieList();
        dto.setName(movie.getName());
        dto.setSlug(movie.getSlug());
        dto.setDuration(movie.getDuration());
        dto.setImage(movie.getImage());
        dto.setSynopsis(movie.getSynopsis());
        dto.setReleaseDate(movie.getReleaseDate());
        dto.setNote(movie.getNote());
        return dto;
    }

    public MovieDetail toDetail(Movie movie) {
        MovieDetail dto = new MovieDetail();
        dto.setName(movie.getName());
        dto.setSlug(movie.getSlug());
        dto.setDirector(movie.getDirector());
        dto.setDuration(movie.getDuration());
        dto.setImage(movie.getImage());
        dto.setSynopsis(movie.getSynopsis());
        dto.setActors(movie.getActors());
        dto.setReleaseDate(movie.getReleaseDate());
        dto.setNote(movie.getNote());
        return dto;
    }
}