package br.com.poo.loiane.contabancaria;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {

    private int diaRendimento;

    public ContaPoupanca(String nomeCliente, int numConta) {
        super(nomeCliente, numConta);
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDia rendimento: " + diaRendimento;
    }

    public boolean calcularNovoSaldo(double taxaRendimento){
        Calendar hoje = Calendar.getInstance()  ;
        if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)){
            /*herança -- para acessar o parametro saldo da conta poupanca uso o metodo por herança*/
            this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
            return true;
        }
        return false;
    }

}
