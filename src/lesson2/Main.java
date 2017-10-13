package lesson2;

import lesson2.string.StringListTest;
import lesson2.string.StringMapTest;
import lesson2.string.StringSetTest;

public class Main {
    public static void main (String[] args){
        System.out.print("List \n");
        Testable testable = new StringListTest();
        testable.test();
        System.out.print("Map: \n");
        testable = new StringMapTest();
        testable.test();
        System.out.print("Set: \n");
        testable = new StringSetTest();
        testable.test();
    }
}
