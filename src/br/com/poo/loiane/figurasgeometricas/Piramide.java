package br.com.poo.loiane.figurasgeometricas;

public class Piramide extends Figura3D implements DimensaoVolumetrica{

    private double altura;

    private Figura2D base;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Figura2D getBase() {
        return base;
    }

    /* valor da area de circulo, quadrado ou trinangulo */
    public void setBase(Figura2D base) {
        this.base = base;
    }

    @Override
    public double calcularVolume() {
        // V = (Ab * h)/ 3
        if(base != null){
            if(this.getBase() instanceof Quadrado){
                return (((Quadrado) base).calcularArea() * this.getAltura())/3;
            } else if (this.getBase() instanceof Circulo) {
                return (((Circulo) base).calcularArea() * this.getAltura())/3;
            } else if (this.getBase() instanceof Triangulo) {
                return (((Triangulo) base).calcularArea() * this.getAltura())/3;
            }
        }
        return 0;
    }

}
