package de.neuefische.inheritance;

import de.neuefische.inheritance.model.Animal;
import de.neuefische.inheritance.model.Being;
import de.neuefische.inheritance.model.Human;
import de.neuefische.inheritance.model.ZooDB;

import java.util.ArrayList;
import java.util.List;

public class AppMain {
    public static void main(String[] args) {


        //Instances of Being
        Being billGates = new Human(true, "Bill Gates",70,"Microsoft");
        Being steveJobs = new Human (false, "Steve Jobs", 60, "Apple");

        Being shark = new Animal(true,"Sharko", 12, "fish");
        Being turtle = new Animal(true,"Speedy", 99, "amphib");
        Being ape = new Animal(true, "Troll", 28, "mammal");
        Animal fish = new Animal(true, "fishi", 28, "fish");




        //generate List to have Collection
        List<Being> tempZoo = List.of(shark, turtle, ape, billGates, steveJobs);

        //Insert/Pass Collection into new Arraylist
        ArrayList<Being> myZoo = new ArrayList<>(tempZoo);


        //Initialise new ZooDB List with the values of myZoo
        ZooDB zooList = new ZooDB(myZoo);
        zooList.printArr();

        zooList.addElement(fish);
        zooList.printArr();







        System.out.println(billGates.printBeing());
        System.out.println(steveJobs.printBeing());


        /*        System.out.println(Being.printBeingListwithAgeSum(myZoo));*/


      /*  System.out.println(Animal.makeBaby((Animal )turtle, (Animal) shark));*/



    }

}
