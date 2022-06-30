package com.example.projectHaye.repository;

import com.example.projectHaye.model.Result;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultRepository extends CrudRepository<Result, Integer> {
    public Iterable<Result> findByOefening_Id(int id);

    public Iterable<Result> findByOefening_Trainingschema_id(int id);
}
