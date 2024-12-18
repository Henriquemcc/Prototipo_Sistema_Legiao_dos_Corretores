package br.com.legiaodoscorretores.sistema.mapper

import br.com.legiaodoscorretores.sistema.dto.UsuarioView
import br.com.legiaodoscorretores.sistema.model.Usuario
import org.springframework.stereotype.Component

@Component
class UsuarioViewMapper: Mapper<Usuario, UsuarioView> {
    override fun map(t: Usuario): UsuarioView {
        return UsuarioView(
            id = t.id,
            pessoaId = t.pessoa.id
        )
    }
}