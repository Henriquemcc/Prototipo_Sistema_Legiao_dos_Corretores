package br.com.legiaodoscorretores.sistema.controller

import br.com.legiaodoscorretores.sistema.model.Usuario
import br.com.legiaodoscorretores.sistema.service.UsuarioService
import jakarta.transaction.Transactional
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestPart
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/usuarios")
class UsuarioController(
    private val service: UsuarioService
) {
    @GetMapping
    fun listar(): List<Usuario> {
        return service.listar()
    }

    @PostMapping
    fun cadastrar(@RequestBody usuario: Usuario) {
        service.cadastrar(usuario)
    }

    @PutMapping("/{idUsuario}")
    @Transactional
    fun atualizar(@RequestBody usuario: Usuario, @PathVariable idUsuario: Long) {
        service.atualizar(usuario, idUsuario)
    }
}