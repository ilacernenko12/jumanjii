package com.overone.first_spring_mvs_project.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table (name = "spare_part")
public class SparePart {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "name")
    String name;

    @Column(name = "sparepart")
    String sparepart;

    @Column(name = "vin")
    String vin;

    @Column(name = "price")
    String price;
}
