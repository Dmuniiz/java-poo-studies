package br.com.poo.loiane.calculadora;

public class TesteCalculadora {

    static int resultSoma;

    public static void main(String[] args) {

        resultSoma = MinhaCalculadora.soma(1, 2);
        System.out.println(resultSoma);
        System.out.println(soma2Valores(3,6));
    }

    static int soma2Valores(int num1, int num2){
        return MinhaCalculadora.soma(num1, num2);
    }

}
