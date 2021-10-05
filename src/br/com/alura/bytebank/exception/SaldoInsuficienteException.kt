package br.com.alura.bytebank.exception

class SaldoInsuficienteException(mensagem: String = "O Saldo é insuficiente"): Exception(mensagem) {
}