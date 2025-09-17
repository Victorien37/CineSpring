package com.vico.cinespring.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vico.cinespring.model.User;
import com.vico.cinespring.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public Iterable<User> getAll() {
        return userRepository.findAll();
    }

    public Optional<User> get(final Long id) {
        return userRepository.findById(id);
    }
    
    public void softDelete(final Long id) {
        Optional<User> userOpt = userRepository.findById(id);
        if (userOpt.isPresent()) {
            User user = userOpt.get();
            user.setDeletedAt(LocalDateTime.now());
            userRepository.save(user);
        }
    }

    public void delete(final Long id) {
        userRepository.deleteById(id);
    }

    public User save(User user) {
        User updatedUser = userRepository.save(user);
        return updatedUser;
    }
}
