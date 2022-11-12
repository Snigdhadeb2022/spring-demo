package com.application.springdemo.controller;

import com.application.springdemo.entity.User;
import com.application.springdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService service;

    // Save operation
    @PostMapping("/user")
    public ResponseEntity<User> saveDepartment(@RequestBody User user)
    {
        User userCreated = service.saveUser(user);
        return new ResponseEntity<User>(userCreated, HttpStatus.CREATED);
    }

    // Read operation
    @GetMapping("/users")
    public ResponseEntity<List<User>> fetchUserList()
    {
        return ResponseEntity.ok(service.fetchUserList());
    }

    // Read operation by Id
    @GetMapping("/user/{id}")
    public ResponseEntity<User> fetchUserById(@PathVariable("id") Integer userId)
    {
        return ResponseEntity.ok(service.fetchUserById(userId));
    }

    // Delete operation
    @DeleteMapping("/user/{id}")
    public ResponseEntity<String> deleteDepartmentById(@PathVariable("id") Integer userId)
    {
        service.deleteUserById(userId);
        return ResponseEntity.ok("Deleted Successfully");
    }
}
