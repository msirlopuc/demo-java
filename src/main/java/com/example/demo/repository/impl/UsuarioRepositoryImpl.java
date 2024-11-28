package com.example.demo.repository.impl;

import com.example.demo.dto.UsuarioDto;
import com.example.demo.repository.UsuarioRepository;
import com.example.demo.request.UsuarioRequest;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioRepositoryImpl implements UsuarioRepository {

        @Override
        public UsuarioDto obtenerUsuario() {
            UsuarioDto usuarioDto = new UsuarioDto();
            usuarioDto.setNombres("Juan");
            usuarioDto.setApellidos("Perez");
            return usuarioDto;
        }


    @Override
    public UsuarioDto crearUsuario(UsuarioRequest usuarioRequest) {
        UsuarioDto usuarioDto = new UsuarioDto();
        usuarioDto.setNombres(usuarioRequest.getNombres());
        usuarioDto.setApellidos(usuarioRequest.getApellidos());
        return usuarioDto;
    }
}
