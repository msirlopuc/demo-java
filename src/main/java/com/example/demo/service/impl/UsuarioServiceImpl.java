package com.example.demo.service.impl;

import com.example.demo.dto.UsuarioDto;
import com.example.demo.repository.UsuarioRepository;
import com.example.demo.request.UsuarioRequest;
import com.example.demo.response.UsuarioResponse;
import com.example.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class UsuarioServiceImpl implements UsuarioService {


    @Autowired
    private UsuarioRepository repository;

    @Override
    public UsuarioDto obtenerUsuario() {
        UsuarioDto usuarioDto = repository.obtenerUsuario();
        return usuarioDto;
    }

    @Override
    public UsuarioResponse crearUsuario(UsuarioRequest usuarioRequest){

        UsuarioResponse usuarioResponse = new UsuarioResponse();
        usuarioResponse.setUsuario(repository.crearUsuario(usuarioRequest));
        usuarioResponse.setStatus("Usuario creado correctamente");
        return usuarioResponse;
    }
}
