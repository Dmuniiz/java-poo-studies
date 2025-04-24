package br.com.poo.alura.arraylist;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        /*Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();

        p1.setNome("P1");
        p2.setNome("P2");
        p3.setNome("P3");

        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

        System.out.println(pessoas.size());
        System.out.println(pessoas.get(0).toString());
        System.out.println(pessoas);*/

       /* Produto p1 = new Produto("p1", 3.0, 4);
        Produto p2 = new Produto("p2", 5.0, 7);
        Produto p3 = new Produto("p3", 6.0, 8);
        var produtos = new ArrayList<Produto>();
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);

        System.out.println(produtos.size());
        System.out.println(produtos.get(2));

        ProdutoPerecivel pp1 = new ProdutoPerecivel("pp1", 10, 100);

        produtos.add(pp1);
        System.out.println(produtos.size());

        pp1.setDataValidade("21/12/2005");
        System.out.println(produtos.get(3));
        System.out.println(pp1.getDataValidade());*/


        /*Cachorro cachorro = new Cachorro();
        Animal animal = (Animal) cachorro;

        if(cachorro instanceof Animal){
            Animal animal = (Animal) cachorro; // Fazendo o casting para a classe Animal
            animal.fazerSom(); // Chamando o método da classe Animal (polimorfismo)
        } else {
            System.out.println("O objeto não é uma instância de Animal.");
        }

        ProdutosParte2 p1 = new ProdutosParte2("p1", 3.0);
        ProdutosParte2 p2 = new ProdutosParte2("p2", 5.0);
        ProdutosParte2 p3 = new ProdutosParte2("p3", 6.0);
        var produtos = new ArrayList<ProdutosParte2>();
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);

        double somaMedia = 0; acumulador
        for(ProdutosParte2 item: produtos){
            somaMedia += item.getPreco();
        }
        double media = somaMedia / produtos.size();
        System.out.println(media);*/

        /*Circulo c = new Circulo(5);
        Quadrado q = new Quadrado(2);

        ArrayList<Forma> listaDeFormas = new ArrayList<>();
        listaDeFormas.add(c);
        listaDeFormas.add(q);

        for (Forma item : listaDeFormas){
            System.out.println(item.calcularArea());
        }*/

        List<Titulo> listaTitulo = new ArrayList<>();

        Titulo t1 = new Titulo("Aitulo Um");
        Titulo t2 = new Titulo("Citulo Dois");
        Titulo t3 = new Titulo("Ditulo Tres");
        Titulo t4 = new Titulo("Bitulo Quatro");
        Titulo t5 = new Titulo("Titulo Cinco");

        listaTitulo.add(t1);
        listaTitulo.add(t2);
        listaTitulo.add(t3);
        listaTitulo.add(t4);
        listaTitulo.add(t5);

        /*iterando sobre a lista sem ordem*/
        for(Titulo item : listaTitulo){
            System.out.println(item);
        }

        /*ordenei apos definir a logica na implementação do COMPARABLE*/
        Collections.sort(listaTitulo);
        System.out.println(listaTitulo);

        /*List<String> lista = new ArrayList<>();
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");

        System.out.println("Usando ArrayList:");
        for (String item : lista) {
            System.out.println(item);
        }

        // Trocar a implementação para LinkedList
        lista = new LinkedList<>();
        lista.add("Elemento A");
        lista.add("Elemento B");
        lista.add("Elemento C");

        System.out.println("\nUsando LinkedList:");
        for (String item : lista) {
            System.out.println(item);
        }*/

    }

}
