package main.java.basics.initial;

public class TiposDados {
    public static void main(String[] args) {
        // Tipos primitivos
        int idade = 25;             // Tipo inteiro
        double altura = 1.75;        // Tipo ponto flutuante
        boolean isMaior = true;      // Tipo booleano (verdadeiro/falso)
        char inicial = 'A';          // Tipo caractere

        // Tipo não primitivo
        String nome = "João";        // Tipo String (cadeia de caracteres)
        int[] numeros;
        numeros = new int[5];
        numeros[0] = 10;
        numeros[1] = 20;
        System.out.println(numeros);
    }
}