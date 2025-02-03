package main.java.StreamApi.LambdaExpression;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Pessoa {
    private List<Pessoa> pessoaList;

    public ordenacaoPessoa(){
        this.pessoaList = new ArrayList<>();
    }

    public List<Pessoa> ordenacaoPorAltura(){
        if(!pessoaList.isEmpty()){
            List<Pessoa>pessoasPorAltura = new ArrayList<>(pessoaList);
            pessoasPorAltura.sort(Comparator.comparingDouble(Pessoa::getAltura));
            return pessoasPorAltura;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
}