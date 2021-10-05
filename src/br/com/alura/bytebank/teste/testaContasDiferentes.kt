package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(Cliente(nome = "Alex", cpf = "22222222222", senha = 1), 1000)

    val contaPoupanca = ContaPoupanca(Cliente(nome = "Fran", cpf = "11111111111", senha = 1, endereco = Endereco(
        logradouro = "Rua vergueiros",
        numero = 15,
        bairro = "Teste",
        complemento = "Perto dalí",
        cidade = "São Paulo",
        estado = "SP",
        cep = "70000-000"
    )), 1001)

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("Nome Titular: ${contaCorrente.cliente.nome}")
    println("CPF Titular: ${contaCorrente.cliente.cpf}")
    println("Endereco: ${contaCorrente.cliente.endereco.logradouro}")
    println("Saldo corrente: ${contaCorrente.saldo}")
    println("Saldo poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("Saldo corrente após saque: ${contaCorrente.saldo}")
    println("Saldo poupança após saque: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca, 1)

    println("Saldo corrente após transferir p poupança: ${contaCorrente.saldo}")
    println("Saldo poupança após receber transferencia: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(100.0, contaCorrente, 1)

    println("Saldo corrente após receber transfencia: ${contaCorrente.saldo}")
    println("Saldo poupança após transferir p corrente: ${contaPoupanca.saldo}")
}