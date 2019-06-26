package model;

import java.util.ArrayList;

public class CellPhone implements Traceable{
    private Person owner;
    private ArrayList<Call> calls;
    private String location;

    public CellPhone(Person owner, String location){
        this.owner = owner;
        this.location = location;
        calls = new ArrayList<>();
    }

    //getters
    public Person getOwner() { return owner; }
    public ArrayList<Call> getCalls() { return calls; }
    public Object getTrace() { return this; }
    public String getLocation() { return location; }

    public void addCall(Call call){ calls.add(call); }

    public void track() {}
}
