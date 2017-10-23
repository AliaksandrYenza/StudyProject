package No2.Println;

import No2.ArrayObjects;
import No2.Objects;

import java.util.List;
import java.util.Map;

public class Print {

    public void printListEnteries(List list) {
        for (int i = 0; i<list.size(); i++){
            System.out.println("Entry #" + i + ": " + list.get(i).toString());
        }
        System.out.println("List size: "+list.size()+"\n");
    }

    public void printListEnteries(List list, String message){
        for (int i = 0; i<list.size(); i++){
            System.out.println("Entry #" + i + ": " + list.get(i).toString() + "Условие: " + message);
        }
        System.out.println("List size: "+list.size()+"\n");
    }

    public void printElement(Objects objects, String message){
        System.out.println(message  + objects + "\n");
    }

    public void printElement(double element, String message){
        System.out.println(message + element+ "\n");
    }

    public void printPattern (List<No2.Objects> list, String message){
        System.out.print(message);
        for (int i = 0; i<list.size(); i++){
            System.out.println("Entry #" + i + ": " + list.get(i).toString());
        }
    }

    public void printMapEntries(Map<String, Objects> map) {
        for(Map.Entry<String, Objects> entry: map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", value: " + entry.getValue().toString());
        }
        System.out.println("Array length: " + ArrayObjects.arrayObjectsInfo.length);
        System.out.println("Map size: " + map.size());
    }

    public void printMapEntries(Map<String, Objects> map, String message) {
        for(Map.Entry<String, Objects> entry: map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", value: " + entry.getValue().toString()+ "Meassage: "+ message);
        }
        System.out.println("Array length: " + ArrayObjects.arrayObjectsInfo.length);
        System.out.println("Map size: " + map.size());
    }
}
