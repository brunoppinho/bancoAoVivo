package tech.ada.banco.services;

import tech.ada.banco.model.Conta;
import tech.ada.banco.utils.LeitorTeclado;

import java.math.BigDecimal;

public class Pix {

    public void transferirDinheiro(Conta origem, Conta destino, BigDecimal valor) {
        if (valor.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("Operação não foi realizada pois o valor da transação é negativo.");
        }

        try {
            origem.saque(valor);
            destino.deposito(valor);
            System.out.println("Operação realizada com sucesso.");
        } catch (Exception e) {
            System.out.println("Operação não foi realizada.");
        }

    }

    public void transferirDinheiro() {
        int origem = LeitorTeclado.getNumero("Digite a conta de origem.");
        int destino = LeitorTeclado.getNumero("Digite a conta de origem.");
        int valor = LeitorTeclado.getNumero("Digite o valor a ser transferido");

        transferirDinheiro(Conta.obtemContaPeloNumero(origem), Conta.obtemContaPeloNumero(destino),
                BigDecimal.valueOf(valor));

    }
}
