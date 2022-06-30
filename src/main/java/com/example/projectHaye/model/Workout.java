package com.example.projectHaye.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Workout {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @CreationTimestamp
    private LocalDateTime createDate;

    @ManyToOne
    Trainingschema trainingschema;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public Trainingschema getTrainingschema() {
        return trainingschema;
    }

    public void setTrainingschema(Trainingschema trainingschema) {
        this.trainingschema = trainingschema;
    }
}
