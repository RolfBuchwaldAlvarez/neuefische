package de.neuefische.inheritance.model;

import java.util.ArrayList;

public class ZooDB {

    private ArrayList<Being> zoo;

    public ZooDB(ArrayList<Being> zoo){
        this.zoo = zoo;
    }






    public ArrayList<Being> getZoo() {
        return zoo;
    }

    //CUSTOM METHOD1
    public void addElement (Being wildAnimal) {

        for (int i = 0; i < zoo.size(); i++) {
            if (zoo.get(i).getName().equals(wildAnimal.getName())) {
                throw new RuntimeException("Name already in use");
            }
        }

        zoo.add(wildAnimal);


    }

    //CUSTOM METHOD2
    public void printArr () {

        for (Being being : zoo) {
            System.out.println(being.isAlive() + ", " + being.getName() + ", " + being.getAge());

        }
    }


}
