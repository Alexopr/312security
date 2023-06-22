package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.entity.Role;
import ru.kata.spring.boot_security.demo.entity.User;

import java.util.List;

public interface UserService {
    User findByName(String name);
    User findById(Long id);
    List<User> findAllUsers();
    void add(User user);
    void update(User user, List<Role> roles);
    void deleteById(Long id);
}
