package lesson2.obj;

import lesson2.Testable;

public class MainClass {
    public static void main(String[] args){
        System.out.print("Set: \n");
        Testable testable = new SetObj();
        testable.test();
        System.out.print("Map: \n");
        testable = new MapObj();
        testable.test();
        System.out.print("List: \n");
        testable = new ListObj();
        testable.test();
    }
}
