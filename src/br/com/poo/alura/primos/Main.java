package br.com.poo.alura.primos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GeradorPrimo gerador = new GeradorPrimo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gerador de primos. Pressione Enter para gerar o próximo primo, ou digite 'sair' para encerrar.");

        while (true) {
            System.out.print("-> ");
            String entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("sair")) break;

            int proximo = gerador.gerarProximoPrimo();
            System.out.println("Próximo primo: " + proximo);
        }

        scanner.close();
        System.out.println("Encerrado.");
    }

}
