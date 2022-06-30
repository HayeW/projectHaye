package com.example.projectHaye.model;

import javax.persistence.*;

@Entity
public class Result {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    int[] behaaldeHerhalingen;
    int[] gewicht;

    @ManyToOne
    Oefening oefening;

    @ManyToOne
    Workout workout;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int[] getBehaaldeHerhalingen() {
        return behaaldeHerhalingen;
    }

    public void setBehaaldeHerhalingen(int[] behaaldeHerhalingen) {
        this.behaaldeHerhalingen = behaaldeHerhalingen;
    }

    public int[] getGewicht() {
        return gewicht;
    }

    public void setGewicht(int[] gewicht) {
        this.gewicht = gewicht;
    }

    public Oefening getOefening() {
        return oefening;
    }

    public void setOefening(Oefening oefening) {
        this.oefening = oefening;
    }

    public Workout getWorkout() {
        return workout;
    }

    public void setWorkout(Workout workout) {
        this.workout = workout;
    }
}
