package br.com.legiaodoscorretores.sistema.model

import jakarta.persistence.Entity
import jakarta.persistence.OneToOne
import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull

@Entity
data class Usuario(
    @OneToOne @NotNull
    val pessoa: Pessoa,
    @NotNull @NotEmpty
    val senha: String,
)