package Colectii.Ex2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //2. Scrie o metoda care:
    //primeste ca si parametru o lista de numere si returneaza o alta lista de numere formata din numerele din lista primita ca parametru, ridicate la patrat (puteti folosi Math.pow(2) pentru a ridica la patrat)
    //Exemplu:
    //Input: {2,3,4,5}
    //Output: {4,9,16,25}

    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>();
        input.add(2);
        input.add(3);
        input.add(4);
        input.add(5);

        List<Integer> output = square(input);

        System.out.println(output);
    }
    public static List<Integer> square (List<Integer> input) {
        List<Integer> output = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {
            output.add((int) Math.pow(input.get(i), 2));
        }
        return output;
    }
}
