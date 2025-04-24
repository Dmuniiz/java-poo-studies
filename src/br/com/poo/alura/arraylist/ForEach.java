package br.com.poo.alura.arraylist;

import java.util.ArrayList;

public class ForEach {

    public static void main(String[] args) {

        ArrayList<Character> listaString = new ArrayList<>();

        listaString.add('a');
        listaString.add('b');
        listaString.add('c');
        listaString.add('d');

        for(Character item : listaString){
            System.out.println(item);
        }

    }

}
