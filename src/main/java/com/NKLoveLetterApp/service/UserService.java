package com.NKLoveLetterApp.service;

import com.NKLoveLetterApp.model.User;
import com.NKLoveLetterApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    // user register
    public String register(User user){
        if (userRepository.findByEmail(user.getEmail())!=null){
            return "User already exists";
        }
        userRepository.save(user);
        return "Registered successfully!";
    }

    // user login
    public String login(User user){
        User existingUser = userRepository.findByEmail(user.getEmail());
        if (existingUser==null){
            return "User not found";
        }
        if (!existingUser.getPassword().equals(user.getPassword())){
            return "Invalid password";
        }
        return "Login successful!";
    }
}
