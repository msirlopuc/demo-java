package com.example.demo.service;

import com.example.demo.dto.ClienteDto;
import com.example.demo.request.ClienteRequest;
import com.example.demo.response.ClienteResponse;

public interface ClienteService {
    ClienteDto obtenerCliente();

    ClienteResponse crearCliente(ClienteRequest clienteRequest);
}
