package com.example.kata.spring.crud.springboot.service;

import com.example.kata.spring.crud.springboot.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);
    void removeUserById(long id);
    List<User> getAllUsers();
    User getUserById(long id);
    void updateUser (User user);
    void updateUserById(long id, User user);
}
