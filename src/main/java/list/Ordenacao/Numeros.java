package main.java.list.Ordenacao;

public class Numeros implements Comparable<Numeros> {
    private int numero;

    public Numeros(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public int compareTo(Numeros n) {
        return Integer.compare(this.numero, n.getNumero());
    }
}
