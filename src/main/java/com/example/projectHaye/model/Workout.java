package com.example.projectHaye.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Workout {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @CreationTimestamp
    private LocalDateTime createDate;

    @ManyToOne @NotNull(message="Kan geen trainingschema vinden voor deze workout")
    Trainingschema trainingschema;
}
