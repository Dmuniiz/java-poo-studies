package br.com.poo.loiane.figurasgeometricas;

public class Circulo extends Figura2D{

    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return (Math.pow(this.raio, 2) * Math.PI);
    }
}
