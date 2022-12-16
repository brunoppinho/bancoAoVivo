package tech.ada.banco.services;

import tech.ada.banco.model.Conta;
import tech.ada.banco.utils.LeitorTeclado;

import java.math.BigDecimal;

public class ObterSaldo {

    public static void executar() {
        int numeroConta = LeitorTeclado.getNumero("Digite o número da conta.");
        Conta conta = Conta.obtemContaPeloNumero(numeroConta);

        executar(conta);
    }

    public static void executar(Conta conta) {
        System.out.println("O saldo da conta " + conta.getNumeroConta() + " é de R$" + conta.getSaldo());
    }
}
