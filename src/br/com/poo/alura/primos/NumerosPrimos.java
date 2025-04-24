package br.com.poo.alura.primos;

public class NumerosPrimos {

    // Verifica se um número é primo
    public boolean verificarPrimalidade(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

}
