package practice;

abstract public class Herbivorous extends Consulter implements IEatPlants{

    public String live() {
        return "Herbivorous live";
    }

    @Override
    public void spawn(){
        System.out.println("viviparous and oviparous");
    }
}
