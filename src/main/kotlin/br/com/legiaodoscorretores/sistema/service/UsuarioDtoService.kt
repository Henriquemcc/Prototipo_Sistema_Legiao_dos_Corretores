package br.com.legiaodoscorretores.sistema.service

import br.com.legiaodoscorretores.sistema.dto.NovoUsuarioForm
import br.com.legiaodoscorretores.sistema.dto.UsuarioView
import br.com.legiaodoscorretores.sistema.mapper.UsuarioFormMapper
import br.com.legiaodoscorretores.sistema.mapper.UsuarioViewMapper
import org.springframework.stereotype.Service

@Service
class UsuarioDtoService(
    private val usuarioService: UsuarioService,
    private val usuarioViewMapper: UsuarioViewMapper,
    private val usuarioFormMapper: UsuarioFormMapper
) {
    fun listar(): List<UsuarioView> {
        return usuarioService.listar().map { u -> usuarioViewMapper.map(u) }
    }

    fun buscarPorId(idUsuario: Long): UsuarioView {
        return usuarioViewMapper.map(usuarioService.buscarPorId(idUsuario))
    }

    fun cadastrar(novoUsuarioForm: NovoUsuarioForm) {
        usuarioService.cadastrar(usuarioFormMapper.map(novoUsuarioForm))
    }

    fun atualizar(novoUsuarioForm: NovoUsuarioForm, idUsuario: Long) {
        usuarioService.atualizar(usuarioFormMapper.map(novoUsuarioForm), idUsuario)
    }

    fun deletar(idUsuario: Long) {
        usuarioService.deletar(idUsuario)
    }
}