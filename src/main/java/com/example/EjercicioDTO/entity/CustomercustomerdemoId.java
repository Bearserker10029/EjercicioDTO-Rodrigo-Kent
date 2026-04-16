package com.example.EjercicioDTO.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
@Embeddable
public class CustomercustomerdemoId implements Serializable {
    private static final long serialVersionUID = 5816663926060556627L;
    @Column(name = "CustomerID", nullable = false, length = 5)
    private String customerID;

    @Column(name = "CustomerTypeID", nullable = false, length = 10)
    private String customerTypeID;


}