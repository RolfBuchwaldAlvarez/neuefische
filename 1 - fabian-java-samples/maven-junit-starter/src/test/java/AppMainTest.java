import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppMainTest {

  @Test
  @DisplayName("When String is fancy then isFance should return true")
  public void whenStringIsFancyThenIsFancyShouldReturnTrue() {
    //GIVEN
    String someString = "fancy";

    //WHEN
    boolean fancy = AppMain.isFancy(someString);

    //THEN
    assertTrue(fancy);
  }
}
