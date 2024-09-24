package main.java.collections.set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        if (convidadoParaRemover != null) {
            convidadoSet.remove(convidadoParaRemover);
        } else {
            System.out.println("Convidado não encontrado");
        }
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        conjuntoConvidados.adicionarConvidado("Giovanni", 123);
        conjuntoConvidados.adicionarConvidado("Kemili", 456);
        conjuntoConvidados.adicionarConvidado("Malia", 789);
        conjuntoConvidados.exibirConvidados();
        System.out.println(conjuntoConvidados.contarConvidados());
        System.out.println("------------------");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(789);
        conjuntoConvidados.exibirConvidados();
        System.out.println(conjuntoConvidados.contarConvidados());
    }
}
