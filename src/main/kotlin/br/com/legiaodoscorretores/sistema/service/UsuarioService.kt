package br.com.legiaodoscorretores.sistema.service

import br.com.legiaodoscorretores.sistema.model.Usuario
import br.com.legiaodoscorretores.sistema.repository.UsuarioRepository
import org.springframework.stereotype.Service

@Service
class UsuarioService(
    private val usuarioRepository: UsuarioRepository
) {
    fun listar(): List<Usuario> {
        return usuarioRepository.findAll()
    }

    fun cadastrar(usuario: Usuario) {
        usuarioRepository.save(usuario)
    }
}