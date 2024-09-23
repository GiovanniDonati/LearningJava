package main.java.basics.initial;

public class OperadorLogico {
    public static void main(String[] args){
        boolean resultado = (10 > 5) && (5 < 3); // false (AND)
        boolean ou = (10 > 5) || (5 < 3);        // true (OR)
        boolean nao = !(10 > 5);                 // false (NOT)
    }

}
