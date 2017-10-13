package lesson2.string;

import lesson2.Testable;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StringListTest implements Testable {

    private Object[] array = {"Opel", "VW", "Ferrari", "Tesla", "Toyta", "Ferrari"};
    private List list = new LinkedList();

    @Override
    public void test() {
        addValuesToList(array);
        printListEnteries(list);

    }

    private void addValuesToList(Object[] array) {
        for (int i = 0; i<array.length; i++){
            list.add(array[i]);
        }
    }

    private void printListEnteries(List list) {
        for (int i = 0; i<list.size(); i++){
            System.out.println("Entry #" + i + ": " + list.get(i));
        }
        System.out.println("Array length: "+array.length);
        System.out.println("List size: "+list.size());
    }

}
