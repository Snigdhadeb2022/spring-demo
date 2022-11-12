package com.application.springdemo.service;

import com.application.springdemo.entity.User;

import java.util.List;

public interface UserService {
    // Save operation
    User saveUser(User user);

    // Read operation
    List<User> fetchUserList();

    //Get User by Id
    User fetchUserById(Integer userId);

    // Delete operation
    void deleteUserById(Integer userId);
}
