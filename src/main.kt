fun main(){
    println("Bem vindo ao ByteBank")

    val contaValber = Conta("Valber", 1)
    contaValber.deposita(1000000.0)

    val contaFran = Conta(titular = "Fran", numero = 2)
    contaFran.deposita(100.0)

    println(contaValber.titular)
    println(contaValber.numero)
    println(contaValber.saldo)

    println(contaFran.titular)
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
    if(contaFran.transfere(10.0, contaValber)) {
        println("Transferência realizada com sucesso")
        println(contaValber.saldo)
        println(contaFran.saldo)
    } else {
        println("Transferência não realizada")
    }

}

class Conta(
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

    fun transfere(valor: Double, destino: Conta): Boolean {
        if(this.saldo >= valor) {
            this.saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}

fun testaCopiasEReferencias() {
    val contaFran = Conta("Fran", 2)
    contaFran.deposita( 100.0)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    val contaTeste = contaFran
    contaTeste.titular = "Teste"

    println(contaTeste.titular)
}

fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }
}

fun testaFor() {
    for (i in 1..10) {
        val titular: String = "Alex $i"
        val numeroConta: Int = 1000
        var saldo: Double = 0.0
        saldo = 100.0
        saldo += 200

        println("Titular $titular")
        println("Numero da Conta $numeroConta")
        println("Saldo da conta $saldo")
    }

    for (i in 10 downTo 1) {
        println(i)
    }

    for (i in 10 downTo 1 step 2) {
        println(i)
    }
}

fun testaWhile() {
    var i = 10
    while (i < 5) {
        println(i)
        i++
    }
}