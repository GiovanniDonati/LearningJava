package main.java.collections.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Numeros> numerosList;

    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numerosList.add(new Numeros(numero));
    }

    public List<Numeros> ordenarAscendente(){
        List<Numeros> numerosOrdenados = new ArrayList<>(numerosList);
        Collections.sort(numerosOrdenados);
        return numerosOrdenados;
    }

    public List<Numeros> ordenarDescendente(){
        List<Numeros> numerosOrdenados = new ArrayList<>(numerosList);
        Collections.sort(numerosOrdenados, Collections.reverseOrder());
        return numerosOrdenados;
    }
    public static void main(String[] args) {
        OrdenacaoNumeros ordenarNumeros = new OrdenacaoNumeros();
        ordenarNumeros.adicionarNumero(20);
        ordenarNumeros.adicionarNumero(5);
        ordenarNumeros.adicionarNumero(45);
        ordenarNumeros.adicionarNumero(3);
        ordenarNumeros.adicionarNumero(1);

        System.out.println(ordenarNumeros.numerosList);
        System.out.println(ordenarNumeros.ordenarAscendente());
        System.out.println(ordenarNumeros.ordenarDescendente());
    }
}
