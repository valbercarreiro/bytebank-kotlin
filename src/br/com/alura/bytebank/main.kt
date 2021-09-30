package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

fun main(){
    println("Inicio main")
    funcao1()
    var retorno = tryExpression("ab")
    println("retorno conversão: $retorno")
    println("Fim main")
}

fun funcao1() {
    println("Inicio funcao1")
    try{
        funcao2()
    } catch (e: ClassCastException){
        e.printStackTrace()
        println("ClassCastException lançada")
    }
    println("Fim funcao1")
}

fun funcao2(){
    println("Inicio funcao2")
    for (i in 1..5){
        println(i)
        var endereco = Any()
        endereco as Endereco
    }
    println("Fim funcao2")
}

fun tryExpression(str: String): Int? {
    return try { str.toInt() } catch (e: NumberFormatException) { null }
}