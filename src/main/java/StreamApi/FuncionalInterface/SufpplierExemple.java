package main.java.StreamApi.FuncionalInterface;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SufpplierExemple {
    public static void main(String[] args) {
        Supplier<String> saudacao = () -> "Welcome to you!";

        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .toList();
//              .collect(Collectors.toList());

        listaSaudacoes.forEach(System.out::println);
//        listaSaudacoes.forEach(x -> System.out.println(x));
    }
}
