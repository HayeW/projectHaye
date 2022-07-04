package com.example.projectHaye.controller;

import com.example.projectHaye.model.Result;
import com.example.projectHaye.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ResultController {

    @Autowired
    ResultService resultService;

    @PostMapping("/result")
    List<Result> saveAll(@Valid @RequestBody Result[] results) {
        return resultService.saveAll(Arrays.asList(results));
    }

    @GetMapping("/result/{id}")
    public List<Result> findByOefening_Trainingschema_id(@PathVariable("id") int id) { return (List<Result>) resultService.findByOefening_Trainingschema_id(id);}
}
