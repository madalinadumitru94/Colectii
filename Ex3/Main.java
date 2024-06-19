package Colectii.Ex3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //3. Scrie o metoda care:
    //Gaseste cuvantul cel mai lung dintr-o lista de cuvinte (primita ca parametru), si il returneaza
    //Exemplu:
    //Input: {“ana”, “are”, “mere”}
    //Output: “mere”

    public static void main(String[] args) {
        List<String> input = new ArrayList<>();
        input.add("ana");
        input.add("are");
        input.add("mere");

        String longestWord = findLongestWord(input);
        System.out.println(longestWord);
    }

    public static String findLongestWord(List<String> words) {
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}
