package No2.MapObjects;

import No2.ArrayObjects;
import No2.ListObjects.ArrayToList;
import No2.Methods.Methods;
import No2.Objects;
import No2.Println.Print;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.Collator;
import java.util.*;

public class RealizationMethodsMap implements Methods {

    Map<String, Objects> map = new HashMap<>();

    public void run (){
        System.out.println("/nMAP: ");

        map = ArrayToMap.arrayObjectsToMap(ArrayObjects.arrayObjectsInfo);
        new Print().printMapEntries(map);

        Print print = new Print();

        deleteMinSpeed();
        print.printMapEntries(map, "-Min\n");
        deleteMaxSpeed();
        print.printMapEntries(map, "-Max\n");
        sort(ArrayToList.arrayObjectsToList());
        print.printMapEntries(map,"sort\n");
        addName();
        print.printMapEntries(map, "add name\n");
        findSymbol();
        print.printElement(sumWeight(), "sumWeight\n");
//        List<No2.Objects> patternCars=Pannert(ArrayToList.arrayObjectsToList(),200, 10);
//        print.printListEnteries(patternCars, "Pannert (200<speed, 10> weight\n");

    }


    @Override
    public void deleteMaxSpeed() {
        int maximumSpeed=0;
        String keyMaximumSpeed="";
        boolean firstElement=true;
        for (Map.Entry<String,Objects> entry: map.entrySet()) {
            if (firstElement) {
                maximumSpeed = entry.getValue().getSpeed();
                keyMaximumSpeed = entry.getKey();

            } else if (maximumSpeed < entry.getValue().getSpeed()) {
                maximumSpeed = entry.getValue().getSpeed();
                keyMaximumSpeed=entry.getKey();
            }

        }
        map.remove(keyMaximumSpeed);
    }

    @Override
    public void deleteMinSpeed() {
        int minimumSpeed=0;
        String keyMinimumSpeed="";
        boolean firstElement=true;
        for (Map.Entry<String,Objects> entry: map.entrySet()) {
            if (firstElement) {
                minimumSpeed = entry.getValue().getSpeed();
                keyMinimumSpeed = entry.getKey();

            } else if (minimumSpeed > entry.getValue().getSpeed()) {
                minimumSpeed = entry.getValue().getSpeed();
                keyMinimumSpeed=entry.getKey();
            }

        }
        map.remove(keyMinimumSpeed);
    }

    @Override
    public void deleteLessSpeed(int speed) {

    }

    @Override
    public void deleteMoreSpeed(int speed) {

    }

    @Override
    public void sort(ArrayList<Objects> collection) {
        List<Objects> list = new LinkedList<>();
        for (Map.Entry<String, Objects> entry : map.entrySet()) {
            list.add(entry.getValue());
        }
        list.sort((o1, o2) ->
                Collator.getInstance().compare(o1.getName(), o2.getName()));
    }


    @Override
    public void addName() {
        for (Map.Entry<String, Objects> entry : map.entrySet()) {
            entry.getValue().setName("_1" + entry.getValue().getName());
        }
    }

    @Override
    public void findSymbol() {
        String symbol = "";
        System.out.println("Enter symbol to find");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            symbol = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Map.Entry<String, Objects> item : map.entrySet()) {
            if (item.getValue().getName().contains(symbol) ||
                    Integer.toString(item.getValue().getSpeed()).contains(symbol) ||
                    Integer.toString(item.getValue().getId()).contains(symbol) ||
                    Double.toString(item.getValue().getWeight()).contains(symbol)) {
                System.out.println(item);
            }
        }
    }

    @Override
    public double sumWeight(ArrayList<Objects> collection) {
        return 0;
    }

    public double sumWeight(){
        Double totalWeight=0.0;
        for (Map.Entry<String,Objects> entry: map.entrySet()) {
            totalWeight+=entry.getValue().getWeight();
        }
        return totalWeight;
    }
    //sumWeight

    @Override
    public Objects thirdElementOfObjects() {
        return null;
    }

    @Override
    public void secondAndThirdElementsOfObjects() {
          }

    @Override
    public List<Objects> Pannert(ArrayList<Objects> collection, int speed, double weigth) {
        List<Objects> list=new ArrayList<>(map.values());
        System.out.println("Sorted array:");
        Collections.sort(list, new Comparator<Objects>() {
            @Override //anonclass
            public int compare(Objects o1, Objects o2) {

                int key=o1.getSpeed().compareTo(o2.getSpeed());
                if (key==0) {
                    return o1.getWeight().compareTo(o2.getWeight());
                }
                else {
                    return key;
                }
            }
        });
        for (int i=0;i<map.size();i++)
        {
            System.out.println(map.get(list.get(i).getName()).toString());
        }
        return null;
    }
}
