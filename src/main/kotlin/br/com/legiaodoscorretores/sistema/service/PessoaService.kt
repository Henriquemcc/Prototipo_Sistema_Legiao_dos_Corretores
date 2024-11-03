package br.com.legiaodoscorretores.sistema.service

import br.com.legiaodoscorretores.sistema.exception.NotFoundException
import br.com.legiaodoscorretores.sistema.model.Pessoa
import br.com.legiaodoscorretores.sistema.repository.PessoaRepository
import org.springframework.stereotype.Service

@Service
class PessoaService (
    private val pessoaRepository: PessoaRepository,
    private val notFoundMessage: String = "Pessoa não encontrada!"
) {
    fun listar(): List<Pessoa> {
        return pessoaRepository.findAll()
    }

    fun buscarPorId(idPessoa: Long): Pessoa {
        return pessoaRepository.findById(idPessoa).orElseThrow{ NotFoundException(notFoundMessage) }
    }

    fun cadastrar(pessoa: Pessoa): Pessoa {
        pessoaRepository.save(pessoa)
        return pessoa
    }

    fun atualizar(pessoa: Pessoa, idPessoa: Long): Pessoa {
        val pessoaAnterior = pessoaRepository.findById(idPessoa).orElseThrow{NotFoundException(notFoundMessage)}
        pessoaAnterior.nome = pessoa.nome
        pessoaAnterior.sobrenome = pessoa.sobrenome
        pessoaAnterior.rg = pessoa.rg
        pessoaAnterior.cpf = pessoa.cpf
        pessoaAnterior.telefone = pessoa.telefone
        pessoaAnterior.email = pessoa.email
        return pessoaAnterior
    }

    fun deletar(idPessoa: Long) {
        pessoaRepository.deleteById(idPessoa)
    }
}