package main.java.collections.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtomaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                if(p.getPreco() > maiorPreco){
                    produtomaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }
        return produtomaisCaro;
    }

    public static void main(String[] args){
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProduto(31364, "Placa evaporativa", 5, 35);
        estoque.adicionarProduto(7776, "Motor", 1, 50);
        estoque.adicionarProduto(21766, "sei lá", 2, 20);

        estoque.exibirProdutos();
        System.out.println(estoque.obterProdutoMaisCaro());
        System.out.println(estoque.calcularValorTotalEstoque());
    }

}
