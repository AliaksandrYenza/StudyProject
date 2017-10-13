package lesson2.obj;

import lesson2.Testable;

import java.util.LinkedList;
import java.util.List;

public class ListObj implements Testable {

    private Obj[] arrayO = {
            new Obj(1, "Opel", 12.5, 120),
            new Obj(2, "Ferrari", 13.4, 214),
            new Obj(3, "Opel", 32.5, 452),
            new Obj(4, "VV", 32.4 ,423),
    };
    private List list = new LinkedList();

    @Override
    public void test() {
        addValuesToList(arrayO);
        printListEnteries(list);

    }

    private void addValuesToList(Object[] arrayO) {
        for (int i = 0; i<arrayO.length; i++){
            list.add(arrayO[i]);
        }
    }

    private void printListEnteries(List list) {
        for (int i = 0; i<list.size(); i++){
            System.out.println("Entry #" + i + ": " + list.get(i));
        }
        System.out.println("Array length: "+arrayO.length);
        System.out.println("List size: "+list.size());
    }
}
