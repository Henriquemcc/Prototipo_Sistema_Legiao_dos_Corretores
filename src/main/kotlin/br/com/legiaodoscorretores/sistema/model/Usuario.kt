package br.com.legiaodoscorretores.sistema.model

import jakarta.persistence.*
import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull

@Entity
data class Usuario(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Long,
    @OneToOne @NotNull
    val pessoa: Pessoa,
    @NotNull @NotEmpty
    var senha: String,
)