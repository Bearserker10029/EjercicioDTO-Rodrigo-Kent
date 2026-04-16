package com.example.EjercicioDTO.dto;

public interface VentasPorClienteDTO {
    String getCompanyName();
    int getQuantity();
    int getUnitPrice();
    default int getTotal() {
        return getQuantity() * getUnitPrice();
    }

}
