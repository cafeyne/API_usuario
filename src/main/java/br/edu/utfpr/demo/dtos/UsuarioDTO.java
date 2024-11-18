package br.edu.utfpr.demo.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record UsuarioDTO(
        Long id,

        @NotNull
        @Size(min = 3, max = 100)
        String nome,

        @NotNull
        @Email
        String email
) {}
