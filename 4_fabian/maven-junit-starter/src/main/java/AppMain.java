public class AppMain {

  public static void main(String[] args){
    String someString = "fancy";
    boolean fancy = isFancy(someString);

    System.out.println(fancy);

  }

  public static boolean isFancy(String someString) {
    return someString.contains("fancy");
  }

}
