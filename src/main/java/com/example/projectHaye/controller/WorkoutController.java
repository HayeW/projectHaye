package com.example.projectHaye.controller;

import com.example.projectHaye.model.Workout;
import com.example.projectHaye.service.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class WorkoutController {
    @Autowired
    WorkoutService workoutService;

    @PostMapping("/workout")
    Workout save(@RequestBody Workout workout){
        return workoutService.save(workout);
    }
}