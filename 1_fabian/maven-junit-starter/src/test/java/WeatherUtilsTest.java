import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeatherUtilsTest {

  @Test
  public void whenDegreeOver20ThenIsNiceWeatherShouldReturnNiceWeather() {
    //GIVEN
    int degree = 21;

    //WHEN
    String result = WeatherUtils.isNiceWeather(degree);

    //THEN
    assertEquals("Nice Weather", result);
  }

  @Test
  public void whenDegreeIsUnderOrEqual20DegreeIsNiceWeatherShouldReturnToColde() {
    //GIVEN
    int degree = 20;

    //WHEN
    String result = WeatherUtils.isNiceWeather(degree);

    //THEN
    assertEquals("To cold", result);
  }

}
