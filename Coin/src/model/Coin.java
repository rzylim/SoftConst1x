package model;

import java.util.Random;

public class Coin {
    private boolean status;
    private Random ran = new Random();

    //EFFECTS: Creates a new coin instance.
    public Coin() {}

    //MODIFIES: this
    //EFFECTS:  Flips the coin, and changes its status.
    public void flip() { status = ran.nextBoolean(); }

    //EFFECTS: Returns status of coin.
    public boolean checkStatus() { return status; }
}
