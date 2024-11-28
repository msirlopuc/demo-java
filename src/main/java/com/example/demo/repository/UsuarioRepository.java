package com.example.demo.repository;

import com.example.demo.dto.UsuarioDto;
import com.example.demo.request.UsuarioRequest;

public interface UsuarioRepository {
    UsuarioDto obtenerUsuario();
    UsuarioDto crearUsuario(UsuarioRequest usuarioRequest);
}
