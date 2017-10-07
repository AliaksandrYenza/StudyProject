package practice;

abstract public class Predator extends Animal implements IEatMeat{

    public String die = "Predator die not so often";

    public String live() {
        return "Predator live";
    }

    @Override
    public void spawn() {
        System.out.println("Predator viviparous in the main");
    }

}
