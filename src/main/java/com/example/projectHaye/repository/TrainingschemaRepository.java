package com.example.projectHaye.repository;

import com.example.projectHaye.model.Trainingschema;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingschemaRepository extends CrudRepository<Trainingschema, Integer> {

}
