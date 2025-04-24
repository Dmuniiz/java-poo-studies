package br.com.poo.alura.carro;

public class TesteArray {

    private double[] precos = new double[3];

    public void precos(double preco1, double preco2, double preco3){
        precos[0] = preco1;
        precos[1] = preco2;
        precos[2] = preco3;
    }

    //percorrer ou classe utilitaria
    public void compararValores(){
        double maiorValor = precos[0];
        double menorValor = precos[0];

        for (int i = 1; i < precos.length; i++) {
            maiorValor = Math.max(maiorValor, precos[i]);
        }
        for (int i = 1; i < precos.length; i++) {
            menorValor = Math.min(menorValor, precos[i]);
        }

        System.out.println(maiorValor);
        System.out.println(menorValor);
    }

    /*public static void main(String[] args) {
        TesteArray array = new TesteArray();
        array.precos(3,6,9);
        array.compararValores();
    }*/
}
