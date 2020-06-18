
public class PlayWithDataTypes {
    public static void main(String[] args) {
        int resultSum = sum(5, 8);
        System.out.println(printSum(resultSum));
        boolean biggerHundredVariable = biggerHundred(140);
        System.out.println(biggerHundredVariable);
        stringBigger20("Fussballtorwarthandschuhe");
        containsFancy("Diese Schuhe sind fancy!");

    }

    // Methode, die 2 int Parameter entgegen nimmt und deren Summe zurückgibt
    public static int sum(int x, int y) {
        int sum = x + y;
        return sum;
    }

    // Methode, die das Wort Summe und den Inhalt aus resultSum als String zurück gibt
    public static String printSum(int resultSum) {
        return "Summe " + resultSum;
    }

    // Methode, die prüft, ob int Wert >= 100 ist
    public static boolean biggerHundred(int z) {

        if (100 <= z) {
            return true;
        } else {
            return false;
        }
    }

    // Methode, die prüft, ob ein String mehr als 20 Zeichen enthält
    public static void stringBigger20(String word) {
        int number = 20;
        int amountChar = word.length();
        boolean isBigger = number <= amountChar;
        System.out.println(isBigger);
    }

    // Methode, die prüft, ob ein String die Zeichenfolge "fancy" enthält
    public static void containsFancy(String sentence) {
        boolean contains = sentence.contains("fancy");
        if (contains) {
            System.out.println("Ja, der Satz enthält die Zeichenfolge \"fancy\"!");
        } else {
            System.out.println("Nein, der Satz enthält die Zeichenfolge \"fancy\" nicht!");
        }
    }
}
