package br.com.poo.loiane.interfaces;

public class Cachorro extends Mamifero implements AnimalDomesticado, AnimalEstimacao {

    private String raça;
    private double tamanho;

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public void amamentar() {

    }

    @Override
    public void emitirSom() {

    }

    @Override
    public void levarVeterinario() {

    }

    @Override
    public void alimentar() {

    }

    @Override
    public void brincar() {

    }

    @Override
    public void levarPassear() {

    }
}
