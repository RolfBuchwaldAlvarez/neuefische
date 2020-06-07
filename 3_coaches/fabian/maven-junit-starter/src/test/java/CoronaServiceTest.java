import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoronaServiceTest {

  @Test
  @DisplayName("return to many persons when number over 30")
  public void toManyPersons(){
    //GIVEN
    int numberOfPersons = 33;

    //WHEN
    String result = CoronaService.checkToManyPersons(numberOfPersons);

    //THEN
    assertEquals(result,"Zu viele Personen zurück");
  }


  @Test
  @DisplayName("return not to many persons when number under equal 30")
  public void notToManyPersons(){
    //GIVEN
    int numberOfPersons = 30;

    //WHEN
    String result = CoronaService.checkToManyPersons(numberOfPersons);

    //THEN
    assertEquals(result,"Maximale Personenzahl nicht überschritten");
  }

}
