public class MathUtil {

  public static int faculty(int number){
    if(number < 2){
      return 1;
    }

    int result = 1;
    while (number > 1){
      result *= number;
      number--;
    }

    return result;
  }
}
