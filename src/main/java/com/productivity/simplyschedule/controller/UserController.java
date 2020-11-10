package com.productivity.simplyschedule.controller;

import com.productivity.simplyschedule.model.User;
import com.productivity.simplyschedule.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer userId) {
        return userService.getUserById(userId);
    }
}
