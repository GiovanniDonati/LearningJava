package main.java.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompra {
    private List<Produtos> produtosList;

    public CarrinhoCompra() {
        this.produtosList = new ArrayList<>();
    }

    public void adicionarItens(String nome, double preco, int qunatidade) {
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
        listaProdutos.adicionarProdutos("Coca-Cola", 10, 1);
        listaProdutos.adicionarProdutos("Hamburguer", 15, 2);
        listaProdutos.exibirItens();
        listaProdutos.calcularValorTotal();

        listaProdutos.removerItem("Coca-Cola");
        listaProdutos.exibirItens();
        listaProdutos.calcularValorTotal();
    }
}
