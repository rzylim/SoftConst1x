package model;

public abstract class Vegetable implements Growable {
    private String name;
    private VegType type;
    private String instructions;

    public Vegetable(String name, VegType type){
        this.name = name;
        this.type = type;
        this.instructions = "";
    }

    //getters
    public String getName() { return name; }
    public VegType getType() { return type; }
    @Override
    public String getInstructions() { return instructions; }

    //setters
    public void setName(String name) { this.name = name; }
    public void setType(VegType type) { this.type = type; }
    protected void setInstructions(String instructions) { this.instructions = instructions; }

}
