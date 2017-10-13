package lesson2.obj;

import lesson2.Testable;

import java.util.*;

public class Obj {
    private Integer id;
    private String name;
    private Double weight;
    private Integer speed;

    public Obj(Integer id, String name, Double weight, Integer speed) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.speed = speed;
    }

    public void objectCollections(){
        Obj object = new Obj(1, "fd", 45.5, 454);

    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getWeight() {
        return weight;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public static void main(String[] args){
        System.out.print("Set: \n");
        Testable testable = new SetObj();
        testable.test();
        System.out.print("Map: \n");
        testable = new MapObj();
        testable.test();
        System.out.print("List: \n");
        testable = new ListObj();
        testable.test();
    }
}
