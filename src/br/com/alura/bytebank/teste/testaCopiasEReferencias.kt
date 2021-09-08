package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.ContaCorrente

fun testaCopiasEReferencias() {
    val contaFran = ContaCorrente("Fran", 2)
    contaFran.deposita( 100.0)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    val contaTeste = contaFran
    contaTeste.titular = "Teste"

    println(contaTeste.titular)
}