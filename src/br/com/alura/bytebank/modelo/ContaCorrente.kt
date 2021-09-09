package br.com.alura.bytebank.modelo

class ContaCorrente(
    cliente: Cliente,
    numero: Int
) : Conta(
    cliente,
    numero
) {

    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if(this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
        }
    }
}