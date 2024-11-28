package com.example.demo.controller;

import com.example.demo.dto.UsuarioDto;
import com.example.demo.request.UsuarioRequest;
import com.example.demo.response.UsuarioResponse;
import com.example.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/obtener-usuario")
    public ResponseEntity<UsuarioDto> obtenerUsuario() {
        UsuarioDto usuarioDto = usuarioService.obtenerUsuario();
        return ResponseEntity.ok(usuarioDto);
    }


    @PostMapping(value = "/crear-usuario", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UsuarioResponse> crearUsuario(@RequestBody UsuarioRequest usuarioRequest) {
        UsuarioResponse usuarioResponse = usuarioService.crearUsuario(usuarioRequest);
        return ResponseEntity.ok(usuarioResponse);
    }
}
