package com.example.projectHaye.controller;

import com.example.projectHaye.model.Result;
import com.example.projectHaye.service.ResultService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@AllArgsConstructor
public class ResultController {

    ResultService resultService;

    @PostMapping("/result")
    List<Result> saveAll(@Valid @RequestBody Result[] results) {
        for (Result result: results){
            if (result.getGewicht() == null
                    || result.getBehaaldeHerhalingen() == null
                    || result.getOefening() == null
                    || result.getWorkout() == null)
                throw new IllegalArgumentException("Niet alle velden voor het resultaat zijn bekend.");

            for(int herhaling : result.getBehaaldeHerhalingen())
                if (herhaling == 0)
                    throw new IllegalArgumentException("Nulwaarde gevonden in behaalde herhalingen.");

            for (int gewicht : result.getGewicht())
                if (gewicht == 0)
                    throw new IllegalArgumentException("Nulwaarde gevonden in gewicht");

            int numberOfSets = result.getOefening().getSets();
            if (result.getBehaaldeHerhalingen().length != numberOfSets && result.getGewicht().length != numberOfSets)
                throw new IllegalArgumentException("Result arrays komen niet overeen met het aantal sets.");
        }

        return resultService.saveAll(Arrays.asList(results));
    }

    @GetMapping("/result/{id}")
    public List<Result> findByOefening_Trainingschema_id(@PathVariable("id") int id) { return (List<Result>) resultService.findByOefening_Trainingschema_id(id);}
}
