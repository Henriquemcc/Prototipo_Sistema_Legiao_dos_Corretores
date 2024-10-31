package br.com.legiaodoscorretores.sistema.model

import jakarta.validation.constraints.Email
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import org.hibernate.validator.constraints.br.CPF
import org.springframework.boot.autoconfigure.EnableAutoConfiguration

@Entity
@EnableAutoConfiguration
class Usuario(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val nome: String,
    val sobrenome: String,
    @CPF
    val cpf: String,
    @Email
    val email: String,
    val senha: String,
    val telefone: String,
)