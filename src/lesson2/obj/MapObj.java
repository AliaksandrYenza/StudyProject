package lesson2.obj;

import lesson2.Testable;

import java.util.HashMap;
import java.util.Map;

public class MapObj implements Testable {

    private Obj[] arrayO = {
            new Obj(1, "Opel", 12.5, 120),
            new Obj(2, "Ferrari", 13.4, 214),
            new Obj(3, "Opel_1", 32.5, 452),
            new Obj(4, "VV", 32.4 ,423),
    };
//    Obj obj = new Obj(null, null, null, null);
//    String name = obj.getName();
    private Map<String, Obj> map = new HashMap<String, Obj>();

    @Override
    public void test() {
        putValuesToMap(arrayO);
        printMapEnteries(map);
    }

    private void printMapEnteries(Map<String, Obj> map) {
        for (Map.Entry<String, Obj> entry : map.entrySet()){
            System.out.println("Item: "+ entry.getKey() + ", number: " + entry.getValue());
        }
        System.out.println("Array length: "+arrayO.length);
        System.out.println("Map size: "+map.size());
    }

    private void putValuesToMap(Obj[] arrayO) {
        for (Obj item: arrayO){
            map.put(item.getName(), item);
        }
    }

    private String keyMap (Obj[] arrayO){
        for (Obj obj: arrayO) {
            String name = obj.getName();
            return name;
        }
        return null;
    }
}
