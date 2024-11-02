package br.com.legiaodoscorretores.sistema.mapper

interface Mapper<T, U> {
    fun map(t: T): U
}