package br.com.poo.loiane.jogodavelha;

import java.util.Scanner;

//import static br.com.loaine.jogodavelha.jogoDaVelha.valor;

public class testeJogoDaVelha {

    public static int valor(String tipoValor, Scanner scan){
        int valor = 0;
        boolean valorValido = false;
        while (!valorValido){
            System.out.println("Entre com a " + tipoValor + " (1, 2 ou 3)");
            valor = scan.nextInt();
            if (valor >=1 && valor<=3){
                valorValido = true;
            } else {
                System.out.println("Entrada inválida, tente novamente");
            }
        }
        valor--; // valor = valor - 1
        return valor;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        jogoDaVelha jogoDaVelha = new jogoDaVelha();

        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        boolean ganhou = false;
        char sinal;
        int linha = 0, coluna = 0;

        while(!ganhou){
            if (jogoDaVelha.verificarVezJogador1()){
                System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3).");
                sinal = 'X';
            } else {
                System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3).");
                sinal = 'O';
            }

            linha = valor("Linha:", scan);//se true
            coluna = valor("Coluna:", scan);//se true

            if(!jogoDaVelha.validarJogada(linha, coluna, sinal)){
                System.out.println("Posição já usada, tente novamente");
            }
            jogoDaVelha.imprimirTabuleiro();

            if(jogoDaVelha.verificarGanhador('X')){
                ganhou = true;
                System.out.println("Parabéns, jogador 1 ganhou");
            }else if(jogoDaVelha.verificarGanhador('O')){
                ganhou = true;
                System.out.println("Parabéns, jogador 2 ganhou");
            }else if(jogoDaVelha.jogada >= 9){
                ganhou = true;
                System.out.println("EMPATE!");
            }
        }
    }
}
