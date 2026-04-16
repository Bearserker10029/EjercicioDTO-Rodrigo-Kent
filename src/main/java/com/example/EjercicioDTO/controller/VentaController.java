package com.example.EjercicioDTO.controller;

import com.example.EjercicioDTO.dto.VentasPorClienteDTO;
import com.example.EjercicioDTO.repository.VentasPorClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class VentaController {
    @Autowired
    VentasPorClienteRepository ventasPorClienteRepository;

    @GetMapping("/ventas-por-cliente")
    public String getVentasPorCliente(Model model) {
        List<VentasPorClienteDTO> ventasPorCliente = ventasPorClienteRepository.findVentasPorCliente();
        model.addAttribute("ventasPorCliente", ventasPorCliente);
        return "ventasPorCliente";
    }
}
