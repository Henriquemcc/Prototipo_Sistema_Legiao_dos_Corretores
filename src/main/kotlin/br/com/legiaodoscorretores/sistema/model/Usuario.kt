package br.com.legiaodoscorretores.sistema.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import org.springframework.boot.autoconfigure.EnableAutoConfiguration

@Entity
@EnableAutoConfiguration
class Usuario(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val usuario: String,
    val senha: String,
)