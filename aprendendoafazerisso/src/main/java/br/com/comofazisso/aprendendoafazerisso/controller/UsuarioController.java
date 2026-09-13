package br.com.comofazisso.aprendendoafazerisso.controller;

import br.com.comofazisso.aprendendoafazerisso.dto.UsuarioResponseDTO;
import br.com.comofazisso.aprendendoafazerisso.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/api/usuarios")
public class UsuarioController
{
    private final UsuarioService userService;


    public UsuarioController(UsuarioService userService)
    {
        this.userService = userService;
    }


    @GetMapping()
    public ResponseEntity<List<UsuarioResponseDTO>> listarUsuarios()
    {
        return ResponseEntity.ok(userService.listarUsuarios());
    }
}
