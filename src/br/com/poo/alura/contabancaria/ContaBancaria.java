package br.com.poo.alura.contabancaria;

public class ContaBancaria {

    public double saldo;

    public double depositar(double deposito){
        if(deposito > 0){
            this.saldo += deposito;
        }else{
            System.out.println("Depósito inválido");
        }
        return this.saldo;
    }

    public double sacar(double saque){
        if(this.saldo > 0 && this.saldo > saque){
            this.saldo -= saque;
        }else{
            System.out.println("Saldo insuficiente");
        }
        return this.saldo;
    }

    public double getSaldo(){
        return saldo;
    }

}
