package com.example.projectHaye.service;

import com.example.projectHaye.model.User;
import com.example.projectHaye.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {

    UserRepository userRepository;

    public Optional<User> login(User user){
        return userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
    }

    public User save(User user){
        return userRepository.save(user);
    }
}
