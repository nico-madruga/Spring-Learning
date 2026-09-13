package br.com.comofazisso.aprendendoafazerisso.controller;

import br.com.comofazisso.aprendendoafazerisso.dto.UsuarioRequestDTO;
import br.com.comofazisso.aprendendoafazerisso.dto.UsuarioResponseDTO;
import br.com.comofazisso.aprendendoafazerisso.entity.Usuario;
import br.com.comofazisso.aprendendoafazerisso.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping()
    public ResponseEntity<UsuarioResponseDTO> cadastrarUsuario(@RequestBody UsuarioRequestDTO userData)
    {
        return ResponseEntity.ok(userService.cadastrarUsuario(userData));
    }

    @GetMapping("")
    public ResponseEntity<List<UsuarioResponseDTO>> listarUsuarios()
    {
        return ResponseEntity.ok(userService.listarUsuarios());
    }

}
