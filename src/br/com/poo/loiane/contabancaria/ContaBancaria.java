package br.com.poo.loiane.contabancaria;

public class ContaBancaria {

    private String nomeCliente;
    private int numConta;
    private double saldo;

    public ContaBancaria(String nomeCliente, int numConta) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    //setsaldo herança
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double deposito){
        this.saldo += deposito;
    }

    public boolean sacar(double saque){
        if(this.saldo-saque >= 0){//saldo >= saque
            this.saldo -= saque;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", numConta='" + numConta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
