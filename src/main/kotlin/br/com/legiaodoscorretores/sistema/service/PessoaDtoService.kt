package br.com.legiaodoscorretores.sistema.service

import br.com.legiaodoscorretores.sistema.dto.NovaPessoaForm
import br.com.legiaodoscorretores.sistema.dto.PessoaView
import br.com.legiaodoscorretores.sistema.mapper.PessoaFormMapper
import br.com.legiaodoscorretores.sistema.mapper.PessoaViewMapper
import org.springframework.stereotype.Service

@Service
class PessoaDtoService(
    val pessoaService: PessoaService,
    val pessoaViewMapper: PessoaViewMapper,
    val pessoaFormMapper: PessoaFormMapper
) {
    fun listar(): List<PessoaView> {
        return pessoaService.listar().map {
            p -> pessoaViewMapper.map(p)
        }
    }

    fun cadastrar(novaPessoaForm: NovaPessoaForm) {
        pessoaService.cadastrar(pessoaFormMapper.map(novaPessoaForm))
    }

    fun atualizar(novaPessoaForm: NovaPessoaForm, idPessoa: Long) {
        pessoaService.atualizar(pessoaFormMapper.map(novaPessoaForm), idPessoa)
    }

    fun deletar(idPessoa: Long) {
        pessoaService.deletar(idPessoa)
    }
}