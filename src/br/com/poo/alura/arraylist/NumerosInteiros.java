package br.com.poo.alura.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class NumerosInteiros {

    public static void main(String[] args) {

        List<Integer> numerosInteiros = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < random.nextInt(0, 100); i++) {
            numerosInteiros.add(random.nextInt(0, 100));
        }

        Collections.sort(numerosInteiros);
        System.out.println(numerosInteiros);

    }
}

