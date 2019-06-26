package model;

import java.util.ArrayList;
import java.util.List;

public class Zookeeper {

    private String name;
    private int age;
    private List<Animal> animalList;
    private Animal favourite;

    public Zookeeper(String nm, int age) {
        this.name = nm;
        this.age = age;
        animalList = new ArrayList<>();
        favourite = null;
    }

    //getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public List<Animal> getAnimalList() { return animalList; }
    public Animal getFavourite() { return favourite; }

    //setters
    public void setFavourite(Animal favourite) { this.favourite = favourite; }

    public void addToList(Animal a) { animalList.add(a); }
    public boolean removeFromList(Animal a) { return animalList.remove(a); }
}