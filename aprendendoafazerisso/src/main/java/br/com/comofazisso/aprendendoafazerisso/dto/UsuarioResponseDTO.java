package br.com.comofazisso.aprendendoafazerisso.dto;

import jakarta.validation.constraints.Positive;

public record UsuarioResponseDTO(
        @Positive
        Long id,
        String nome,
        String email
)
{

}
