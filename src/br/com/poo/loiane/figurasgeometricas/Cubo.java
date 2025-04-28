package br.com.poo.loiane.figurasgeometricas;

public class Cubo extends Figura3D{

    private double aresta;

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }

    @Override
    public double calcularVolume() {
        return Math.pow(this.getAresta(), 3);
    }
}
