package ado1;
import java.util.ArrayList;
import java.util.Scanner;

public class Produto {
    private String nome;
    private String dataValidade;
    private String tipo;

    public Produto(String nome, String dataValidade, String tipo) {
        this.nome = nome;
        this.dataValidade = dataValidade;
        this.tipo = tipo;
    }
    public Produto() {
    }

    public String getNome() {
        return nome;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nData de Validade: " + dataValidade + "\nTipo: " + tipo;
    }

    private ArrayList<Produto> Vetor = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        Vetor.add(produto);
    }

    public boolean removerProduto(String nome) {
        for (Produto produto : Vetor) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                Vetor.remove(produto);
                return true;
            }
        }
        return false;
    }

    public void listarProdutos() {
        if (Vetor.isEmpty()) {
            System.out.println("O estoque está vazio.");
        } else {
            System.out.println("Produtos no estoque:");
            for (Produto produto : Vetor) {
                System.out.println(produto);
            }
        }
    }
}
