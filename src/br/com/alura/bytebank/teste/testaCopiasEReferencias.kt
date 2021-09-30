package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.Endereco

fun testaCopiasEReferencias() {
    val contaFran = ContaCorrente(Cliente("Fran", "11111111111", Endereco(),1), 2)
    contaFran.deposita( 100.0)

    println(contaFran.cliente.nome)
    println(contaFran.numero)
    println(contaFran.saldo)

    val contaTeste = contaFran
    contaTeste.cliente.nome = "Teste"

    println(contaTeste.cliente.nome)
}