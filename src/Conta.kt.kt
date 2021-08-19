class `Conta.kt`(
    var titular: String,
    val numero: Int
) {
    var saldo = 0.0
        private set(valor) {
            if(valor > 0) {
                field = valor
            }
        }

    fun deposita(valor: Double) {
        if(valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if(this.saldo >= valor) {
            this.saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: `Conta.kt`): Boolean {
        if(this.saldo >= valor) {
            this.saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}