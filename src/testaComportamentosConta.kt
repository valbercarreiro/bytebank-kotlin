fun testaComportamentosConta() {

    val contaValber = `Conta.kt`("Valber", 1)
    contaValber.deposita(1000000.0)

    val contaFran = `Conta.kt`(titular = "Fran", numero = 2)
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
    if (contaFran.transfere(10.0, contaValber)) {
        println("Transferência realizada com sucesso")
        println(contaValber.saldo)
        println(contaFran.saldo)
    } else {
        println("Transferência não realizada")
    }
}