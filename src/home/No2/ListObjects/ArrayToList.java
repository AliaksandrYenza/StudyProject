package No2.ListObjects;

import No2.ArrayObjects;
import No2.Objects;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToList {

    public static ArrayList<Objects> arrayObjectsToList(){
        ArrayList<No2.Objects> objectsList = new ArrayList<>();
        objectsList.addAll(Arrays.asList(ArrayObjects.arrayObjectsInfo));
        return objectsList;
    }
}
