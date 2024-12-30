package com.example.demo.repository;

import com.example.demo.dto.ClienteDto;
import com.example.demo.dto.UsuarioDto;
import com.example.demo.request.ClienteRequest;
import com.example.demo.request.UsuarioRequest;

public interface ClienteRepository {
    ClienteDto obtenerCliente();
    ClienteDto crearCliente(ClienteRequest clienteRequest);
}
