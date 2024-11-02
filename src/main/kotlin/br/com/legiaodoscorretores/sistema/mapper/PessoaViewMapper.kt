package br.com.legiaodoscorretores.sistema.mapper

import br.com.legiaodoscorretores.sistema.dto.PessoaView
import br.com.legiaodoscorretores.sistema.model.Pessoa
import org.springframework.stereotype.Component

@Component
class PessoaViewMapper: Mapper<Pessoa, PessoaView> {
    override fun map(t: Pessoa): PessoaView {
        return PessoaView(
            id = t.id,
            nome = t.nome,
            sobrenome = t.sobrenome,
            rg = t.rg,
            cpf = t.cpf,
            telefone = t.telefone,
            email = t.email
        )
    }
}