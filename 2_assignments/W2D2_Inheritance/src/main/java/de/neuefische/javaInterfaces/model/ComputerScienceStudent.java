package de.neuefische.javaInterfaces.model;

import de.neuefische.javaInterfaces.interfaces.Student;

public class ComputerScienceStudent extends Student {
    boolean laptop;


    public ComputerScienceStudent(String name, int age, char gender, String major, int id, boolean laptop) {
        super(name, age, gender, major, id);
        this.laptop = laptop;
    }

    @Override
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public void setAge(int age){
        this.age = age;
    }

    @Override
    public int getAge(){
        return this.age;
    }

    @Override
    public void setID(int id){
        this.id = id;
    }

    @Override
    public int getID(){
        return id;
    }

    /*
    @Override
    public String toString(){
        return s;
    }
     */

}
