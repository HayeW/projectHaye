package com.example.projectHaye.controller;

import com.example.projectHaye.model.User;
import com.example.projectHaye.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "*")
@AllArgsConstructor
public class UserController {

    UserService userService;


    @PostMapping("/login")
    public String login(@Valid @RequestBody User user) throws Exception{
        return userService
                .login(user)
                .orElseThrow(() -> new IllegalArgumentException("Deze combinatie gebruikersnaam+wachtwoord is niet bekend."))
                .getUsername();
    }

    @PutMapping("/login")
    public User save(@RequestBody User user){
        return userService.save(user);
    }

}
