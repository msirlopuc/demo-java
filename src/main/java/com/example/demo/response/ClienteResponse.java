package com.example.demo.response;

import com.example.demo.dto.ClienteDto;
import com.example.demo.dto.UsuarioDto;
import lombok.Data;
@Data
public class ClienteResponse {
    private String status;
    private ClienteDto cliente;
}
