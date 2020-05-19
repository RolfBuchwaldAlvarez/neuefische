import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculationTest {

  @Test
  public void fivePlus3ShouldBe8() {
    // GIVEN
    int firstValue = 3;
    int secondValue = 8;

    //WHEN
    int result = Calculation.add(firstValue, secondValue);

    //THEN
    assertEquals(11, result);
  }
}
