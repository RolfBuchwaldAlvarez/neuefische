package de.neuefische.controlflow.utils;

public class ArrayFun {

   /* public static void main(String[] args) {

        String[] students = new String[14];
        for (int i = 0; i < students.length; i++) {
            students[i] = "de.neuefische.controlflow.model.Student " + (i + 1);
            System.out.println(students[i] + " is a very good student.");
        }

    }*/

    public static String[] createStudentsArray(int value) {
        String[] students = new String[value];
        for (int i = 0; i < value; i++) {
            students[i] = "de.neuefische.controlflow.model.Student " + (i + 1);
        }
        return students;
    }
}

