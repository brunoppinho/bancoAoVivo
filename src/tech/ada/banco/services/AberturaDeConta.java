package tech.ada.banco.services;

import tech.ada.banco.model.CPF;
import tech.ada.banco.model.Conta;
import tech.ada.banco.model.ContaEspecial;
import tech.ada.banco.model.Documento;
import tech.ada.banco.model.ModalidadeConta;
import tech.ada.banco.model.Pessoa;
import tech.ada.banco.utils.LeitorTeclado;

import java.time.LocalDate;
import java.util.Scanner;

public class AberturaDeConta {

    public static void executar() {
        Scanner entrada = new Scanner(System.in);

        String nome;
        LocalDate dataNascimento;
        Documento cpf;
        ModalidadeConta tipo;

        nome = getNome(entrada);
        dataNascimento = getDataNascimento(entrada);
        cpf = getCpF(entrada);
        tipo = getModalidadeConta();

        Pessoa titular = new Pessoa(nome, cpf, dataNascimento);
        escolheModeloConta(entrada, tipo, titular);
    }

    private static ModalidadeConta getModalidadeConta() {
        int modalidade = LeitorTeclado.getNumero("Você quer criar uma conta corrente ou poupança?\n0 - para " +
                "corrente\n1 - para poupança");
        if (modalidade == 0) {
            return ModalidadeConta.CONTA_CORRENTE;
        } else if (modalidade == 1) {
            return ModalidadeConta.CONTA_POUPANCA;
        } else {
            return getModalidadeConta();
        }
    }

    private static Conta escolheModeloConta(Scanner entrada, ModalidadeConta tipo, Pessoa titular) {
        Conta conta = null;
        System.out.println("Você quer ter limite de cheque especial ( S/N )?");
        String opcao = entrada.nextLine();
        boolean controle = true;
        while (controle) {
            if (opcao.equalsIgnoreCase("S")) {
                conta = new ContaEspecial(tipo, titular);
                controle = false;
            } else if (opcao.equalsIgnoreCase("N")) {
                conta = new Conta(tipo, titular);
                controle = false;
            } else {
                System.out.println("Tente novamente. ");
                System.out.println("Você quer ter limite de cheque especial ( S/N )?");
            }
        }
        return conta;
    }

    private static CPF getCpF(Scanner entrada) {
        System.out.println("Digite o número do seu CPF ");
        String valor = entrada.nextLine();
        CPF cpf = new CPF(valor);
        return cpf;
    }

    private static LocalDate getDataNascimento(Scanner entrada) {
        try {
            System.out.println("Digite sua data de nascimento(YYYY-MM-DD): ");
            String dataNascimento = entrada.nextLine();
            return LocalDate.parse(dataNascimento);
        } catch (Exception e) {
            System.out.println("Tente novamente.");
            return getDataNascimento(entrada);
        }
    }

    private static String getNome(Scanner entrada) {
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        return nome;
    }
}
