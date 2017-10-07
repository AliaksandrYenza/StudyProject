package practice;

abstract public class Hunter extends Predator implements IHunter {

    public String die = "Hunter was die when he hunt";

    public String live() {
        return "Hunter live";
    }
}
