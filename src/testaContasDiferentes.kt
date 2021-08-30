fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente("Alex", 1000)

    val contaPoupanca = ContaPoupanca("Fran", 1001)

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("Saldo corrente: ${contaCorrente.saldo}")
    println("Saldo poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("Saldo corrente após saque: ${contaCorrente.saldo}")
    println("Saldo poupança após saque: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("Saldo corrente após transferir p poupança: ${contaCorrente.saldo}")
    println("Saldo poupança após receber transferencia: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(100.0, contaCorrente)

    println("Saldo corrente após receber transfencia: ${contaCorrente.saldo}")
    println("Saldo poupança após transferir p corrente: ${contaPoupanca.saldo}")
}