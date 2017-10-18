package Lambda;

import lesson2.obj.Obj;
import org.omg.CORBA.Object;

public class MainClass {
//остались стримы
    public static void fire (Object sen){
        System.out.println("Fire!!!");

    }
    public static void main (String[] args){
        Switcher switcher = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        //подписка на события
//        switcher.consumer = lamp;
        switcher.addElectricityListener(lamp);
        switcher.addElectricityListener(radio);

        String message = "что то не то";

        switcher.addElectricityListener(
                new ElectricityConsumer() {
                    @Override
                    public void electricityOn(Object sen) {
                        System.out.println(message); //перехват
                        System.out.println("Fire");
                    }
                }
        );

//        class Fire implements ElectricityConsumer{
//
//            @Override
//            public void electricityOn() {
//                System.out.println("Пожар");
//            }
//        }


        // 8 java
//        switcher.addElectricityListener(  sen ->
//                MainClass.fire(sen)
//                );
        switcher.addElectricityListener(sen -> System.out.println(message));
        switcher.addElectricityListener(MainClass::fire);  //если бы FIRE не стат, то вместо MainClass нужно ввожить ссылку на объект этого класса
        switcher.SwitchOn();
    }
}
