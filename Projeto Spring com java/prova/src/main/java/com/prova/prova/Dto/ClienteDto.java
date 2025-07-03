package com.prova.prova.Dto;

import jakarta.validation.constraints.NotBlank;

public record ClienteDto(@NotBlank String nome,
                         @NotBlank String email,
                         @NotBlank String telefone,
                         @NotBlank Integer idade,
                         @NotBlank String cpf) {
}
