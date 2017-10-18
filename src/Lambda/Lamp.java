package Lambda;

import org.omg.CORBA.Object;

public class Lamp implements ElectricityConsumer{
    public void lightOn(){
        System.out.println("Лампа зажглась");
    }


    @Override
    public void electricityOn(Object sen) {
        lightOn();
    }
}
