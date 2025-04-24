package br.com.poo.alura.contabancaria;

public class ContaCorrente extends ContaBancaria{

    private double tarifaMensal;

    public double cobrarTarifaMensal(double tarifaMensal){
        this.tarifaMensal = tarifaMensal;
        double descontoTarifa = 0;
        if (getSaldo() >= tarifaMensal) {
            descontoTarifa = getSaldo() - tarifaMensal;
            System.out.println("Tarifa mensal de R$" + tarifaMensal + " cobrada.");
        } else {
            System.out.println("Saldo insuficiente para cobrança da tarifa mensal.");
        }
        return descontoTarifa;
    }

}
