package br.com.legiaodoscorretores.sistema.mapper

import br.com.legiaodoscorretores.sistema.dto.NovoUsuarioForm
import br.com.legiaodoscorretores.sistema.model.Usuario
import br.com.legiaodoscorretores.sistema.service.PessoaService
import org.springframework.stereotype.Component

@Component
class UsuarioFormMapper(
    val pesssoaService: PessoaService
): Mapper<NovoUsuarioForm, Usuario> {
    override fun map(t: NovoUsuarioForm): Usuario {
        return Usuario(
            pessoa = pesssoaService.buscarPorId(t.idPessoa),
            senha = t.senha,
        )
    }
}