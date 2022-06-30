package com.example.projectHaye.service;

import com.example.projectHaye.model.Result;
import com.example.projectHaye.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultService {

    @Autowired
    ResultRepository resultRepository;

    public List<Result> saveAll(List<Result> results){
        return (List<Result>) resultRepository.saveAll(results);
    }

    public Iterable<Result> findByOefening_Trainingschema_id(int id) { return resultRepository.findByOefening_Trainingschema_id(id);}
}
