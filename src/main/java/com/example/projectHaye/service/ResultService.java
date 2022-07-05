package com.example.projectHaye.service;

import com.example.projectHaye.model.Result;
import com.example.projectHaye.repository.ResultRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ResultService {

    ResultRepository resultRepository;

    public List<Result> saveAll(List<Result> results){
        return (List<Result>) resultRepository.saveAll(results);
    }

    public Iterable<Result> findByOefening_Trainingschema_id(int id) { return resultRepository.findByOefening_Trainingschema_id(id);}
}
