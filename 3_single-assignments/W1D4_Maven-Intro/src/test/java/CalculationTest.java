import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculationTest {

    @Test
    public void fivePlus6is11(){
        //Given
        int x = 5;
        int y = 6;

        //When
        int result = Calculations.add(x, y);

        //Then
        assertEquals(11, result);
    }
}
