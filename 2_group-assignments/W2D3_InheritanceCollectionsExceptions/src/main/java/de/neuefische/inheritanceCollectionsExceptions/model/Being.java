package de.neuefische.inheritance.model;

import java.util.Objects;

public abstract class Being {

   private boolean isAlive;
   private String name;
   private int age;

   public static int printBeingListwithAgeSum(Being[] zoo){
       int sum = 0;
       for (int i = 0; i < zoo.length; i++) {
           sum += zoo[i].getAge();
       }
       return sum;
   }


    public Being (boolean isAlive, String name, int age) {
       this.isAlive = isAlive;
       this.name = name;
       this.age = age;
   }

   //CUSTOM METHOD 1
   public String printBeing(){
       String alive = this.isAlive ? "alive" : "dead";
       return "Hello, my Name is " + this.name + ", I'm " + this.age + " years old and of course I'm " + alive;
   }
   //CUSTOM METHOD 2
    public abstract String move();


   //CUSTOM METHOD 3


    public boolean isAlive() {
        return isAlive;
    }

    public String getName() {
        return name;
    }


    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Being{" +
                "isAlive=" + isAlive +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Being being = (Being) o;
        return isAlive == being.isAlive &&
                Objects.equals(name, being.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isAlive, name);
    }
}
