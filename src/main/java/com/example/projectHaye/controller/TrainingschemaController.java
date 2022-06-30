package com.example.projectHaye.controller;

import com.example.projectHaye.model.Trainingschema;
import com.example.projectHaye.service.TrainingschemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class TrainingschemaController {

    @Autowired
    TrainingschemaService trainingSchemaService;

    @PostMapping("/trainingschema")
    Trainingschema save(@RequestBody Trainingschema trainingSchema){
        return trainingSchemaService.save(trainingSchema);
    }

    @GetMapping("/trainingschema")
    Iterable<Trainingschema> findAll(){
        return trainingSchemaService.findAll();
    }

    @GetMapping("/trainingschema/{id}")
    Optional findById(@PathVariable("id") int id){
        return trainingSchemaService.findById(id);
    }
}