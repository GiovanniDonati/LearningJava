package main.java.collections.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> listaNumeros = new ArrayList();

    public SomaNumeros(List<Integer> listaNumeros) {
        this.listaNumeros = listaNumeros;
    }

    public List<Integer> getListaNumeros() {
        return listaNumeros;
    }

    public int adicionarNumero(int numero){
        listaNumeros.add(numero);
        return numero;
    }

    public void calcularSoma(){
        int soma = 0;
        for(int n : listaNumeros){
            soma += n;
        }
        System.out.println(soma);
    }

    public void encontrarMaiorNumero(){
        int maiorNumero = listaNumeros.get(0);
        for(int n : listaNumeros){
            if(n > maiorNumero){
                maiorNumero = n;
            }
        }
        System.out.println(maiorNumero);
    }
    public void encontrarMenorNumero(){
        int menorNumero = listaNumeros.get(0);
        for(int n : listaNumeros){
            if(n < menorNumero){
                menorNumero = n;
            }
        }
        System.out.println(menorNumero);
    }
    public void exibirNumeros(){
        System.out.println(listaNumeros);
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros(new ArrayList());
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(30);
        somaNumeros.adicionarNumero(6);
        somaNumeros.adicionarNumero(17);
        somaNumeros.adicionarNumero(59);
        somaNumeros.calcularSoma();
        somaNumeros.encontrarMaiorNumero();
        somaNumeros.encontrarMenorNumero();
        somaNumeros.exibirNumeros();
    }
}
