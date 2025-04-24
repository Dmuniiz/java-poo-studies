package br.com.poo.alura.arraylist;

public class Circulo implements Forma {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return this.raio * Math.PI;
    }
}
