package model;

public class Call implements Traceable {
    private CellPhone outgoing;
    private String location;

    public Call(CellPhone outgoing, String location) {
        this.outgoing = outgoing;
        this.location = location;
    }

    //getters
    public CellPhone getOutgoing() { return outgoing; }
    public String getLocation() { return location; }
    public Object getTrace() { return this; }

    public void track() {}
}
