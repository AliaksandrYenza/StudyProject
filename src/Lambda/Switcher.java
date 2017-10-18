package Lambda;

import org.omg.CORBA.Object;

import java.util.ArrayList;
import java.util.List;

public class Switcher {

    private List<ElectricityConsumer> listeners = new ArrayList<>();

    public void addElectricityListener(ElectricityConsumer listener){
        listeners.add(listener);
    }

    public void removeElectricityListener(ElectricityConsumer listener){
        listeners.remove(listener);
    }

    public void SwitchOn(){
        System.out.println("Свичер включен");
//        if (consumer != null){
//            consumer.electricityOn();
//        }
        for (ElectricityConsumer electricityConsumer: listeners){
            electricityConsumer.electricityOn((Object) this);
        }
    }
}
