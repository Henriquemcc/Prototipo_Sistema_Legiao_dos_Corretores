package br.com.legiaodoscorretores.sistema

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SistemaApplication

fun main(args: Array<String>) {
	runApplication<SistemaApplication>(*args)
}
