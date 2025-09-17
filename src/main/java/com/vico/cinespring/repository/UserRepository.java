package com.vico.cinespring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vico.cinespring.model.User;

@Repository
public interface UserRepository  extends CrudRepository<User, Long> { }