package br.com.comofazisso.aprendendoafazerisso.mapper;

import br.com.comofazisso.aprendendoafazerisso.dto.UsuarioRequestDTO;
import br.com.comofazisso.aprendendoafazerisso.dto.UsuarioResponseDTO;
import br.com.comofazisso.aprendendoafazerisso.entity.Usuario;

public class UsuarioMapper
{

    public Usuario toEntity(UsuarioRequestDTO usuarioRequest)
    {
        Usuario user = new Usuario();

        user.setNome("antonio");
        System.out.println(user.getNome());

        return user;
    }
}
