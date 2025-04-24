package br.com.poo.alura.carro;

public class TesteCarro {

    public static void main(String[] args) {
    ModeloCarro carro1 = new ModeloCarro("Civic", 95000.00, 97000.00, 94000.00);
        carro1.exibirInformacoes();
        ModeloCarro carro2 = new ModeloCarro("Corolla", 93000.00, 92000.00, 95000.00);
        carro2.exibirInformacoes();
    }

}
