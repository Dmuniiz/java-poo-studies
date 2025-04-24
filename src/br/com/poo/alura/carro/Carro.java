package br.com.poo.alura.carro;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Carro {

    private String nomeModelo;
    private double[] precos = new double[3];

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public void setPrecos(double preco1, double preco2, double preco3){
        precos[0] = preco1;
        precos[1] = preco2;
        precos[2] = preco3;
    }

    public double getMaiorPreco(){
        double maior = precos[0];
        for(int i = 0; i < precos.length; i++){
            if(precos[i] > maior){
                maior = precos[i];
            }
        }
        return maior;
    }

    public double getMenorPreco(){
        double menor = precos[0];
        for(int i = 0; i < precos.length; i++){
            if(precos[i] < menor){
                menor = precos[i];
            }
        }
        return menor;
    }

    public void exibirInformacoes(){
        System.out.println("Modelo: " + nomeModelo);
        for(int i = 0; i < precos.length; i++){
            System.out.println("Ano: " + (i+1) + "| Preco: " + precos[i]);
        }
        System.out.println("Menor preço: " + getMenorPreco());
        System.out.println("Maior preço: " + getMaiorPreco());
        System.out.println("\n");
    }

    //percorrer ou classe utilitaria
    /*public void compararValores(){
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
    }*/

}

