package com.example.demo.controller;

import com.example.demo.dto.UsuarioDto;
import com.example.demo.entity.Producto;
import com.example.demo.request.EditarProductoRequest;
import com.example.demo.request.UsuarioRequest;
import com.example.demo.response.UsuarioResponse;
import com.example.demo.service.ProductoService;
import com.example.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/listar-productos")
    public ResponseEntity<List<Producto>> listarProductos() {
        List<Producto> productos = productoService.listarProductos();
        return ResponseEntity.ok(productos);
    }


    @PostMapping("/editar-producto/{id}")
    public ResponseEntity<Producto> editarProducto(@RequestBody EditarProductoRequest editarProductoRequest,@PathVariable Long id) {
        Producto producto = productoService.editarProducto(editarProductoRequest, id);
        return ResponseEntity.ok(producto);
    }
}
