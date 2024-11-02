package br.com.legiaodoscorretores.sistema.controller

import br.com.legiaodoscorretores.sistema.dto.NovoUsuarioForm
import br.com.legiaodoscorretores.sistema.dto.UsuarioView
import br.com.legiaodoscorretores.sistema.model.Usuario
import br.com.legiaodoscorretores.sistema.service.UsuarioDtoService
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
    private val usuarioDtoService: UsuarioDtoService
) {
    @GetMapping
    fun listar(): List<UsuarioView> {
        return usuarioDtoService.listar()
    }

    @GetMapping("/{idUsuario}")
    fun buscarPorId(@PathVariable idUsuario: Long): UsuarioView {
        return usuarioDtoService.buscarPorId(idUsuario)
    }

    @PostMapping
    @Transactional
    fun cadastrar(@RequestBody novoUsuarioForm: NovoUsuarioForm) {
        usuarioDtoService.cadastrar(novoUsuarioForm)
    }

    @PutMapping("/{idUsuario}")
    @Transactional
    fun atualizar(@RequestBody novoUsuarioForm: NovoUsuarioForm, @PathVariable idUsuario: Long) {
        usuarioDtoService.atualizar(novoUsuarioForm, idUsuario)
    }

    @DeleteMapping("/{idUsuario}")
    @Transactional
    fun deletar(@PathVariable idUsuario: Long) {
        usuarioDtoService.deletar(idUsuario)
    }
}