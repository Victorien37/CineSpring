package com.vico.cinespring.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vico.cinespring.model.Movie;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {
    Optional<Movie> findBySlug(String slug);
}
