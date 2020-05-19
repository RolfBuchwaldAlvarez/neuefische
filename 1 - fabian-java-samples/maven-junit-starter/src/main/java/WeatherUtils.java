public class WeatherUtils {

  public static String isNiceWeather(int degree) {
    if (degree > 20) {
      return "Nice Weather";
    }
    return "To cold";
  }

}
