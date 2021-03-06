package com.example.projectHaye.controller;

import com.example.projectHaye.model.Oefening;
import com.example.projectHaye.service.OefeningService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@AllArgsConstructor
public class OefeningController {

    OefeningService oefeningService;

    @PostMapping("/oefening")
    List<Oefening> saveAll(@Valid @RequestBody Oefening[] oefeningen){
        return oefeningService.saveAll(Arrays.asList(oefeningen));
    }

    @GetMapping("/oefening/{id}")
    List<Oefening> findByTrainingschema_Id(@PathVariable("id") int id){
        return oefeningService.findByTrainingschema_Id(id);
    }

    @GetMapping("/oefening")
    List<Oefening> findAll(){
        return oefeningService.findAll();
    }
}