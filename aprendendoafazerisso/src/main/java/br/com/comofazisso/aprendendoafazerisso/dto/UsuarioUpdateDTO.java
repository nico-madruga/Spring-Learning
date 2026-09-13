package br.com.comofazisso.aprendendoafazerisso.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UsuarioUpdateDTO(

        @NotBlank
        @Size(min = 3, max = 100, message = "Nome must be between 3 and 100 letters long")
        String nome,

        @Email
        @NotBlank
        String email
) {
}
