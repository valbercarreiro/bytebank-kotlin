package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente

fun testaComportamentosConta() {

    val contaValber = ContaCorrente(Cliente("Valber", "11111111111", 1), 1)
    contaValber.deposita(1000000.0)

    val contaFran = ContaCorrente(cliente = Cliente("Fran", "11111111111", 1), numero = 2)
    contaFran.deposita(100.0)

    println(contaValber.cliente.nome)
    println(contaValber.numero)
    println(contaValber.saldo)

    println(contaFran.cliente.nome)
    println(contaFran.numero)
    println(contaFran.saldo)

    println("Depositando na conta do Valber")
    contaValber.deposita(1000.0)
    println(contaValber.saldo)

    println("Depositando na conta da Fran")
    contaFran.deposita(10.0)
    println(contaFran.saldo)

    println("Sacando na conta do Valber")
    contaValber.saca(1000.0)
    println(contaValber.saldo)

    println("Sacando na conta da Fran")
    contaFran.saca(10.0)
    println(contaFran.saldo)

    println("Transferindo para a conta do Valber")
    if (contaFran.transfere(10.0, contaValber)) {
        println("Transferência realizada com sucesso")
        println(contaValber.saldo)
        println(contaFran.saldo)
    } else {
        println("Transferência não realizada")
    }
}