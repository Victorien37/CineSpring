package com.vico.cinespring.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vico.cinespring.model.User;
import com.vico.cinespring.service.UserService;

@RestController
public class UserController {
    
    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public User create(@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping("/users")
    public Iterable<User> getAll() {
        return userService.getAll();
    }

    @GetMapping("/users/{id}")
    public User get(@PathVariable("id") final Long id) {
        Optional<User> user = userService.get(id);
        return user.isPresent() ? user.get() : null;
    }

    @PutMapping("/users/{id}")
    public User update(@PathVariable("id") final Long id, @RequestBody User user) {
        Optional<User> u = userService.get(id);
        if (u.isPresent()) {
            User currenUser = u.get();

            currenUser.setFirstname(user.getFirstname());
            currenUser.setLastname(user.getLastname());

            userService.save(currenUser);

            return currenUser;
        } else {
            return null;
        }
    }

    @DeleteMapping("/users/{id}")
    public void softDelete(@PathVariable("id") final Long id) {
        userService.softDelete(id);
    }

    @DeleteMapping("/users/{id}/force")
    public void delete(@PathVariable("id") final Long id) {
        userService.delete(id);
    }
}
