package de.neuefische.inheritanceCollectionsExceptions.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ZooDBTest {



        @Test
        public void addElementValidName() {
        //GIVEN
            Being parrot = new Animal (true, "Michael", 20, "bird");
            Being shark = new Animal(true,"Sharko", 12, "fish");
            Being turtle = new Animal(true,"Speedy", 99, "amphib");
            Being ape = new Animal(true, "Troll", 28, "mammal");
            List<Being> tempZoo = List.of(shark, turtle, ape);
            ArrayList<Being> myZoo = new ArrayList<>(tempZoo);
            ZooDB zooList = new ZooDB(myZoo);
            zooList.addElement(parrot);
            //WHEN
            String result = myZoo.get(myZoo.size()-1).getName();
            //THEN
            assertEquals("Michael", result);
        }

    @Test
    public void addElementInvalidName() {
//GIVEN
        Being parrot = new Animal (true, "Sharko", 20, "bird");
        Being shark = new Animal(true,"Sharko", 12, "fish");
        Being turtle = new Animal(true,"Speedy", 99, "amphib");
        Being ape = new Animal(true, "Troll", 28, "mammal");
        List<Being> tempZoo = List.of(shark, turtle, ape);
        ArrayList<Being> myZoo = new ArrayList<>(tempZoo);
        ZooDB zooList = new ZooDB(myZoo);
        zooList.addElement(parrot);
        //WHEN
        String result = myZoo.get(myZoo.size()-1).getName();
        //THEN
        assertEquals("Name already in use", result);
    }




}