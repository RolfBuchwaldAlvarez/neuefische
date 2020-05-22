package de.neuefische.javaInterfaces.model;

public class Student {
    String name;
    int age;
    char gender;
    String major;
    int id;

    public Student(String name, int age, char gender, String major, int id){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.major = major;
        this.id = id;
    }

    public Student(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return this.gender;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return this.major;
    }

    public void setID(int id) {
        this.id = id;
    }

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
}
