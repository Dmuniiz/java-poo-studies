package br.com.poo.loiane.conversorbinario;

import java.util.Scanner;

public class ConversorDecimal {

    public static void main(String[] args) {

        System.out.println("Insira um número Decimal para Conversão: ");

        Scanner scan = new Scanner(System.in);
        int entradaDecimal = scan.nextInt();

        // Validar caso o número seja 0
        if (entradaDecimal == 0) {
            System.out.println("O número em binário é: 0");
            return;
        }

        String binario = "";
        while (entradaDecimal > 0){
            int resto = entradaDecimal % 2;
            binario += resto;
            entradaDecimal /= 2;
        }

        String ordemBinario = new StringBuilder(binario).reverse().toString();
        System.out.println("O número em binário é: " + ordemBinario);
    }

}
