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
public class OrderDetailId implements Serializable {
    private static final long serialVersionUID = -7670000450875007801L;
    @Column(name = "OrderID", nullable = false)
    private Integer orderID;

    @Column(name = "ProductID", nullable = false)
    private Integer productID;


}