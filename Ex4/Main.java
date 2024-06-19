package Colectii.Ex4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //4. Scrie o metoda care:
    //Primeste ca parametru 2 liste de numere si returneaza un set format din numerele pozitive din ambele liste primite ca parametru
    //Exemplu:
    //Input: {1, -2, 3, 4, 4, -5}, {1, -7, 2}
    //Output: {1, 3, 4, 2}

    public static void main(String[] args) {
        List<Integer> input1 = new ArrayList<>();
        List<Integer> input2 = new ArrayList<>();
        input1.add(1);
        input1.add(-2);
        input1.add(3);
        input1.add(4);
        input1.add(4);
        input1.add(-5);

        input2.add(1);
        input2.add(-7);
        input2.add(2);

        List<Integer> output = extractPositives(input1, input2);
        System.out.println(output);
    }
    public static List<Integer> extractPositives (List<Integer> input1, List<Integer> input2) {
        List<Integer> output = new ArrayList<>();
        for (Integer number : input1) {
            if (number > 0) {
                if (!output.contains(number)) {
                    output.add(number);
                }

            }
        }
        for (Integer number : input2) {
            if (number > 0) {
                if (!output.contains(number)) {
                    output.add(number);
                }

            }
        }
        return output;
    }
}
