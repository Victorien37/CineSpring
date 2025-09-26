package com.vico.cinespring.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vico.cinespring.dto.MovieDetail;
import com.vico.cinespring.dto.MovieList;
import com.vico.cinespring.mapper.MovieMapper;
import com.vico.cinespring.model.Movie;
import com.vico.cinespring.repository.MovieRepository;

@Service
public class MovieService {
    
    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private MovieMapper movieMapper;

    public Iterable<MovieList> getAll() {
        return ((List<Movie>) movieRepository.findAll())
            .stream()
            .map(movieMapper::toList)
            .collect(Collectors.toList());
    }

    public Optional<MovieDetail> get(final Long id) {
        return movieRepository.findById(id)
            .map(movieMapper::toDetail);
    }

    public Optional<MovieDetail> getBySlug(final String slug) {
        return movieRepository.findBySlug(slug)
            .map(movieMapper::toDetail);
    }

}
