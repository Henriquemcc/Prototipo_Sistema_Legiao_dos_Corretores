package br.com.legiaodoscorretores.sistema.service

import br.com.legiaodoscorretores.sistema.model.Usuario
import br.com.legiaodoscorretores.sistema.repository.UsuarioRepository
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException
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

    fun atualizar(usuario: Usuario, idUsuario: Long) {
        val usuarioRemovido = usuarioRepository.findById(idUsuario).orElseThrow{NotFoundException()}
        usuarioRemovido.usuario = usuario.usuario
        usuarioRemovido.senha = usuario.senha
    }
}