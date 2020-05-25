package de.neuefische.springsetup.model;

public class Student {

    String id;
    String name;
    int age;

    public Student(String id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

}
