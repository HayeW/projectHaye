package com.example.projectHaye.repository;

import com.example.projectHaye.model.Oefening;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OefeningRepository extends CrudRepository<Oefening, Integer> {
    List<Oefening> findByTrainingschema_Id(int id);
}
