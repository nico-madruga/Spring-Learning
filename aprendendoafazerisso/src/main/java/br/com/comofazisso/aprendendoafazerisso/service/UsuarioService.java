package br.com.comofazisso.aprendendoafazerisso.service;

import br.com.comofazisso.aprendendoafazerisso.dto.UsuarioResponseDTO;
import br.com.comofazisso.aprendendoafazerisso.entity.Usuario;
import br.com.comofazisso.aprendendoafazerisso.mapper.UsuarioMapper;
import br.com.comofazisso.aprendendoafazerisso.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService
{
    private final UsuarioMapper userMap;
    private final UsuarioRepository userRepo;

    public  UsuarioService(UsuarioMapper userMap, UsuarioRepository userRepo)
    {
        this.userMap = userMap;
        this.userRepo = userRepo;
    }

    public List<UsuarioResponseDTO> listarUsuarios()
    {
        List<Usuario> usuarios = userRepo.findAll();

        return userMap.toDTOList(usuarios);
    }
}
