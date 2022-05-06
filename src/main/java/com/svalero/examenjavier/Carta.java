package com.svalero.examenjavier;

public class Carta {

    private String palo;
    private String numero;

    private int valor;

    public Carta(String palo, String numero) {
        this.palo = palo;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "palo='" + palo + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }

    public int getValor() {
        return valor;
    }
}
