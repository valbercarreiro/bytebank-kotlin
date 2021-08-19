class Gerente(val senha: Int, nome: String, cpf: String, salario: Double): Funcionario(nome, cpf, salario) {

    override fun bonificacao(): Double {
        return salario * 0.2
    }

    fun autentica(senha: Int): Boolean {
        if(this.senha == senha){
            return true
        }
        return false
    }
}