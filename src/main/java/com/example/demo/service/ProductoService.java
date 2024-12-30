package com.example.demo.service;

import com.example.demo.entity.Producto;
import com.example.demo.request.EditarProductoRequest;

import java.util.List;

public interface ProductoService {
    List<Producto> listarProductos();

    Producto editarProducto(EditarProductoRequest editarProductoRequest, Long id);
    Producto nuevoProducto(EditarProductoRequest editarProductoRequest);
}
