package tech.ada.banco.services;

import tech.ada.banco.exceptions.SaldoInsuficienteException;
import tech.ada.banco.model.Conta;
import tech.ada.banco.utils.LeitorTeclado;

import java.math.BigDecimal;

public final class Saque {

    public void executar() {
        // Etapa 1
        int numeroConta = LeitorTeclado.getNumero("Digite um número de conta.");

        executar(numeroConta);
    }

    public void executar(int numeroConta) {
        // Etapa 2
        Conta conta = Conta.obtemContaPeloNumero(numeroConta);

        executar(conta);
    }

    public void executar(Conta conta) {
        // Etapa 3
        int valor = LeitorTeclado.getNumero("Digite o valor que será sacado.");
        executar(conta, valor);
    }

    public void executar(Conta conta, int valor) {
        try {
            conta.saque(BigDecimal.valueOf(valor));
            System.out.println("O saldo resultante após o saque é de R$" + conta.getSaldo());
        } catch (SaldoInsuficienteException e) {
            System.err.println("Saque não pode ser efetuado pois o saldo de " + conta.getSaldo() + " foi insuficiente" +
                    ".");
        }
    }
}
