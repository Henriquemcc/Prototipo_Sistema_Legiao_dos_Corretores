package br.com.legiaodoscorretores.sistema.controller

import br.com.legiaodoscorretores.sistema.dto.NovaPessoaForm
import br.com.legiaodoscorretores.sistema.dto.PessoaView
import br.com.legiaodoscorretores.sistema.service.PessoaDtoService
import jakarta.transaction.Transactional
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.util.UriBuilder
import org.springframework.web.util.UriComponentsBuilder

@RestController
@RequestMapping("/pessoas")
class PessoaController(
    private val pessoaDtoService: PessoaDtoService
) {
    @GetMapping
    fun listar(): List<PessoaView> {
        return pessoaDtoService.listar()
    }

    @GetMapping("/{idPessoa}")
    fun buscarPorId(@PathVariable idPessoa: Long): PessoaView {
        return pessoaDtoService.buscarPorId(idPessoa)
    }

    @PostMapping
    @Transactional
    fun cadastrar(@RequestBody novaPessoaForm: NovaPessoaForm, uriComponentsBuilder: UriComponentsBuilder): ResponseEntity<PessoaView> {
        val pessoaView = pessoaDtoService.cadastrar(novaPessoaForm)
        val uri = uriComponentsBuilder.path("/pessoas/${pessoaView.id}").build().toUri()
        return ResponseEntity.created(uri).body(pessoaView)
    }

    @PutMapping("/{idPessoa}")
    @Transactional
    fun atualizar(@RequestBody novaPessoaForm: NovaPessoaForm, @PathVariable idPessoa: Long): ResponseEntity<PessoaView> {
        val pessoaView = pessoaDtoService.atualizar(novaPessoaForm, idPessoa)
        return ResponseEntity.ok(pessoaView)
    }

    @DeleteMapping("/{idPessoa}")
    @Transactional
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deletar(@PathVariable idPessoa: Long) {
        pessoaDtoService.deletar(idPessoa)
    }
}