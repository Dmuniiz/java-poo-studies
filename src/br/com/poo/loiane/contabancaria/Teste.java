package br.com.poo.loiane.contabancaria;

import java.util.Random;

public class Teste {

    public static void main(String[] args) {

        Random random = new Random();

        ContaBancaria c1 = new ContaBancaria("Davy", random.nextInt(0, 100));

        //System.out.println(c1.getSaldo());
        //System.out.println(c1.sacar(100));

        //c1.depositar(100);
        //realizarSaque(c1, 50);

        /*ContaPoupanca contaPoupanca = new ContaPoupanca("Maria", random.nextInt(0, 100));
        System.out.println(contaPoupanca.getNumConta());

        contaPoupanca.depositar(1000);
        realizarSaque(contaPoupanca, 100);
        contaPoupanca.setDiaRendimento(24);

        if(contaPoupanca.calcularNovoSaldo(0.10)){
            System.out.println("Novo saldo(taxa de rendimento): " + contaPoupanca.getSaldo());
        }else{
            System.out.println("Hoje não é dia de rendimento");
        }*/

        ContaEspecial contaEspecial = new ContaEspecial("Conta", random.nextInt(0,100));
        realizarSaque(contaEspecial, 100);
        System.out.println(contaEspecial.toString());
        contaEspecial.depositar(900);
        System.out.println(contaEspecial.toString());

    }

    private static void realizarSaque(ContaBancaria conta, double valor){
        if(conta.sacar(valor)){
            System.out.println("Saque efetuado, novo saldo: " + conta.getSaldo());
        }else{
            System.out.println(conta.toString());
            System.out.println("Saldo insuficiente: " + conta.getSaldo());
        }
    }

}
