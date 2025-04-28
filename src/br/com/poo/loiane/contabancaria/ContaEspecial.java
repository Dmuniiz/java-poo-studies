package br.com.poo.loiane.contabancaria;

public class ContaEspecial extends ContaBancaria {

    public ContaEspecial(String nomeCliente, int numConta) {
        super(nomeCliente, numConta);
    }

    @Override
    public boolean sacar(double saque) {
        if(this.getSaldo() <= 0 || this.getSaldo() > 0){
            double novoSaldo = this.getSaldo() - saque;
            this.setSaldo(novoSaldo);
            return true;
        }
        return false;
    }
}
