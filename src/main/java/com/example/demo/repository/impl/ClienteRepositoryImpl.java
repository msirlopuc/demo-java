package com.example.demo.repository.impl;

import com.example.demo.dto.ClienteDto;
import com.example.demo.repository.ClienteRepository;
import com.example.demo.request.ClienteRequest;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteRepositoryImpl implements ClienteRepository {
    @Override
    public ClienteDto obtenerCliente(){
            ClienteDto clienteDto= new ClienteDto();
            clienteDto.setNombre("Jeff");
            clienteDto.setEdad(31);
            return clienteDto;
        }

    @Override
    public ClienteDto crearCliente(ClienteRequest clienteRequest){
        ClienteDto clienteDto = new ClienteDto();
        clienteDto.setNombre(clienteRequest.getNombre());
        clienteDto.setEdad(clienteRequest.getEdad());
        return clienteDto;
    }
}
