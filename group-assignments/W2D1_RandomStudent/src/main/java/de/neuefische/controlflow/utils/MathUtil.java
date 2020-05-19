package de.neuefische.controlflow.utils;

public class MathUtil {

    public static int calculateFaculty(int value) {

        if(value < 2) {
            System.out.println("Faculty is 1.");
            return 1;
        }
        int result = 1;
        while(value > 1) {
            result *= value;
            value--;
        }
        /* Alternative for loop:
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }*/
        System.out.println("Faculty is " + result + ".");
        return result;

    }

}
