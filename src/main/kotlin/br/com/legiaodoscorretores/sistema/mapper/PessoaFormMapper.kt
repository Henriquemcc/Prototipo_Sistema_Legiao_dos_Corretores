package br.com.legiaodoscorretores.sistema.mapper

import br.com.legiaodoscorretores.sistema.dto.NovaPessoaForm
import br.com.legiaodoscorretores.sistema.model.Pessoa
import org.springframework.stereotype.Component

@Component
class PessoaFormMapper: Mapper<NovaPessoaForm, Pessoa> {
    override fun map(t: NovaPessoaForm): Pessoa {
        return Pessoa(
            nome = t.nome,
            sobrenome = t.sobrenome,
            rg = t.rg,
            cpf = t.cpf,
            telefone = t.telefone,
            email = t.email
        )
    }
}