package de.neuefische.inheritance.model;

public class Animal extends Being {

    private String species;

   /* public static Animal makeBaby(Animal papa, Animal mama) {
        return new Animal(true,papa.getName() + mama.getName(), 0, papa.getSpecies() + mama.getSpecies());
    }*/

    public Animal(boolean isAlive, String name, int age,String species) {
        super(isAlive,name,age);
        this.species = species;
    }

    public String move() {
        return "schwimmen";
    }

    public String getSpecies() {
        return species;
    }

}
