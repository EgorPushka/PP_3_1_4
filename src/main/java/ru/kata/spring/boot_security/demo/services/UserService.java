package ru.kata.spring.boot_security.demo.services;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;

@Service
public interface UserService extends UserDetailsService {

    List<User> indexUsers();
    void add(User user);
    void delete(int id);
    void edit(User user);
    User getById(int id);

    User findByUsername(String name);
}