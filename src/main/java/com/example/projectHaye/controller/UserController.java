package com.example.projectHaye.controller;

import com.example.projectHaye.model.User;
import com.example.projectHaye.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;


    @PostMapping("/login")
    public String login(@RequestBody User user) throws Exception{
        return userService
                .login(user)
                .orElseThrow(() -> new IllegalArgumentException("Combination of username and password not found."))
                .getUsername();
    }

    @PutMapping("/login")
    public User save(@RequestBody User user){
        return userService.save(user);
    }

}
