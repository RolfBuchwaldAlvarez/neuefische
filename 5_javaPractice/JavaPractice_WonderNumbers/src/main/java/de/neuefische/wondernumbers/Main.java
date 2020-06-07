package de.neuefische.wondernumbers;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        WonderTest wonderTest = new WonderTest();

        List<Integer> wonderList = wonderTest.wonder(1);

        for (int i = 2; i <= 100; i++) {
            if (wonderTest.wonder(i).size() > wonderList.size()) {
                wonderList = wonderTest.wonder(i);
                args = new String[1];
                args[0] = Integer.toString(i);
            }
        }

        System.out.println(wonderList.size());
        System.out.println(args[0]);

    }
}
