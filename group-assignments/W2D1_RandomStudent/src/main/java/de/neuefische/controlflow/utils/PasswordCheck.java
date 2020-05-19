package de.neuefische.controlflow.utils;

import java.util.regex.Pattern;

public class PasswordCheck {

    //Method to validate one password
    public static boolean checkOnePassword(String password) {
        boolean hasUpperCase = !password.equals(password.toLowerCase());
        boolean hasLowerCase = !password.equals(password.toUpperCase());
        if (password.length() > 10 && password.matches(".*\\d.*")
                && hasUpperCase && hasLowerCase) {
            System.out.println("Passwort ist gültig");
            return true;
        }
        System.out.println("Passwort ist ungültig");
        return false;
    }

//Method to validate a list of passwords
    public static boolean checkManyPasswords(String[] passwords) {
        boolean validPassword = true;
        //Loop through array passwords
        for (int i = 0; i < passwords.length; i++) {
            boolean hasUpperCase = !passwords[i].equals(passwords[i].toLowerCase());
            boolean hasLowerCase = !passwords[i].equals(passwords[i].toUpperCase());
            //Check length, digits, upper/lower case
            if (passwords[i].length() > 10 && passwords[i].matches(".*\\d.*")
                    && hasUpperCase && hasLowerCase) {
                System.out.println("Das Passwort " + passwords[i] + " ist gültig");
                validPassword = true;
            } else {
                System.out.println("Das Passwort " + passwords[i] + " ist ungültig");
                validPassword = false;
            }
        }
        return validPassword;
    }

}
