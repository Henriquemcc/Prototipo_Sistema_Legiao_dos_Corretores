package br.com.legiaodoscorretores.sistema.repository

import br.com.legiaodoscorretores.sistema.model.Usuario
import org.springframework.data.jpa.repository.JpaRepository

interface UsuarioRepository: JpaRepository<Usuario, Long>