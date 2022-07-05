package com.example.projectHaye.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
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

    @ManyToOne @NotNull(message="Kan geen trainingschema vinden voor deze oefening")
    Trainingschema trainingschema;
}
