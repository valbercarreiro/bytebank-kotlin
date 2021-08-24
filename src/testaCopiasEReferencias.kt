fun testaCopiasEReferencias() {
    val contaFran = `Conta.kt`("Fran", 2)
    contaFran.deposita( 100.0)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    val contaTeste = contaFran
    contaTeste.titular = "Teste"

    println(contaTeste.titular)
}