package de.neuefische.javaInterfaces.model;

import de.neuefische.javaInterfaces.interfaces.Student;

public class HistoryStudent implements Student {

    private String name;
    private int age;
    private int id;

    public HistoryStudent(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public void setID(int id) {
        this.id = id;
    }

    @Override
    public int getID() {
        return id;
    }

    /*
    @Override
    public String toString() {
        return s;
    }
     */
}