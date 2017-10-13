package lesson2.string;

import lesson2.Testable;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class StringMapTest implements Testable {

    private String[] array = {"Opel", "VW", "Ferrari", "Tesla", "Toyta", "Ferrari"};
    private Map<String, Integer> map = new HashMap<>();

    @Override
    public void test() {
        putValuesToMap(array);
        printMapEnteries(map);
    }

    private void printMapEnteries(Map <String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println("Item: "+ entry.getKey() + ", nimber: " + entry.getValue());
        }
        System.out.println("Array length: "+array.length);
        System.out.println("Map size: "+map.size());
    }

    private void putValuesToMap(String[] array) {
        for (String item: array){
            map.put(item, new Random().nextInt(10)+1);
        }
    }
}
