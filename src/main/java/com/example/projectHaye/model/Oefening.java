package com.example.projectHaye.model;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
public class Oefening {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @NotBlank(message = "Vul een naam in voor de oefeningen")
    String naam;

    @Min(value=1, message = "'Sets' verwacht een waarde van 1-99")
    @Max(value=99, message = "'Sets' verwacht een waarde van 1-99")
    int sets;

    @Min(value=1, message = "'Herhalingen' verwacht een waarde van 1-99")
    @Max(value=99, message = "'Herhalingen' verwacht een waarde van 1-99")
    int herhalingen;

    @ManyToOne
    Trainingschema trainingschema;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public int getHerhalingen() {
        return herhalingen;
    }

    public void setHerhalingen(int herhalingen) {
        this.herhalingen = herhalingen;
    }

    public Trainingschema getTrainingschema() {
        return trainingschema;
    }

    public void setTrainingschema(Trainingschema trainingschema) {
        this.trainingschema = trainingschema;
    }
}
