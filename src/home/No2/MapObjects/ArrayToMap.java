package No2.MapObjects;

import No2.Objects;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMap {

    public static Map<String, Objects> arrayObjectsToMap(Objects[] objects){
        Map<String, Objects> map = new HashMap();
        for (Objects object: objects){
            map.put(object.getName(), object);
        }
        return map;
    }
}
