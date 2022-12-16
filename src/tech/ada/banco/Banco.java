package tech.ada.banco;

// Menu
// Conta
// Cliente
// Gerente
// Pessoa

import tech.ada.banco.services.AberturaDeConta;
import tech.ada.banco.services.Deposito;
import tech.ada.banco.services.Menu;
import tech.ada.banco.services.MenuIngles;
import tech.ada.banco.services.ObterSaldo;
import tech.ada.banco.services.Pix;
import tech.ada.banco.services.Saque;
import tech.ada.banco.utils.LeitorTeclado;

/**
 * Sacar Dinheiro
 * Deposito dinheiro
 * Transferir
 * Abrir uma conta
 * Tomar um emprestimo
 */
public class Banco {

    public static void main(String[] args) {
        System.out.println("Bem vindo ao banco Ada.");
        Pix pix = new Pix();
        Deposito deposito = new Deposito();
        Saque saque = new Saque();
        Menu menu = new MenuIngles();
        boolean ligado = true;
        while (ligado) {
            menu.mostrar();
            int opcao = LeitorTeclado.getNumero("Digite uma das opções.");
            switch (opcao) {
                case 0:
                    System.out.println("O programa será finalizado. Te vejo depois!");
                    ligado = false;
                    break;

                case 1:
                    AberturaDeConta.executar();
                    break;

                case 2:
                    deposito.executar();
                    break;

                case 3:
                    saque.executar();
                    break;

                case 4:
                    pix.transferirDinheiro();
                    break;

                case 5:
                    ObterSaldo.executar();
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

}
