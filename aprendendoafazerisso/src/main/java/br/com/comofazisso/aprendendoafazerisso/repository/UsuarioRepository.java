package br.com.comofazisso.aprendendoafazerisso.repository;

import br.com.comofazisso.aprendendoafazerisso.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UsuarioRepository extends JpaRepository<Usuario, Long>
{
}
