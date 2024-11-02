package br.com.legiaodoscorretores.sistema.repository

import br.com.legiaodoscorretores.sistema.model.Pessoa
import org.springframework.data.jpa.repository.JpaRepository

interface PessoaRepository: JpaRepository<Pessoa, Long>