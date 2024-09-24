package main.java.collections.list.operacaoBasicas;

public class Produtos {
    private String nome;
    private double preco;
    private int quantidade;

    public Produtos(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public String toString() {
        return nome + " (R$ " + preco + ")";
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }
}