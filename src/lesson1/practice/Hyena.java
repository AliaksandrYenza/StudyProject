package practice;

public class Hyena extends Scavenger {

    public String die = this.die + "or killed";

    @Override
    public void spawn() {
        System.out.println("Hyena spawn as viviparous");
    }

    @Override
    public void eatFlesh() {
        System.out.println("Hyena eat carrion");
    }
}
