package br.com.poo.loiane.calculadora;

public class MinhaCalculadora {

    /* UMA CLASSE COM SOMENTE METODOS ESTATICOS(STATIC) É CHAMADA DE UTILITARIA*/
    /* POIS POSSUEM SOMENTE METODOS ESTATICOS QUE NAO PRECISAM DE INVOCACAO OU DECLARACAO DA CLASSE */

    public static int soma(int num1, int num2){
        return num1 + num2;
    }

    public static double soma(double num1, double num2){
        return num1 + num2;
    }

    public static int soma(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public static int soma(int[] vetorInteiros){
        int total = 0;

        for (int i=0; i<vetorInteiros.length; i++){
            total += vetorInteiros[i];
        }
        return total;
    }

}
