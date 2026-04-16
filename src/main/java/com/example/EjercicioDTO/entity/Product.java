package com.example.EjercicioDTO.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "products", schema = "northwind")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProductID", nullable = false)
    private Integer id;

    @Column(name = "ProductName", nullable = false, length = 40)
    private String productName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SupplierID")
    private Supplier supplierID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CategoryID")
    private Category categoryID;

    @Column(name = "QuantityPerUnit", length = 20)
    private String quantityPerUnit;

    @ColumnDefault("0.0000")
    @Column(name = "UnitPrice", precision = 10, scale = 4)
    private BigDecimal unitPrice;

    @ColumnDefault("0")
    @Column(name = "UnitsInStock")
    private Short unitsInStock;

    @ColumnDefault("0")
    @Column(name = "UnitsOnOrder")
    private Short unitsOnOrder;

    @ColumnDefault("0")
    @Column(name = "ReorderLevel")
    private Short reorderLevel;

    @ColumnDefault("b'0'")
    @Column(name = "Discontinued", nullable = false)
    private Boolean discontinued;


}