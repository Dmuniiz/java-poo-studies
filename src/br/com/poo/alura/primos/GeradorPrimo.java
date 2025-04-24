package br.com.poo.alura.primos;

public class GeradorPrimo extends NumerosPrimos{

    private int ultimoPrimo = 1;

    // Gera o próximo primo maior que o último
    public int gerarProximoPrimo() {
        int numero = ultimoPrimo + 1;
        while (!verificarPrimalidade(numero)) {
            numero++;
        }
        ultimoPrimo = numero;
        return numero;
    }

}
