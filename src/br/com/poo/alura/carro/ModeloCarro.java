package br.com.poo.alura.carro;

import java.util.Random;

public class ModeloCarro extends Carro{

    private Random valor;

    public ModeloCarro(String nome, double preco1, double preco2, double preco3) {
        setNomeModelo(nome);
        setPrecos(preco1, preco2, preco3);
    }

}
