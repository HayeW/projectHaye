package com.example.projectHaye.service;

import com.example.projectHaye.model.Oefening;
import com.example.projectHaye.repository.OefeningRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OefeningService {

    OefeningRepository oefeningRepository;

    public List<Oefening> saveAll(List<Oefening> oefeningen){
        return (List<Oefening>) oefeningRepository.saveAll(oefeningen);
    }

    public List<Oefening> findByTrainingschema_Id(int id){
        return oefeningRepository.findByTrainingschema_Id(id);
    }

    public List<Oefening> findAll(){
        return (List<Oefening>) oefeningRepository.findAll();
    }
}
