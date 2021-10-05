package br.com.alura.bytebank.teste

import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.Endereco

fun testaComportamentosConta() {

    val contaValber = ContaCorrente(Cliente(nome = "Valber", cpf =  "11111111111", endereco =  Endereco(), senha = 1), numero = 1)
    contaValber.deposita(1000000.0)

    val contaFran = ContaCorrente(cliente = Cliente(nome = "Fran",  cpf = "11111111111", endereco =  Endereco(), senha = 2), numero = 2)
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
    try {
        contaFran.transfere(10.0, contaValber, 1)
        println("Transferência realizada com sucesso")
        println(contaValber.saldo)
        println(contaFran.saldo)
    } catch (e: SaldoInsuficienteException){
        println("Falha na Transferência")
        println("Saldo insuficiente")
        e.printStackTrace()
    } catch (e: FalhaAutenticacaoException){
        println("Falha na Transferência")
        println("Falha na autenticação")
        e.printStackTrace()
    } catch (e: Exception){
        println("Erro desconhecido")
        e.printStackTrace()
    }

}