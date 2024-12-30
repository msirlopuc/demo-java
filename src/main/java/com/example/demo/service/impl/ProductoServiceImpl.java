package com.example.demo.service.impl;

import com.example.demo.entity.Categoria;
import com.example.demo.entity.Producto;
import com.example.demo.repository.CategoriaRepository;
import com.example.demo.repository.ProductoRepository;
import com.example.demo.request.EditarProductoRequest;
import com.example.demo.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Producto> listarProductos(){
        return productoRepository.findAll();
    }

    public Producto editarProducto(EditarProductoRequest editarProductoRequest, Long id){
        Producto productoActualizado = productoRepository.findById(id)
                .map(producto -> {
                    producto.setPrecio(editarProductoRequest.getPrecio());
                    producto.setStock(editarProductoRequest.getStock());
                    return productoRepository.save(producto);
                }).orElseThrow();
        return productoActualizado;
    }

    public Producto nuevoProducto(EditarProductoRequest editarProductoRequest){
        Producto nuevoProducto = new Producto();
        nuevoProducto.setNombre(editarProductoRequest.getNombre());
        nuevoProducto.setPrecio(editarProductoRequest.getPrecio());
        nuevoProducto.setStock(editarProductoRequest.getStock());

        Categoria categoria = categoriaRepository.findById(editarProductoRequest.getId_categoria()).orElseThrow();

        nuevoProducto.setCategoria(categoria);
        return productoRepository.save(nuevoProducto);
    }
}
