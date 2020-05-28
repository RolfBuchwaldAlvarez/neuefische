# 13.05.2020, Mittwoch

### 9:00 Uhr - Start Week1 Day3


## Tagesablauf

- 9:00 Uhr: Recap Mo. 12.05.2020
- 9:30 Uhr: Theorie und Praxis (Variablen, Datentypen, Operatoren)
- 13:00 Uhr: Lunch für 60 Minuten
- 14:00 Uhr: Theorie und Praxis (Methoden)
- 17:00 Uhr: flexible Übungen
- 18:00 Uhr: Ende offizieller Teil


## Datentyp String
-  String -> Java ist streng typisiert
- ist definiert als Zeichenkette (Text)
- kann nicht verändert werden
- Anderungen führt zu neuen String
- Variable definiert —> Variable erzeugen : String someString


## Variablen
- String someVariable;
- -> String someVariable = "Hallo Kurs!";
- Variabel definiert in IntelliJ
- System.out.println(someVariable);
- -> kann ausgelesen werden

## Datentyp Boolean

- Datentyp für Wahrheitswerte
- boolean boolValue = true;
  boolean boolValue = false;
- System.out.println(boolValue);
-> kann nur zwei Werte haben "true" oder "false"

## Datentyp Integer

- int ist der Standardwert für Ganzzahlenwerte, keine "Kommazahlen" möglich
- zwischen -2^31   bis  2^31-2

## Integer Operatoren
- int intValue = 3 + 4;
- int result = intValue + 7;
- System.out.println(result);

- Basis Operatoren:  Addition, Subtraktion, Multiplikation, Division, Modulo (%)
                    


## String Operatoren

- da JavaString streng typisiert
- in Java lassen sich alle Werte in String konvertieren
-> z.B. Beispiel boolean-Wert oder int-Wert -> wird "gecastet" d.h. Typumwandlung
- `cmd+alt+V` -> Variabel auslagern

## primitive Datentypen
- byte (sehr kleine ganzzahlige Werte)
- ``byte someByte  = 113;``

- short (kleine ganzzahlige Werte)`
- ``short someShort = 30000; ``

- int (ganzzahlige Werte)
- `int   someInt   = 300000;`
- long (große ganzzahlige Werte)
- `long  someLong  = 3000000000L;`

- float (kleine Fließkommawerte)
- `float someFloat = 300000000000000.0f;`
- double (Fließkommawerte)
- `double someDouble = 30000000000000.20003;`
- char (einzelnes Zeichen)
- `char someChar = 'a';`
- boolean (Wahrheitswert)
- `boolean someBoolean = false;`

- String ist kein primitiver Datentyp, eher Sonderfall 
-> "Zusammensetzung aus chars"
- <https://de.wikibooks.org/wiki/Java_Standard:_Primitive_Datentypen>

### kleiner Einblick in Rechnerarchitektur
- warum so viele Typen? --> "liegt an der Organisation von Rechnern”
-	1 Byte = 8 Bit
-> 8 "Speicherplätze" mit 0 & 1 

## Javadoc 
- wird nicht oft geändert
<https://docs.oracle.com/javase/7/docs/api/java/lang/String.html>

## Relationale und Gleichheitsoperatoren
- alle primitiven Daten außer `boolean` können verglichen werden, da: 
- `boolean result = someInt < someOtherInt;`
- ==, <, >, <=, >=

#### Shortcuts
- Key Promoter X bei Plugins bei IntelliJ installieren 


## Methoden
- auch Funktion genannt 
- mithilfe von Methoden kann man Code kapseln, wiederverwenden und strukturieren
- Eingabe --> Methode --> Rückgabe
- ``Methode`` definieren: `public static int duplicate(int value){
                                  return value * 2;}`
- ``duplicate`` -> Name der Methode
- `int value` -> Eingabe Parameter
- `int` duplicate -> Rückgabetyp
- `return` -> Rückgabe von Ergebnis
- wichtig beim Ausführen in IntelliJ: in einer class arbeiten

## Debugging in IntelliJ
- unterstützt bei Suche von Programmierfehlern
- Step over -> springt aus der Methode raus
- Step into -> in die Methode rein
- Breakpoints setzen

## Task
-	zwei int Parameter entgegennehmen und die Summe dieser zurück geben
- einen int Parameter entgegennehmen und einen String “Summe : (int Parameter)” zurückgeben
- beide Methoden in der Main Methode nacheinander ausführen und den String auf der Konsole ausgeben
- prüfen ob ein int wert größer als 100 ist
 

#### Upload von daily protocol
- siehe Video (in Slack runterladen)


### 18:00 – Ende Week1 Day3