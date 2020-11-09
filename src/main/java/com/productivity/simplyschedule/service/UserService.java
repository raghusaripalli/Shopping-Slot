package com.productivity.simplyschedule.service;

import com.productivity.simplyschedule.model.User;
import com.productivity.simplyschedule.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User getUserById(Integer userId) {
        return userRepository.findById(userId).orElse(null);
    }
}
