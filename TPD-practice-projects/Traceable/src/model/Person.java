package model;

public class Person {
    private String name;
    private Fingerprint fingerprint;

    public Person(String name) {
        this.name = name;
        fingerprint = null;
    }

    //getters
    public String getName() { return name; }
    public Fingerprint getFingerprint() { return fingerprint; }

    //setters
    public void setName(String name) { this.name = name; }
    public void setFingerprint(Fingerprint fingerprint) { this.fingerprint = fingerprint; }
}
