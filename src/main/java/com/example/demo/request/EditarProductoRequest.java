package com.example.demo.request;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class EditarProductoRequest {
    private String nombre;
    private float precio;
    private int stock;
    private Long id_categoria;
}
