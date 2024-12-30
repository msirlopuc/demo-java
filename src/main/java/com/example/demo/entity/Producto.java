package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "producto", schema = "VENTA")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_producto;

    private String nombre;
    private float precio;
    private int stock;

    @OneToOne
    @JoinColumn(name = "id_categoria", nullable = false)
    private Categoria categoria;
}
