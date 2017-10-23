package No2.Methods;

import java.util.ArrayList;
import java.util.List;

public interface Methods {

    void deleteMaxSpeed();
    void deleteMinSpeed();
    void deleteLessSpeed(int speed);
    void deleteMoreSpeed(int speed);
    void sort(ArrayList<No2.Objects> collection);
    void addName ();
    void findSymbol ();
    double sumWeight(ArrayList<No2.Objects> collection);
    No2.Objects thirdElementOfObjects();
    void secondAndThirdElementsOfObjects ();
    List<No2.Objects> Pannert (ArrayList<No2.Objects> collection, int speed, double weigth);

}
