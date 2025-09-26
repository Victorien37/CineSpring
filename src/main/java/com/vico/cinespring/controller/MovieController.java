package com.vico.cinespring.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.vico.cinespring.dto.MovieDetail;
import com.vico.cinespring.dto.MovieList;
import com.vico.cinespring.service.MovieService;


@RestController
public class MovieController {
    
    @Autowired
    private MovieService movieService;
    
    @GetMapping("/movies")
    public Iterable<MovieList> getAll() {
        return movieService.getAll();
    }

    @GetMapping("/movies/{slug}")
    public ResponseEntity<MovieDetail> getBySlug(@PathVariable String slug) {
        Optional<MovieDetail> movie = movieService.getBySlug(slug);
        return movie.map(ResponseEntity::ok)
                   .orElse(ResponseEntity.notFound().build());
    }
    
}
