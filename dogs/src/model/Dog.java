package model;

public class Dog {

    public String name;
    private int age;

    public Dog () {
    }

    // getters
    public String getName() { return name; }
    public int getAge() { return age; }

    public void bark() {
        System.out.println("woof!");
    }
}
