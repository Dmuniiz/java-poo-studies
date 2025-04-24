package br.com.poo.alura.desafiomain.src;

import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o limite do cartão: ");
        double limite = scan.nextDouble();
        CartaoDeCredito cartaoDeCredito = new CartaoDeCredito(limite);


        int sair = 1;
        while(sair != 0){
            System.out.println("Digite a descricao da compra: ");
            String desc = scan.next();

            System.out.println("Informe o valor da compra: ");
            double valor = scan.nextDouble();

            Compra compra = new Compra(valor, desc);
            boolean compraRealizada = cartaoDeCredito.lancaCompra(compra);

            if(compraRealizada){
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = scan.nextInt();
            }else{
                System.out.println("Saldo insuficiente!");
                sair = 0;
            }
        }

        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS:\n");
        Collections.sort(cartaoDeCredito.getCompras());

        for (Compra c : cartaoDeCredito.getCompras()){
            System.out.println(c.getDescricao() + " - " +c.getValor());
        }

        System.out.println("\n***********************");

        System.out.println("Saldo cartão: " + cartaoDeCredito.getSaldo());

    }

}
