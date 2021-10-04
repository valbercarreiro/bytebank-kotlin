package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exception.SaldoInsuficienteException

abstract class Conta (
    var cliente: Cliente,
    val numero: Int
) {
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

    fun transfere(valor: Double, destino: Conta) {
        if(this.saldo < valor){
            throw SaldoInsuficienteException()
        }

        this.saldo -= valor
        destino.deposita(valor)
    }
}