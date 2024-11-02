package br.com.legiaodoscorretores.sistema.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import org.hibernate.validator.constraints.br.CPF

@Entity
data class Pessoa (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @Size(max = 100)
    val nome: String,
    @Size(max = 100)
    val sobrenome: String,
    @Size(max = 14)
    val rg: String,
    @CPF
    val cpf: String,
    @Size(max = 15) @NotNull @NotEmpty
    val telefone: String,
    @Size(max = 254) @NotNull @NotEmpty
    val email: String
)