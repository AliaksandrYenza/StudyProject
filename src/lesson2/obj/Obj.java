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

    public String toString(){
        return "\tObject No." + id + " name: " + name + " weight: " + weight + " speed: " + speed;
    }
}
