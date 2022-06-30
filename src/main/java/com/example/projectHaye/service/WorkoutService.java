package com.example.projectHaye.service;

import com.example.projectHaye.model.Workout;
import com.example.projectHaye.repository.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkoutService {
    @Autowired
    WorkoutRepository workoutRepository;

    public Workout save(Workout workout){
        return workoutRepository.save(workout);
    }
}
