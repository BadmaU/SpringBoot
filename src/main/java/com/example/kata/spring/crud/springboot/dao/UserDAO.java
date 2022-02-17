package com.example.kata.spring.crud.springboot.dao;

import com.example.kata.spring.crud.springboot.model.User;

import java.util.List;

public interface UserDAO {

    void saveUser(User user);
    void removeUserById(long id);
    List<User> getAllUsers();
    User getUserById(long id);
    void updateUser (User user);
}
