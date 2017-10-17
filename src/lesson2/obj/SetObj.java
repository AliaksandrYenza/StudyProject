package lesson2.obj;

import lesson2.Testable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetObj implements Testable{

    private Obj[] arrayO = {
            new Obj(1, "Opel", 12.5, 120),
            new Obj(2, "Ferrari", 13.4, 214),
            new Obj(3, "Opel", 32.5, 452),
            new Obj(4, "Volva", 32.4 ,423),
    };
    private Set<Obj> set = new HashSet<>();

    @Override
    public void test() {
        putValuesToSet(arrayO);
        printMSetEnteries(arrayO);


    }
    private void printMSetEnteries(Obj[] set) {
        for (Obj entry : set){
            System.out.println("Entry #" + ": " + entry.toString());
        }
        System.out.println("Array length: "+arrayO.length);
        System.out.println("List size: "+ set.length);
    }

    private void putValuesToSet(Obj[] arrayO) {
        set.addAll(Arrays.asList(arrayO));
    }
}
