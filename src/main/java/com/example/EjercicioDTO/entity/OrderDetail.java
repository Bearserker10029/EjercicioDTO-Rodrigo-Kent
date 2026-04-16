package com.example.EjercicioDTO.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "`order details`", schema = "northwind")
public class OrderDetail {
    @EmbeddedId
    private OrderDetailId id;

    @MapsId("orderID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "OrderID", nullable = false)
    private Order orderID;

    @MapsId("productID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ProductID", nullable = false)
    private Product productID;

    @ColumnDefault("0.0000")
    @Column(name = "UnitPrice", nullable = false, precision = 10, scale = 4)
    private BigDecimal unitPrice;

    @ColumnDefault("1")
    @Column(name = "Quantity", nullable = false)
    private Short quantity;

    @ColumnDefault("0")
    @Column(name = "Discount", nullable = false)
    private Double discount;


}