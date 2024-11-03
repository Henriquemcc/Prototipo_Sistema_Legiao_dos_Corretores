package br.com.legiaodoscorretores.sistema.controller

import br.com.legiaodoscorretores.sistema.dto.NovoUsuarioForm
import br.com.legiaodoscorretores.sistema.dto.UsuarioView
import br.com.legiaodoscorretores.sistema.model.Usuario
import br.com.legiaodoscorretores.sistema.service.UsuarioDtoService
import br.com.legiaodoscorretores.sistema.service.UsuarioService
import jakarta.transaction.Transactional
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.util.UriComponentsBuilder

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
    fun cadastrar(@RequestBody novoUsuarioForm: NovoUsuarioForm, uriComponentsBuilder: UriComponentsBuilder): ResponseEntity<UsuarioView> {
        val usuarioView = usuarioDtoService.cadastrar(novoUsuarioForm)
        val uri = uriComponentsBuilder.path("/usuarios/").build().toUri()
        return ResponseEntity.created(uri).body(usuarioView)
    }

    @PutMapping("/{idUsuario}")
    @Transactional
    fun atualizar(@RequestBody novoUsuarioForm: NovoUsuarioForm, @PathVariable idUsuario: Long): ResponseEntity<UsuarioView> {
        val usuarioView = usuarioDtoService.atualizar(novoUsuarioForm, idUsuario)
        return ResponseEntity.ok(usuarioView)
    }

    @DeleteMapping("/{idUsuario}")
    @Transactional
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deletar(@PathVariable idUsuario: Long) {
        usuarioDtoService.deletar(idUsuario)
    }
}