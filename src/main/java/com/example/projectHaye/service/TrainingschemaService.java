package com.example.projectHaye.service;

import com.example.projectHaye.model.Trainingschema;
import com.example.projectHaye.repository.TrainingschemaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class TrainingschemaService {

    TrainingschemaRepository trainingSchemaRepository;

    public Trainingschema save(Trainingschema trainingSchema){
            return trainingSchemaRepository.save(trainingSchema);
    }

    public Iterable<Trainingschema> findAll(){
        return trainingSchemaRepository.findAll();
    }

    public Optional findById(int id) { return trainingSchemaRepository.findById(id);}
}
