package br.unifor.unifor_bank.entidades

class ContaPoupanca(
        id: Long,
        agencia: Agencia,
        cliente: Pessoa,
        numero: Int,
        saldo: Double) : Conta(id, agencia, cliente, numero, saldo)