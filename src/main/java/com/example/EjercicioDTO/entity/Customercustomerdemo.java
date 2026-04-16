package com.example.EjercicioDTO.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "customercustomerdemo", schema = "northwind")
public class Customercustomerdemo {
    @EmbeddedId
    private CustomercustomerdemoId id;

    @MapsId("customerID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CustomerID", nullable = false)
    private Customer customerID;

    @MapsId("customerTypeID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CustomerTypeID", nullable = false)
    private Customerdemographic customerTypeID;


}