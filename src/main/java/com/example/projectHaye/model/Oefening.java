package com.example.projectHaye.model;

import javax.persistence.*;

@Entity
public class Oefening {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String naam;
    int sets;
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
