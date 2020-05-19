package de.neuefische.controlflow.utils;

import de.neuefische.controlflow.utils.PasswordCheck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckTest {

    @Test
    public void ifValidPasswordIsGiven() {
    //GIVEN
    String password = "Erdnussbutter1992";

    //WHEN
    boolean result = PasswordCheck.checkOnePassword(password);

    //THEN
     assertTrue(result);
}

    @Test
    public void ifInvalidPasswordIsGiven() {
        //GIVEN
        String password = "Hai1992";

        //WHEN
        boolean result = PasswordCheck.checkOnePassword(password);

        //THEN
        assertFalse(result);
    }

    @Test
    public void ifNoPasswordInListIsInvalid() {
        //GIVEN
        String[] passwords = {"Pineapple123", "dArkwingduck1234", "Helloworld1992", "WinniePooh95"};

        //WHEN
        boolean result = PasswordCheck.checkManyPasswords(passwords);

        //THEN
        assertTrue(result);
    }

    @Test
    public void ifPasswordInListIsInvalid() {
        //GIVEN
        String[] passwords = {"Pineapple123", "dArkwingduck1234", "Helloworld1992", "winniepooh95"};

        //WHEN
        boolean result = PasswordCheck.checkManyPasswords(passwords);

        //THEN
        assertFalse(result);
    }

}