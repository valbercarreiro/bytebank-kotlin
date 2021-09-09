package br.com.alura.bytebank.modelo

class ContaPoupanca(
    cliente: Cliente,
    numero: Int
) : Conta(
    cliente,
    numero
) {
    override fun saca(valor: Double) {
        if(this.saldo >= valor) {
            this.saldo -= valor
        }
    }

}