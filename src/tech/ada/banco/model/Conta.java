package tech.ada.banco.model;

import java.math.BigDecimal;
import java.util.Random;

public class Conta {

    private static int contadorDeContas = 0;
    private ModalidadeConta tipo;
    private BigDecimal saldo;
    private int numeroConta;
    private String agencia;
    private Pessoa titular;

    public Conta(ModalidadeConta tipo, Pessoa titular) {
        this.tipo = tipo;
        this.titular = titular;
        agencia = "0001";
        saldo = BigDecimal.ZERO;
        escolheNumeroConta();
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
        saldo = saldo.add(valor);
    }

    public void saque(BigDecimal valor) {
        saldo = saldo.subtract(valor);
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
