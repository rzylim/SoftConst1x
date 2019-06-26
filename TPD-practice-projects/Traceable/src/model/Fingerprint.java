package model;

public class Fingerprint implements Traceable{
    private Person owner;
    private String location;

    public Fingerprint(Person owner, String location){
        this.owner = owner;
        this.location = location;
    }

    //getters
    public Person getOwner() { return owner; }
    public String getLocation() { return location; }
    public Object getTrace() { return this; }

    public void track() {}
}
