package br.com.poo.alura.desafiomain.src;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {

    private double limite;
    private double saldo;
    private List<Compra> compras;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean lancaCompra(Compra compras) {
        if(this.saldo >= compras.getValor()){
            this.saldo -= compras.getValor();
            this.compras.add(compras);
            return true;
        }
        return false;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    /*RETORNA lista de compras*/
    public List<Compra> getCompras() {
        return compras;
    }

}
