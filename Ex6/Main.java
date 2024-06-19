package Colectii.Ex6;
import java.util.HashSet;
import java.util.Set;


public class Main {
    //6. Scrie o metoda care:
    //Primeste ca parametru doua set-uri si returneaza true daca primul set primit ca parametru este superset al celui de-al doilea set
    //Un set “set1” este superset al altui set “set2”, daca “set1” contine toate elementele din “set2”, dar seturile nu sunt egale - containsAll()
    //Exemple:
    //Input1: {“ana”, “are”, “mere”}, {“ana”, “are”}
    //Output1: true
    //Input2: {“ana”, “are”, “mere”}, {“ana”, “are”, “mere”}
    //Output2: false
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("ana");
        set1.add("are");
        set1.add("mere");

        Set<String> set2 = new HashSet<>();
        set2.add("ana");
        set2.add("are");

        System.out.println("Output: " + isSuperset(set1, set2));
    }

    public static boolean isSuperset(Set<String> set1, Set<String> set2) {
        return set1.containsAll(set2) && !set1.equals(set2);
    }
}
