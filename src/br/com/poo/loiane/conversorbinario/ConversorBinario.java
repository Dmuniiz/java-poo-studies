package br.com.poo.loiane.conversorbinario;

import java.util.Scanner;

public class ConversorBinario {

    public static void main(String[] args) {

        System.out.println("Insira um número Binário para Conversão: ");

        Scanner scan = new Scanner(System.in);
        String entradaBinario = scan.next();

        /*converter a entrada num array de caracteres*/

        if(isBinario(entradaBinario)){
            char[] pos = entradaBinario.toCharArray();

            int somaDecimal = 0;
            int fluxoDePosicional = 0;

            for(int i = pos.length - 1; i >= 0; i--){
                if(pos[fluxoDePosicional] == '1'){
                    somaDecimal += Math.pow(2, i);
                }else{
                    somaDecimal += 0;
                }
                fluxoDePosicional += 1;
            }
            System.out.println("Decimal: " + somaDecimal);
        }else{
            System.out.println("Entrada inválida");
        }
    }

    public static boolean isBinario(String str){
        for(char c : str.toCharArray()){
            if(c != '0' && c != '1'){
                return false;
            }
        }
        return true;
    }

}
