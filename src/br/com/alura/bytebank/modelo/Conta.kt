package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException

abstract class Conta (
    var cliente: Cliente,
    val numero: Int
): Autenticavel {
    var saldo = 0.0
        protected set(valor) {
            if(valor > 0) {
                field = valor
            }
        }

    companion object {
        var total = 0
            private set
    }

    init {
        total++
    }

    fun deposita(valor: Double) {
        if(valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta, senha: Int) {
        if(this.saldo < valor){
            throw SaldoInsuficienteException(mensagem = "O saldo é insuficiente, o saldo atual: $saldo")
        }

        if(!autentica(senha)){
            throw FalhaAutenticacaoException()
        }

        this.saldo -= valor
        destino.deposita(valor)
    }

    override fun autentica(senha: Int): Boolean {
        return this.cliente.autentica(senha)
    }
}