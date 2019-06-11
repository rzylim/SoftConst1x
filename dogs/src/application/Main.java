package application;

import model.Dog;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        int x;
        x = 3;
        System.out.println(x);
        Dog d;
        d = new Dog();
        Dog fido;
        fido = d;
        d.bark();
        d.name = "Jim";
        fido.name = "Fido";
        System.out.println(d.name);

        ArrayList<Dog> dogs = new ArrayList<Dog>();
        dogs.add(d);
        dogs.add(d);
        System.out.println(dogs);
    }
}
