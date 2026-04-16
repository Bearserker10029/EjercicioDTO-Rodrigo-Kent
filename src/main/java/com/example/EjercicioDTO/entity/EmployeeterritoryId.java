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
public class EmployeeterritoryId implements Serializable {
    private static final long serialVersionUID = 2235638584156741065L;
    @Column(name = "EmployeeID", nullable = false)
    private Integer employeeID;

    @Column(name = "TerritoryID", nullable = false, length = 20)
    private String territoryID;


}