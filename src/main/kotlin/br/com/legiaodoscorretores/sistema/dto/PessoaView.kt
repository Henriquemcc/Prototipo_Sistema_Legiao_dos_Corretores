package br.com.legiaodoscorretores.sistema.dto

data class PessoaView(
    val id: Long?,
    val nome: String,
    val sobrenome: String,
    val rg: String,
    val cpf: String,
    val telefone: String,
    val email: String
)