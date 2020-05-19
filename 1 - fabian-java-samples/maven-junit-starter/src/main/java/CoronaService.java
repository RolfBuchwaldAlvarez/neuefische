public class CoronaService {
  public static String checkToManyPersons(int numberOfPersons) {
    if(numberOfPersons <= 30){
      return "Maximale Personenzahl nicht überschritten";
    }
    return "Zu viele Personen zurück";
  }
}
