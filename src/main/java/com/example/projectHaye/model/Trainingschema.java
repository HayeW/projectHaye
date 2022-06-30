package com.example.projectHaye.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Trainingschema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String naam;

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

}
