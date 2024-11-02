package br.com.legiaodoscorretores.sistema.service

import br.com.legiaodoscorretores.sistema.model.Pessoa
import br.com.legiaodoscorretores.sistema.repository.PessoaRepository
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException
import org.springframework.stereotype.Service

@Service
class PessoaService (
    private val pessoaRepository: PessoaRepository
) {
    fun listar(): List<Pessoa> {
        return pessoaRepository.findAll()
    }

    fun cadastrar(pessoa: Pessoa) {
        pessoaRepository.save(pessoa)
    }

    fun atualizar(pessoa: Pessoa, idPessoa: Long) {
        val pessoaAnterior = pessoaRepository.findById(idPessoa).orElseThrow{NotFoundException()}
        pessoaAnterior.nome = pessoa.nome
        pessoaAnterior.sobrenome = pessoa.sobrenome
        pessoaAnterior.rg = pessoa.rg
        pessoaAnterior.cpf = pessoa.cpf
        pessoaAnterior.telefone = pessoa.telefone
        pessoaAnterior.email = pessoa.email
    }

    fun deletar(idPessoa: Long) {
        pessoaRepository.deleteById(idPessoa)
    }
}