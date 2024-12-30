package com.example.demo.controller;

import com.example.demo.dto.ClienteDto;
import com.example.demo.request.ClienteRequest;
import com.example.demo.request.UsuarioRequest;
import com.example.demo.response.ClienteResponse;
import com.example.demo.response.UsuarioResponse;
import com.example.demo.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping("/obtener-cliente")
    public ResponseEntity<ClienteDto> obtenerCliente (){
        ClienteDto clienteDto= clienteService.obtenerCliente();
        return  ResponseEntity.ok(clienteDto);
    }
    @PostMapping(value = "/crear-cliente", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ClienteResponse> crearCliente(@RequestBody ClienteRequest clienteRequest) {
        ClienteResponse clienteResponse = clienteService.crearCliente(clienteRequest);
        return ResponseEntity.ok(clienteResponse);
    }
}
