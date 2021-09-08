package br.com.alura.modelo

import br.com.alura.modelo.FuncionarioAdmin

class SistemaInterno {

    fun entra(funcAdmin: FuncionarioAdmin, senha: Int){
        if(funcAdmin.autentica(senha)) {
            println("Bem vindo ao ByteBank")
        } else {
            println("Falha na autenticação")
        }

    }

}