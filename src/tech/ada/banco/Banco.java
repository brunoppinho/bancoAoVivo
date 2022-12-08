package tech.ada.banco;

// Menu
// Conta
// Cliente
// Gerente
// Pessoa

import tech.ada.banco.model.Pessoa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Sacar Dinheiro
 * Depositar dinheiro
 * Transferir
 * Abrir uma conta
 * Tomar um emprestimo
 */
public class Banco {

    public static void main(String[] args) {
        System.out.println("Bem vindo ao banco Ada.");

        Pessoa pessoa1 = new Pessoa("Bruno", "12345678922", "2000-03-11");
        pessoa1.setDataNascimento(LocalDate.parse("2100-03-11"));
//        Pessoa pessoa2 = new Pessoa("Eduardo", "000000000000", "28/02/2002", "11968399600");
        System.out.println("O nome da pessoa1 é " + pessoa1.getNome());
        System.out.println("O cpf da pessoa1 é " + pessoa1.getCpf());
        System.out.println("O dataNascimento da pessoa1 é " + pessoa1.getDataNascimento());
        System.out.println("O telefone da pessoa1 é " + pessoa1.getTelefone());

        pessoa1.toString();
//        System.out.println("O nome da pessoa2 é " + pessoa2.nome);
//        System.out.println("O cpf da pessoa2 é " + pessoa2.cpf);
//        System.out.println("O dataNascimento da pessoa2 é " + pessoa2.dataNascimento);
//        System.out.println("O telefone da pessoa2 é " + pessoa2.telefone);

        System.out.println(pessoa1.toString());
//        System.out.println(pessoa2.toString());
    }

    private static String getNome() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um nome");
        return entrada.nextLine();
    }

}
