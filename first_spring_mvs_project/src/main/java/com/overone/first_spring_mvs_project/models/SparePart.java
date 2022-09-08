package com.overone.first_spring_mvs_project.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table (name = "/spare_part")
public class SparePart {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "model_auto")
    String model_auto;

    @Column(name = "spare_model")
    String spare_model;

    @Column(name = "price")
    String price;
}
