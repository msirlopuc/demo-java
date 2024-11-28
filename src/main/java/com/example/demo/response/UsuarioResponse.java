package com.example.demo.response;

import com.example.demo.dto.UsuarioDto;
import lombok.Data;

@Data
public class UsuarioResponse {
    private String status;
    private UsuarioDto usuario;
}
