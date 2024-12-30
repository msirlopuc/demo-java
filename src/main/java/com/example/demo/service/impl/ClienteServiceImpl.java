package com.example.demo.service.impl;

import com.example.demo.dto.ClienteDto;
import com.example.demo.repository.ClienteRepository;
import com.example.demo.request.ClienteRequest;
import com.example.demo.response.ClienteResponse;
import com.example.demo.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository repository;

    @Override
    public ClienteDto obtenerCliente() {
        ClienteDto clienteDto = repository.obtenerCliente();
        return clienteDto;
    }
    @Override
    public ClienteResponse crearCliente(ClienteRequest clienteRequest){

        ClienteResponse clienteResponse = new ClienteResponse();
        clienteResponse.setCliente(repository.crearCliente(clienteRequest));
        clienteResponse.setStatus("Cliente registrado correctamente");
        return clienteResponse;
    }
}
