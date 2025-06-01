package com.NKLoveLetterApp.controller;

import com.NKLoveLetterApp.model.User;
import com.NKLoveLetterApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/auth")
public class UserController {
    @Autowired
    private UserService userService;

    // user register
    @PostMapping("/register")
    public String register(@RequestBody User user){
        return userService.register(user);
    }

    // user login
    @PostMapping("/login")
    public String login(@RequestBody User user){
        return userService.login(user);
    }
}
