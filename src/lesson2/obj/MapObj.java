package lesson2.obj;

import lesson2.Testable;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MapObj implements Testable {

    private Obj[] arrayO = {
            new Obj(1, "Opel", 12.5, 120),
            new Obj(2, "Ferrari", 13.4, 214),
            new Obj(3, "Opel", 32.5, 452),
            new Obj(4, "VV", 32.4 ,423),
    };
    private Map<Obj, Integer> map = new HashMap<Obj, Integer>();

    @Override
    public void test() {
        putValuesToMap(arrayO);
        printMapEnteries(map);
    }

    private void printMapEnteries(Map<Obj, Integer> map) {
        for (Map.Entry<Obj, Integer> entry : map.entrySet()){
            System.out.println("Item: "+ entry.getKey() + ", nimber: " + entry.getValue());
        }
        System.out.println("Array length: "+arrayO.length);
        System.out.println("Map size: "+map.size());
    }

    private void putValuesToMap(Obj[] arrayO) {
        for (Obj item: arrayO){
            map.put(item, new Random().nextInt(10)+1);
        }
    }
}
