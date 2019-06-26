package model;

public class PrivatePlane extends Airplane {

    // NOTE: this project accompanies the Abstract Classes video

    // MODIFIES: this
    // EFFECTS:  prints brought warm towels
    public void bringWarmTowels(){
        System.out.println("Here is your warm towel!!");
    }

    @Override
    public void serveSnacks() {
        serveCaviar();
        serveCashews();
        super.serveSnacks();
    }

    public void serveCaviar() {
        System.out.println("Serving caviar.");
    }

    public void serveCashews() {
        System.out.println("Serving cashews.");
    }

}