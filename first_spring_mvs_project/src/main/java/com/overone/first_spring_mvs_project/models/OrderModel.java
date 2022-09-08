package com.overone.first_spring_mvs_project.models;

import lombok.Data;

import javax.persistence.*;

@Entity // создает таблицу
@Table (name = "order_model") // создает название для таблицы
@Data // геттеры и сеттеры
public class OrderModel {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "first_name") String name;
    @Column(name = "contact") String contact;
    @Column(name = "car_name") String carName;
    @Column(name = "if_answer") Boolean ifAnswered;
}
