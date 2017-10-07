package practice;

public class MainClass {

    public static void main (String [] args){
        Herbivorous caw = new Caw();
        caw.spawn();
        Caw caw1 = new Caw();
        System.out.println(caw1.die);

        Animal hyena = new Hyena();
        System.out.println(hyena.die + "\n" + hyena.live());
        Scavenger hyena1 = new Hyena();
        System.out.println(hyena1.die);
        hyena1.spawn();
    }
}
