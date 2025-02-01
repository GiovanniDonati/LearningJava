package main.java.collections.map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
        //eventosMap.put(data, new Evento(nome, atracao);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosMap);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento>entry : eventosMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("Próximo evento: " + entry.getValue() + ", data: " + entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args){
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2025, 8, 6), "My birthday", "Giovanni");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 7, 21), "My wife birthday", "Kemili");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 8, 13), "My baby birthday", "Malia");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }
}
