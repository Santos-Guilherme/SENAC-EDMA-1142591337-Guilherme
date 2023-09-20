package application;

import entities.Fila;
import entities.FilaDeAtendimento;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FilaDeAtendimento filaDeAtendimento = new FilaDeAtendimento();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar senha normal:");
            System.out.println("2 - Adicionar senha preferencial:");
            System.out.println("3 - Chamar Próximo paciente:");
            System.out.println("4 - Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite a senha normal: ");
                    String senhaNormal = scanner.next();
                    filaDeAtendimento.adicionaSenha(senhaNormal, false);
                    break;
                case 2:
                    System.out.println("Digite a senha preferencial: ");
                    String senhaPreferencial = scanner.next();
                    filaDeAtendimento.adicionaSenha(senhaPreferencial, true);
                    break;
                case 3:
                    filaDeAtendimento.chamarProximo();
                    break;
                case 4:
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente Novamente.");
            }
        }
    }
}