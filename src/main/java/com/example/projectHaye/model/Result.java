package com.example.projectHaye.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Getter
@Setter
public class Result {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @NotNull(message="Behaalde herhalingen niet goed gevuld")
    @Size(min=3, max=3, message = "Behaalde herhalingen niet goed gevuld")
    int[] behaaldeHerhalingen;
    @NotNull(message="Gewicht niet goed gevuld")
    @Size(min=3, max=3, message = "Gewicht niet goed gevuld")
    int[] gewicht;

    @ManyToOne
    Oefening oefening;

    @ManyToOne
    Workout workout;
}
