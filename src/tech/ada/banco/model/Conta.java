package tech.ada.banco.model;

import tech.ada.banco.exceptions.SaldoInsuficienteException;

import java.math.BigDecimal;

public class Conta {

    private static int contadorDeContas = 0;
    private static Conta[] contas = new Conta[100];
    private final ModalidadeConta tipo;
    protected BigDecimal saldo;
    private int numeroConta;
    private final String agencia;
    private final Pessoa titular;

    public Conta(ModalidadeConta tipo, Pessoa titular) {
        this.tipo = tipo;
        this.titular = titular;
        agencia = "0001";
        saldo = BigDecimal.ZERO;
        escolheNumeroConta();
        contas[contadorDeContas - 1] = this;
    }

    public static Conta obtemContaPeloNumero(int numeroConta) {
        return Conta.contas[numeroConta - 1];
    }

    private void escolheNumeroConta() {
        contadorDeContas++;
        numeroConta = contadorDeContas;
    }

    public ModalidadeConta getTipo() {
        return tipo;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void deposito(BigDecimal valor) {
        if (valor.compareTo(BigDecimal.ZERO) < 0) {
            throw new RuntimeException("Valor menor que zero!");
        }

        saldo = saldo.add(valor);
    }

    public void saque(BigDecimal valor) {
        if (valor.compareTo(BigDecimal.ZERO) < 0) {
            throw new RuntimeException("Valor menor que zero!");
        }

        if (valor.compareTo(saldo) > 0) {
            throw new SaldoInsuficienteException();
        } else {
            saldo = saldo.subtract(valor);
        }
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public Pessoa getTitular() {
        return titular;
    }

}
