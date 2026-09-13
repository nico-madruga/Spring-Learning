package br.com.comofazisso.aprendendoafazerisso.service;

import br.com.comofazisso.aprendendoafazerisso.dto.UsuarioRequestDTO;
import br.com.comofazisso.aprendendoafazerisso.dto.UsuarioResponseDTO;
import br.com.comofazisso.aprendendoafazerisso.dto.UsuarioUpdateDTO;
import br.com.comofazisso.aprendendoafazerisso.entity.Usuario;
import br.com.comofazisso.aprendendoafazerisso.mapper.UsuarioMapper;
import br.com.comofazisso.aprendendoafazerisso.repository.UsuarioRepository;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public UsuarioResponseDTO cadastrarUsuario(UsuarioRequestDTO usuario)
    {
        Usuario novoUser = userMap.toEntity(usuario);

        userRepo.save(novoUser);

        return userMap.toDTO(novoUser);
    }

    public List<UsuarioResponseDTO> listarUsuarios()
    {
        List<Usuario> users = userRepo.findAll();

        return userMap.toDTOList(users);
    }

    public UsuarioResponseDTO listarPorId(Long id)
    {
        Optional<Usuario> user = userRepo.findById(id);

        Usuario userEncontrado = user.orElseThrow(() -> new RuntimeException("Usuario não encontrado"));

        return userMap.toDTO(userEncontrado);
    }

    public UsuarioResponseDTO atualizar(Long id, UsuarioUpdateDTO userData)
    {
        Optional<Usuario> user = userRepo.findById(id);
        if(user.isPresent())
        {
            Usuario userAtualizado = user.get();

            userAtualizado.setNome(userData.nome());
            userAtualizado.setEmail(userData.email());

            userRepo.save(userAtualizado);
            return userMap.toDTO(userAtualizado);
        }

        return null;
    }
}
