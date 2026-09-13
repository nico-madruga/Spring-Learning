package br.com.comofazisso.aprendendoafazerisso.mapper;

import br.com.comofazisso.aprendendoafazerisso.dto.UsuarioRequestDTO;
import br.com.comofazisso.aprendendoafazerisso.dto.UsuarioResponseDTO;
import br.com.comofazisso.aprendendoafazerisso.dto.UsuarioUpdateDTO;
import br.com.comofazisso.aprendendoafazerisso.entity.Usuario;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UsuarioMapper
{

    public Usuario toEntity(UsuarioRequestDTO usuarioRequest)
    {
        Usuario userDataRequest = new Usuario(
                usuarioRequest.nome(),
                usuarioRequest.email(),
                usuarioRequest.senha()
        );

        return userDataRequest;
    }

    public Usuario toEntity(UsuarioUpdateDTO usuarioUpdate)
    {
        Usuario userDataUpdate = new Usuario(
                usuarioUpdate.nome(),
                usuarioUpdate.email()
        );

        return userDataUpdate;
    }

    public UsuarioResponseDTO toDTO(Usuario usuario)
    {
        UsuarioResponseDTO userDataResponse = new UsuarioResponseDTO(
                usuario.getId(),
                usuario.getNome(),
                usuario.getEmail()
        );

        return userDataResponse;
    }

    public List<UsuarioResponseDTO> toDTOList(List<Usuario> usuarios)
    {
        return usuarios.stream()
            .map(this::toDTO)
            .toList();
    }

}
