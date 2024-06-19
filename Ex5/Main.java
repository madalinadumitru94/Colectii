package Colectii.Ex5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    //5. Scrie o metoda care:
    //Primeste ca si parametru o lista de cuvinte si returneaza lista de cuvinte inversata, cu mentiunea ca lista inversata nu va include cuvintele care au lungimea mai mica decat 3
    //Exemplu:
    //Input: {“ana”, “nu”, “are”, “mere”}
    //Output: {“mere”, “are”, “ana”}
    public static void main(String[] args) {
        List<String> input = new ArrayList<>();
        input.add("ana");
        input.add("nu");
        input.add("are");
        input.add("mere");

        List<String> output = reverseAndFilter(input);
        System.out.println(output);
    }

    public static List<String> reverseAndFilter(List<String> words) {
        List<String> output = new ArrayList<>();
        for (String word : words) {
            if (word.length() >= 3) {
                output.add(word);
            }
        }
        Collections.reverse(output);
        return output;
    }
}

