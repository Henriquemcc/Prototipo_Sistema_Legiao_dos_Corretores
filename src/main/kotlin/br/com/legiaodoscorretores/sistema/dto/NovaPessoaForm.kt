package br.com.legiaodoscorretores.sistema.dto

import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import org.hibernate.validator.constraints.br.CPF

data class NovaPessoaForm(
    @Size(max = 100)
    val nome: String,
    @Size(max = 100)
    var sobrenome: String,
    @Size(max = 14)
    var rg: String,
    @CPF
    var cpf: String,
    @Size(max = 15) @NotNull @NotEmpty
    var telefone: String,
    @Size(max = 254) @NotNull @NotEmpty
    var email: String
)
