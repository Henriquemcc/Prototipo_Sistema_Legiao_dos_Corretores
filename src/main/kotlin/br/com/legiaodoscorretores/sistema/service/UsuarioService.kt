package br.com.legiaodoscorretores.sistema.service

import br.com.legiaodoscorretores.sistema.repository.UsuarioRepository
import org.springframework.stereotype.Service

@Service
class UsuarioService(
    private val repository: UsuarioRepository
)