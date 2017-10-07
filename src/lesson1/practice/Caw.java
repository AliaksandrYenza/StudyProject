package practice;

public class Caw extends Herbivorous {

    @Override
    public void spawn() {
        System.out.println("Caw is viviparous");
    }

    @Override
    public void eatPlants() {
        System.out.println("Caw eat plants");
    }
}
