package br.com.legiaodoscorretores.sistema.controller

import br.com.legiaodoscorretores.sistema.model.Usuario
import br.com.legiaodoscorretores.sistema.service.UsuarioService
import jakarta.transaction.Transactional
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/usuarios")
class UsuarioController(
    private val usuarioService: UsuarioService
) {
    @GetMapping
    fun listar(): List<Usuario> {
        return usuarioService.listar()
    }

    @PostMapping
    @Transactional
    fun cadastrar(@RequestBody usuario: Usuario) {
        usuarioService.cadastrar(usuario)
    }

    @PutMapping("/{idUsuario}")
    @Transactional
    fun atualizar(@RequestBody usuario: Usuario, @PathVariable idUsuario: Long) {
        usuarioService.atualizar(usuario, idUsuario)
    }

    @DeleteMapping("/{idUsuario}")
    @Transactional
    fun deletar(@PathVariable idUsuario: Long) {
        usuarioService.deletar(idUsuario)
    }
}