package com.example.demo.service;

import com.example.demo.dto.UsuarioDto;
import com.example.demo.request.UsuarioRequest;
import com.example.demo.response.UsuarioResponse;

public interface UsuarioService {
    UsuarioDto obtenerUsuario();

    UsuarioResponse crearUsuario(UsuarioRequest usuarioRequest);
}
