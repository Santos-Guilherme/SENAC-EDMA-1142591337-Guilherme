package application;

import entities.Fila;
import entities.FilaAtendimento;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        FilaAtendimento filaDeAtendimento = new FilaAtendimento();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEscolha uma das opções abaixo:");
            System.out.println("1 - Adicionar senha comum:");
            System.out.println("2 - Adicionar senha preferencial:");
            System.out.println("3 - Chamar Próximo paciente:");
            System.out.println("4 - Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite a senha comum: ");
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
                    System.out.println("Fechando o programa. Até mais");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente Novamente.");
            }
        }
    }
}