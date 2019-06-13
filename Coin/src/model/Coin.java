package model;

public class Coin {
    private boolean status;

    //EFFECTS: Creates a new coin instance.
    public Coin() {}

    //MODIFIES: this
    //EFFECTS:  Flips the coin, and changes its status.
    public void flip() { this.status = true; }

    //EFFECTS: Returns status of coin.
    public boolean checkStatus() { return status; }
}
