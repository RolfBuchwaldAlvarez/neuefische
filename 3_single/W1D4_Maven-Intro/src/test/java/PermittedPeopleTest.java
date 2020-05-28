import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermittedPeopleTest {

    @Test
    public void moreThan30People() {
        //Given
        int numberOfPersons = 31;

        //When
        String result = PermittedPeople.maxPeopleAlert(numberOfPersons);

        //Then
        assertEquals("Zu viele Personen.", result);
    }

    @Test
    public void exactly30People() {
        //Given
        int numberOfPersons = 30;

        //When
        String result = PermittedPeople.maxPeopleAlert(numberOfPersons);

        //Then
        assertEquals("Maximale Personenzahl nicht überschritten.", result);
    }

    @Test
    public void lessThan30People() {
        //Given
        int numberOfPersons = 29;

        //When
        String result = PermittedPeople.maxPeopleAlert(numberOfPersons);

        //Then
        assertEquals("Maximale Personenzahl nicht überschritten.", result);
    }

    @Test
    public void alertColourRed() {
        //Given
        String alertColour = "rot";

        //When
        String result = PermittedPeople.colourAlert("rot");

        //Then
        assertEquals("keine Personen", result);
    }

    @Test
    public void alertColourYellow() {
        //Given
        String alertColour = "gelb";

        //When
        String result = PermittedPeople.colourAlert("gelb");

        //Then
        assertEquals("max 30 Personen", result);
    }

    @Test
    public void alertColourGreen() {
        //Given
        String alertColour = "grün";

        //When
        String result = PermittedPeople.colourAlert("grün");

        //Then
        assertEquals("max 60 Personen", result);
    }

    @Test
    public void alertColourWrong() {
        //Given
        String alertColour1 = "blau";

        //When
        String result = PermittedPeople.colourAlert("blau");

        //Then
        assertEquals("invalid alert", result);
    }


}