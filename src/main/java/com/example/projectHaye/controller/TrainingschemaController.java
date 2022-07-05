package com.example.projectHaye.controller;

import com.example.projectHaye.model.Trainingschema;
import com.example.projectHaye.service.TrainingschemaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@AllArgsConstructor
public class TrainingschemaController {

    TrainingschemaService trainingSchemaService;

    @PostMapping("/trainingschema")
    Trainingschema save(@Valid @RequestBody Trainingschema trainingSchema){
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