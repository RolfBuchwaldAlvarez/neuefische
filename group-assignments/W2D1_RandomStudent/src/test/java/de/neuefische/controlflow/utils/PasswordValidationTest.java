package de.neuefische.controlflow.utils;

import de.neuefische.controlflow.utils.PasswordValidation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidationTest {

    @Test
    public void ifLengthIsNotValidShowError() {
        String password = "Test123";
        boolean result = PasswordValidation.checkPassword(password);
        assertFalse(result);
    }

    @Test
    public void ifContainsNoDigitsShowError() {
        String password = "Testpasswort";
        boolean result = PasswordValidation.checkPassword(password);
        assertFalse(result);
    }

    @Test
    public void ifContainsNoLetters() {
        String password = "12345678910";
        boolean result = PasswordValidation.checkPassword(password);
        assertFalse(result);
    }

    @Test
    public void ifListOfPasswordsIsCompletelyValid() {
        String[] passwords = {"Pineapple123", "Darkwing1234", "Helloworld19", "WinniePooh95"};
        boolean result = PasswordValidation.checkPasswordList(passwords);
        assertTrue(result);
    }

    @Test
    public void ifListOfPasswordsIsNotCompletelyValid() {
        String[] passwords = {"pineapple123456678", "darkwing1234", "Helloworld19", "WinniePooh95"};
        boolean result = PasswordValidation.checkPasswordList(passwords);
        assertFalse(result);
    }

    @Test
    public void ifListOfPasswordsIsNotCompletelyValid_2() {
        String[] passwords = {"pineapple123456678", "darkwing1234", "Helloworld19", "WinniePooh95"};

        boolean result = PasswordValidation.checkAllPasswords(passwords);
        assertFalse(result);
    }

}