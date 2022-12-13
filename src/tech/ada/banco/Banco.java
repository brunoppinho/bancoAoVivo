package tech.ada.banco;

// Menu
// Conta
// Cliente
// Gerente
// Pessoa

import tech.ada.banco.services.AberturaDeConta;
import tech.ada.banco.services.Pix;
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
        boolean ligado = true;
        while (ligado) {
            menu();
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
                    // TODO: Deposito valor
                    break;

                case 3:
                    // TODO: Sacar valor
                    break;

                case 4:
                    pix.transferirDinheiro();
                    break;

                case 5:
                    // TODO: Mostrar saldo
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    private static void menu() {
        System.out.println("Escolha uma das opções abaixo.");
        System.out.println("0 - Para Encerrar.");
        System.out.println("1 - Para abrir uma conta.");
        System.out.println("2 - Para depositar um valor.");
        System.out.println("3 - Para retirar um valor.");
        System.out.println("4 - Para realizar uma transferência via PIX.");
        System.out.println("5 - Obter saldo da conta.");

    }

}
