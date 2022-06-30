package com.example.projectHaye.repository;

import com.example.projectHaye.model.Workout;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkoutRepository extends CrudRepository<Workout, Integer> {
}
