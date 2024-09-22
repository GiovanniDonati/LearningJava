package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoasList;

    public OrdenacaoPessoas() {
        this.pessoasList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoasList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenarpessoas = new OrdenacaoPessoas();
        ordenarpessoas.adicionarPessoa("Giovanni", 25, 1.76);
        ordenarpessoas.adicionarPessoa("Kemili", 21, 1.60);
        ordenarpessoas.adicionarPessoa("Malia", 1, 0.51);

        System.out.println(ordenarpessoas.ordenarPorIdade());
        System.out.println(ordenarpessoas.ordenarPorAltura());
    }
}
