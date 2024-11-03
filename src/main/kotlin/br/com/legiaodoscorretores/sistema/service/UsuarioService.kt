package br.com.legiaodoscorretores.sistema.service

import br.com.legiaodoscorretores.sistema.exception.NotFoundException
import br.com.legiaodoscorretores.sistema.model.Usuario
import br.com.legiaodoscorretores.sistema.repository.UsuarioRepository
import org.springframework.stereotype.Service

@Service
class UsuarioService(
    private val usuarioRepository: UsuarioRepository,
    private val notFoundMessage: String = "Usuário não encontrado!"
) {
    fun listar(): List<Usuario> {
        return usuarioRepository.findAll()
    }

    fun buscarPorId(idUsuario: Long): Usuario {
        return usuarioRepository.findById(idUsuario).orElseThrow{NotFoundException(notFoundMessage)}
    }

    fun cadastrar(usuario: Usuario) {
        usuarioRepository.save(usuario)
    }

    fun atualizar(usuario: Usuario, idUsuario: Long) {
        val usuarioAnterior = usuarioRepository.findById(idUsuario).orElseThrow{ NotFoundException(notFoundMessage) }
        usuarioAnterior.senha = usuario.senha
    }

    fun deletar(idUsuario: Long) {
        usuarioRepository.deleteById(idUsuario)
    }
}