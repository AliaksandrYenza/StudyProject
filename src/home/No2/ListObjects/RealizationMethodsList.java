package No2.ListObjects;

import No2.ArrayObjects;
import No2.Methods.Methods;
import No2.Println.Print;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class RealizationMethodsList implements Methods {

    ArrayList<No2.Objects> list = new ArrayList<>();

    public void run (){

        list = ArrayToList.arrayObjectsToList();
        new Print().printListEnteries(list);

        new Print().printElement(thirdElementOfObjects(), "Третий элемент: ");

        System.out.println("2 и 3 элементы");
        secondAndThirdElementsOfObjects();

        double totalWeight = sumWeight(ArrayToList.arrayObjectsToList());
        System.out.print("Сумма weight: " + totalWeight +"\n");

        List<No2.Objects> patternCars=Pannert(ArrayToList.arrayObjectsToList(),200, 10);
        new Print().printPattern(patternCars, "Pannert (200<speed, 10> weight\n");

        findSymbol();

        addName();
        new Print().printListEnteries(list);

        sort(ArrayToList.arrayObjectsToList()); //через l'

        deleteMaxSpeed();
        System.out.println("удалено Max speed");
        new Print().printListEnteries(list);

        deleteMinSpeed();
        System.out.println("удалено Min speed");
        new Print().printListEnteries(list);

        deleteLessSpeed(100);
        new Print().printListEnteries(list, " больше speed 100");

        deleteMoreSpeed(200);
        new Print().printListEnteries(list, " меньше speed 200");
    }

    @Override
    public void deleteMaxSpeed() {
        No2.Objects temp = list.get(0);
        Integer value = temp.getSpeed();
        for (int i = 1; i < list.size(); i++) {
            No2.Objects temp1 = list.get(i);
            if (temp1.getSpeed() > value) {
                value = temp1.getId();
            }
        }
        No2.Objects[] deleteItems = new No2.Objects[ArrayObjects.arrayObjectsInfo.length];
        int j = 0;
        for (Object aList : list) {
            No2.Objects temp1 = (No2.Objects) aList;
            if (Objects.equals(temp1.getId(), value)) {
                deleteItems[j] = temp1;
                j++;
            }
        }
        for (int i = 0; i < j; i++) {
            list.remove(deleteItems[i]);
        }
    }

    @Override
    public void deleteMinSpeed() {
        No2.Objects temp = list.get(0);
        Integer value = temp.getSpeed();
        for (int i = 1; i < list.size(); i++) {
            No2.Objects temp1 = list.get(i);
            if (temp1.getSpeed() < value) {
                value = temp1.getId();
            }
        }
        No2.Objects[] deleteItems = new No2.Objects[ArrayObjects.arrayObjectsInfo.length];
        int j = 0;
        for (Object aList : list) {
            No2.Objects temp1 = (No2.Objects) aList;
            if (Objects.equals(temp1.getId(), value)) {
                deleteItems[j] = temp1;
                j++;
            }
        }
        for (int i = 0; i < j; i++) {
            list.remove(deleteItems[i]);
        }
    }

    @Override
    public void deleteLessSpeed(int speed) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getSpeed() < speed) {
                list.remove(list.get(i));
            }
        }
    }

    @Override
    public void deleteMoreSpeed(int speed) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getSpeed() > speed) {
                list.remove(list.get(i));
            }
        }
    }

    @Override //+post/247015/
    public void sort(ArrayList<No2.Objects> collection) {
        List list = new ArrayList(collection);
        list.sort(Comparator.comparingInt(No2.Objects::getSpeed));
        System.out.println("O collection sorted by speed: ");
        new Print().printListEnteries(list);
        list.sort(Comparator.comparing(object -> ((No2.Objects)object).getName()));
        System.out.println("O collection sorted by name: ");
        new Print().printListEnteries(list);
    }

    @Override //+
    public void addName() {
        for (No2.Objects item : list) {
            item.setName("_1" + item.getName());
        }
    }

    @Override //+
    public void findSymbol() {
        String symbol = "";
        System.out.println("Enter symbol to find");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            symbol = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (No2.Objects item : list) {
            if (item.getName().contains(symbol) ||
                    Integer.toString(item.getSpeed()).contains(symbol) ||
                    Integer.toString(item.getId()).contains(symbol) ||
                    Double.toString(item.getWeight()).contains(symbol)) {
                System.out.println(item);
            }
        }
    }

    @Override //+
    public double sumWeight(ArrayList<No2.Objects> collection) {
        int totalWeight = 0;
        for (No2.Objects car : collection)
            totalWeight += car.getWeight();
        return totalWeight;
    }

    @Override //+
    public No2.Objects thirdElementOfObjects() {
        No2.Objects result = list.get(2);
        return result;
    }

    @Override //+
    public void secondAndThirdElementsOfObjects() {
        No2.Objects[] result = new No2.Objects[2];
        result[0] = list.get(1);
        result[1] = list.get(2);
        for (No2.Objects item : result) {
            System.out.println(item);
        }
    }

    @Override //+!
    public List<No2.Objects> Pannert(ArrayList<No2.Objects> collection, int speed, double weight) {
        List<No2.Objects> patternObj = new ArrayList<No2.Objects>();
        for (No2.Objects objects : collection) {
            if (objects.getSpeed() < speed && objects.getWeight() > weight)
                patternObj.add(objects);
        }
        return patternObj;
    }
}
