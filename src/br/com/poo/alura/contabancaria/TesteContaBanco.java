package br.com.poo.alura.contabancaria;

public class TesteContaBanco {

    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente();

        System.out.println(contaCorrente.getSaldo());
        System.out.println(contaCorrente.sacar(100));
        System.out.println(contaCorrente.depositar(100));
        System.out.println(contaCorrente.sacar(50));
        System.out.println(contaCorrente.depositar(-100));

        System.out.println(contaCorrente.cobrarTarifaMensal(10));


    }

}
