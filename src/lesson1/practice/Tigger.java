package practice;

public class Tigger extends Hunter{


    @Override
    public void eatFlesh() {
        System.out.println("Tigger eat flesh");
    }

    @Override
    public void hunt() {
        System.out.println("Tigger hunt");
    }

    @Override
    public void takeVictim() {
        System.out.println("Tigger take victim");
    }

    @Override
    public void kill() {
        System.out.println("Tigger want eat- he's killer");
    }
}
