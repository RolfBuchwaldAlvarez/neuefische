package de.neuefische.controlflow.utils;

import java.util.Arrays;

public class PasswordValidation {

    //Method to check password length
    public static boolean isLengthValid(String password) {
        if (password.length() >= 10 && password.length() <= 15) {
            return true;
        }
        //   System.out.println("Ihr Passwort muss zwischen 10 und 15 Zeichen lang sein.");
        return false;
    }

    //Method to check if password contains digits
    public static boolean containsDigits(String password) {
        if (password.matches(".*\\d.*")) {
            return true;
        }
        //System.out.println("Ihr Passwort muss min. eine Ziffer enthalten.");
        return false;
    }

    //Method to check if password contains upper and lower case letters
    public static boolean containsUpperAndLowerCaseLetters(String password) {
        if (password.matches(".*[a-z].*") && password.matches(".*[A-Z].*")) {
            return true;
        }
        //System.out.println("Ihr Passwort muss min. einen Klein- und einen Großbuchstaben enthalten.");
        return false;
    }

    //Method to combine all check methods for one single password
    public static boolean checkPassword(String password) {
        if (!isLengthValid(password)) {
            System.out.println("Ihr Passwort muss zwischen 10 und 15 Zeichen lang sein.");
            return false;
        }
        if (!containsDigits(password)) {
            System.out.println("Ihr Passwort muss min. eine Ziffer enthalten.");
            return false;
        }
        if (!containsUpperAndLowerCaseLetters(password)) {
            System.out.println("Ihr Passwort muss min. einen Klein- und einen Großbuchstaben enthalten.");
            return false;
        }
        System.out.println("Ihr Passwort ist super!");
        return true;
    }

    //Method to combine all check methods for list of passwords
    public static boolean checkPasswordList(String[] passwords) {

        boolean isListValid = true;

        for (int i = 0; i < passwords.length; i++) {
            String whatWentWrong = "";
            boolean isLengthOk = true;
            boolean isDigitsOk = true;
            boolean isLettersOk = true;
            if (!isLengthValid(passwords[i])) {
                whatWentWrong = "Passwort " + passwords[i] + " muss zwischen 10 und 15 Zeichen lang sein. ";
                isLengthOk = false;
            }
            if (!containsDigits(passwords[i])) {
                whatWentWrong = whatWentWrong + "Passwort " + passwords[i] + " muss min. eine Ziffer enthalten. ";
                isDigitsOk = false;
            }
            if (!containsUpperAndLowerCaseLetters(passwords[i])) {
                whatWentWrong = whatWentWrong + "Passwort " + passwords[i] +
                        "muss min. einen Klein- und einen Großbuchstaben enthalten.";
                isLettersOk = false;
            }
            if (!isLengthOk || !isDigitsOk || !isLettersOk) {
                System.out.println(whatWentWrong);
                isListValid = false;
            } else {
                System.out.println("Passwort " + passwords[i] + " ist super!");
            }
        }
        if(isListValid) {
            System.out.println("Alle Passwörter auf der Liste sind super!");
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkAllPasswords(String[] passwords) {
        long badPasswordCount = Arrays
                .stream(passwords)
                .map(PasswordValidation::checkPassword)
                .filter(result -> !result)
                .count();
        return badPasswordCount == 0;
    }
}

