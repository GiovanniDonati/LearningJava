package main.java.collections.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPessoa = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPessoa = agendaContatoMap.get(nome);
        }
        return numeroPessoa;
    }

    public static void main(String[] args){
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Giovanni", 40028922);

        agendaContatos.exibirContatos();
    }
}
