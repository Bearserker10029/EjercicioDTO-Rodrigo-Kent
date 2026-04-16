package com.example.EjercicioDTO.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "customerdemographics", schema = "northwind")
public class Customerdemographic {
    @Id
    @Column(name = "CustomerTypeID", nullable = false, length = 10)
    private String customerTypeID;

    @Lob
    @Column(name = "CustomerDesc")
    private String customerDesc;


}