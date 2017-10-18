package Lambda;

import org.omg.CORBA.Object;

public class Radio implements ElectricityConsumer{

    public void playMusic(){
        System.out.println("Радио играет");
    }


    @Override
    public void electricityOn(Object sen) {
        playMusic();
    }
}
