package main.java.basics.codicionais;

public class EstruturaIfElse {
    public static void main(String[] args) {
        int idade = 25;

        if (idade < 18) {
            System.out.println("Menor de idade");
        } else if (idade >= 18 && idade <= 65) {
            System.out.println("Maior de idade.");
        } else {
            System.out.println("Idoso");
        }
    }
}
