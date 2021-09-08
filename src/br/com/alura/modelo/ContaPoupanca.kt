package br.com.alura.modelo

import br.com.alura.modelo.Conta

class ContaPoupanca(
    titular: String,
    numero: Int
) : Conta(
    titular,
    numero
) {
    override fun saca(valor: Double) {
        if(this.saldo >= valor) {
            this.saldo -= valor
        }
    }

}