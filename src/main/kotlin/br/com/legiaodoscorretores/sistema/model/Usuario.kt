package br.com.legiaodoscorretores.sistema.model

import jakarta.validation.constraints.Email
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import org.hibernate.validator.constraints.br.CPF

@Entity
class Usuario(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val nome: String,
    val sobrenome: String,
    val cpf: CPF,
    val email: Email,
    val senha: String,
    val telefone: String,
)