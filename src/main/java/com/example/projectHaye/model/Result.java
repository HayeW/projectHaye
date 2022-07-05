package com.example.projectHaye.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
public class Result {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @NotNull(message="Behaalde herhalingen niet goed gevuld")
    int[] behaaldeHerhalingen;

    @NotNull(message="Gewicht niet goed gevuld")
    int[] gewicht;

    @ManyToOne @NotNull(message="Kan geen oefening vinden voor dit resultaat")
    Oefening oefening;

    @ManyToOne @NotNull(message="Kan geen workout vinden voor dit resultaat")
    Workout workout;
}
