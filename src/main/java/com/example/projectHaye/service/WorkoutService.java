package com.example.projectHaye.service;

import com.example.projectHaye.model.Workout;
import com.example.projectHaye.repository.WorkoutRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class WorkoutService {

    WorkoutRepository workoutRepository;

    public Workout save(Workout workout){
        return workoutRepository.save(workout);
    }
}
