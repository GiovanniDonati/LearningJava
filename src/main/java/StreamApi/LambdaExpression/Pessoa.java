package main.java.StreamApi.LambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private List<Pessoa> pessoaList;

    public ordenacaoPessoa(){
        this.pessoaList = new ArrayList<>();
    }

    public List<Pessoa> ordenacaoPorAltura(){
        if(!pessoaList.isEmpty()){
            List<Pessoa>pessoasPorAltura = new ArrayList<>(pessoaList);
            pessoasPorAltura.sort((p1,p2) -> Double.compare(p1.getAltura(), p2.getAltura()));
            return pessoasPorAltura;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
}
