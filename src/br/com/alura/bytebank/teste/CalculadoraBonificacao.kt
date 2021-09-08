package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Funcionario

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario){
        this.total += funcionario.bonificacao
    }

}