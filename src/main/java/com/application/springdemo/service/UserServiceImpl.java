package com.application.springdemo.service;

import com.application.springdemo.entity.User;
import com.application.springdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository repository;

    @Override
    public User saveUser(User user) {
        return repository.save(user);
    }

    @Override
    public List<User> fetchUserList() {
        return repository.findAll();
    }

    @Override
    public User fetchUserById(Integer userId) {
        return repository.findById(userId).orElse(null);
    }

    @Override
    public void deleteUserById(Integer userId){
        repository.deleteById(userId);
    }
}
