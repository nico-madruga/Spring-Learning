package br.com.comofazisso.aprendendoafazerisso.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.format.annotation.NumberFormat;

public record UsuarioRequestDTO(

        @NotBlank
        @Size(min = 3, max = 100, message = "Name must be between 3 and 100 letters long")
        String nome,

        @Email
        @NotBlank
        String email,

        @Size(min = 8, message = "The password be 8 characters long")
        String senha
)
{
}
