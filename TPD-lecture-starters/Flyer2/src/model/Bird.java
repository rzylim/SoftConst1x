package model;

public abstract class Bird implements Flyer {

    // NOTE: this project accompanies the Abstract Classes video

    @Override
    public void takeOff() {
        System.out.println("Flap flap flap jump");
    }

    @Override
    public abstract void fly();

    @Override
    public void land() {
        System.out.println("Flap hop run run");
    }


}
