package br.com.poo.alura.primos;

public class VerificadorPrimo extends NumerosPrimos{

    // Método específico da subclasse
    public void verificarSeEhPrimo(int numero) {
        if (verificarPrimalidade(numero)) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }

}
