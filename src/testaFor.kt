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