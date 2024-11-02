package br.com.legiaodoscorretores.sistema.dto

import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull

class NovoUsuarioForm(
    @NotNull
    val idPessoa: Long,
    @NotNull @NotEmpty
    val senha: String
)