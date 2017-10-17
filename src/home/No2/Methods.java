package No2;

import lesson2.obj.Obj;

import java.util.Collection;
import java.util.List;

public interface Methods {

    void deleteMaxWeight(Collection<Obj> collection);
    void deleteMinWeight(Collection<Obj> collection);
    void deleteLessWeight(Collection<Obj> collection, double weight);
    void deteleOverWeight(Collection<Obj> collection, double weight);
    int sumWeight(Collection<Obj> collection);
    Obj thirtObj(Collection<Obj> collection);
    Obj[] secondAndThird (Collection<Obj> collection);
    List<Obj> weightPattern (Collection<Obj> collection, double weight);
}
