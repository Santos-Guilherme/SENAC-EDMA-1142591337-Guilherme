package ado1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Produto produto = new Produto();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Remover Produto");
            System.out.println("3. Listar Produtos");
            System.out.println("4. Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a data de validade do produto: ");
                    String dataValidade = scanner.nextLine();
                    System.out.print("Digite o tipo do produto (limpeza, alimento, higiene pessoal): ");
                    String tipo = scanner.nextLine();
                    Produto novoProduto = new Produto(nome, dataValidade, tipo);
                    produto.adicionarProduto(novoProduto);
                    System.out.println("Produto adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o nome do produto a ser removido: ");
                    String nomeRemover = scanner.nextLine();

                    // Chamando o método removerProduto do estoque
                    boolean produtoRemovido = produto.removerProduto(nomeRemover);

                    if (produtoRemovido) {
                        System.out.println("Produto removido com sucesso!");
                    } else {
                        System.out.println("Produto não encontrado no estoque.");
                    }
                    break;
                case 3:
                    produto.listarProdutos();
                    break;
                case 4:
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}

