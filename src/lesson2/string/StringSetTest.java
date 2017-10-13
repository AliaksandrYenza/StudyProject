package lesson2.string;

import lesson2.Testable;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringSetTest implements Testable {

    private String[] array = {"Opel", "VW", "Ferrari", "Tesla", "Toyta", "Ferrari"};

    private Set<String> set = new HashSet<>();

    @Override
    public void test() {
        putValuesToSet(array);
        printMSetEnteries(set);
    }

    private void printMSetEnteries(Set set) {
        for (Object entry : set){
            System.out.println("Entry #" + ": " + entry);
        }
        System.out.println("Array length: "+array.length);
        System.out.println("List size: "+set.size());
    }

    private void putValuesToSet(String[] array) {
        set.addAll(Arrays.asList(array));
    }
}
