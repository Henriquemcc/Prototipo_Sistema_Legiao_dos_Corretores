package br.com.legiaodoscorretores.sistema.controller

import br.com.legiaodoscorretores.sistema.dto.NovaPessoaForm
import br.com.legiaodoscorretores.sistema.dto.PessoaView
import br.com.legiaodoscorretores.sistema.service.PessoaDtoService
import jakarta.transaction.Transactional
import org.springframework.web.bind.annotation.*

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
    fun cadastrar(@RequestBody novaPessoaForm: NovaPessoaForm) {
        pessoaDtoService.cadastrar(novaPessoaForm)
    }

    @PutMapping("/{idPessoa}")
    @Transactional
    fun atualizar(@RequestBody novaPessoaForm: NovaPessoaForm, @PathVariable idPessoa: Long) {
        pessoaDtoService.atualizar(novaPessoaForm, idPessoa)
    }

    @DeleteMapping("/{idPessoa}")
    @Transactional
    fun deletar(@PathVariable idPessoa: Long) {
        pessoaDtoService.deletar(idPessoa)
    }
}