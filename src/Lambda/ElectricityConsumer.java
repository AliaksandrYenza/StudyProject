package Lambda;

import org.omg.CORBA.Object;

@FunctionalInterface //только 1 абстр метод
public interface ElectricityConsumer {

    void electricityOn(Object sen);
}
