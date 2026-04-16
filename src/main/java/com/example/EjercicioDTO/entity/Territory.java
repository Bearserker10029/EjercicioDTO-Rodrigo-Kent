package com.example.EjercicioDTO.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "territories", schema = "northwind")
public class Territory {
    @Id
    @Column(name = "TerritoryID", nullable = false, length = 20)
    private String territoryID;

    @Column(name = "TerritoryDescription", nullable = false, length = 50)
    private String territoryDescription;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "RegionID", nullable = false)
    private Region regionID;


}