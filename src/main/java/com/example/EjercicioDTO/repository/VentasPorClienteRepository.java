package com.example.EjercicioDTO.repository;

import com.example.EjercicioDTO.dto.VentasPorClienteDTO;
import com.example.EjercicioDTO.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VentasPorClienteRepository extends JpaRepository<Order, Integer> {
    @Query(value="select c.CompanyName AS companyName, SUM(od.Quantity) AS quantity, SUM(od.UnitPrice) AS unitPrice "+
        "FROM northwind.customers c " +
        "INNER JOIN northwind.orders o ON o.CustomerID = c.CustomerID "+
        "INNER JOIN northwind.`order details` od ON od.OrderID = o.OrderID "+
        "GROUP BY c.CompanyName", nativeQuery = true)
        List<VentasPorClienteDTO> findVentasPorCliente();
}
