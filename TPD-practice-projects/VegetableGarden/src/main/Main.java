package main;


import model.Carrot;
import model.Lettuce;
import model.Tomato;
import model.Vegetable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vegetable> garden = new ArrayList();
        garden.add(new Carrot());
        garden.add(new Tomato());
        garden.add(new Lettuce());

        for(Vegetable veg : garden){
            System.out.println(veg.getName() + ": " + veg.getInstructions());
            veg.feed();
            veg.water();
            veg.harvest();
        }
    }


}
