package com.example.EjercicioDTO.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "employeeterritories", schema = "northwind")
public class Employeeterritory {
    @EmbeddedId
    private EmployeeterritoryId id;

    @MapsId("employeeID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "EmployeeID", nullable = false)
    private Employee employeeID;

    @MapsId("territoryID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "TerritoryID", nullable = false)
    private Territory territoryID;


}