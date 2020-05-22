package de.neuefische.inheritance.model;

public class Human extends Being {

    private String profession;

    public Human(boolean isAlive, String name, int age, String profession) {
        super(isAlive,name,age);
        this.profession = profession;
    }

    public String printBeing() {
        return super.printBeing() + ". I am the founder of " + this.profession;
    }
    public String move() {
        return "laufen";
    }


}
