package br.com.legiaodoscorretores.sistema.controller

import br.com.legiaodoscorretores.sistema.service.UsuarioService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/usuario")
class UsuarioController(
    private val service: UsuarioService
)