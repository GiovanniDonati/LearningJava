package main.java.list.operacaoBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompra {
    private List<Produtos> produtosList;

    public CarrinhoCompra() {
        this.produtosList = new ArrayList<>();
    }

    public void adicionarItens(String nome, double preco, int quantidade) {
        produtosList.add(new Produtos(nome, preco, quantidade));
    }

    public void exibirItens() {
        System.out.println(produtosList);
    }

    public void calcularValorTotal() {
        int valorCarrinho = 0;
        for (Produtos p : produtosList) {
            valorCarrinho += p.getPreco();
        }
        System.out.println("Valor total: R$ " + valorCarrinho);
    }

    public void removerItem(String nome) {
        produtosList.removeIf(p -> p.getNome().equals(nome));
    }

    public static void main(String[] args) {
        CarrinhoCompra listaProdutos = new CarrinhoCompra();
        listaProdutos.adicionarItens("Coca-Cola", 10, 1);
        listaProdutos.adicionarItens("Hamburguer", 15, 2);
        listaProdutos.exibirItens();
        listaProdutos.calcularValorTotal();

        listaProdutos.removerItem("Coca-Cola");
        listaProdutos.exibirItens();
        listaProdutos.calcularValorTotal();
    }
}
