# 12.05.2020, Dienstag

### 9:00 Uhr - Start Week1 Day2

## Anwesenheit

![picture alt](https://github.com/RolfBuchwaldAlvarez/Recap_Day2_12_Mai_2020/blob/master/Anwesenheits-Foto-12-05-2020.png)

## Tagesablauf

- 9:00 Uhr: Recap Mo. 11.05.2020
- 9:30 Uhr: Theorie und Praxis (Git Remote, Repositories, Pull-Requests)
- 13:00 Uhr: Lunch für 60 Minuten
- 14:00 Uhr: Theorie und Praxis (IntelliJ, Web Architektur, Java Intro)
- 17:00 Uhr: flexible Übungen
- 18:00 Uhr: Ende offizieller Teil

## Geplanten Inhalte
- Git Remote
- Markdown: Beschreibungssprache
- Web Einführung
- Java Intro

## Protokoll-Erstellung
- Mit IntelliJ oder alternativ mit Markdown bei Github

## Git Remote (Wiederholung)
- git remotes (remote repositories)
- git clone
- git pull (nicht lokal; mit diesem Befehl git repository runterladen)
- git push (Befehl sendet Änderungen Richtung remote)
- git workflow (z.B. feature Branch)

### Fabian legt neues Repository in Github an (remote-test-repository)
- Mit SSH Repository klonen: git clone [ssh-link]
- Folgende Befehle hat Fabian benutzt: `ls`, `pwd`, `echo “ … “ >> [sh-Datei]`, `ls`, `git add .`, `ls`, `git status`, `git commit -m “[Commit-Bezeichner]”`
- In Sourcetree: Fetch-Button -> ist quasi Pull ohne Merge; holt Dir nur die Änderung
-	Wir erstellen nochmal ein Repository in Github und klonen das Repository inklusive Bearbeitung.

### Github Pull-(Merge-)Request (Fabian)
-	Erklärt pull-requests, Branch-Wechsel, features in Github
-	Erklärt, wie die Historie von Veränderungen im pull-request-Reiter zustande kommt und vergleicht das mit der Sourcetree Darstellung
-	Feature Branch muss in Sourcetree bzw. im Terminal lokal gelöscht werden. Nur weil dieser in Github remote gelöscht wurde, wird der nicht automatisch auch lokal gelöscht.
-	Fetch: holt dir nur die Änderung, Pull: setzt dir auch ein Merge dabei
-	Wir sollen Pull-Request selbst auf Github durchspielen und ausprobieren
-	Fabian zeigt wie man Pull-Requests in Slack unter #reviews speichern kann, damit andere darauf zugreifen und daran arbeiten können. Im Wesentlichen kopiert er die URL der Github-Seite und postet sie bei Slack. Hier: <https://github.com/fabianschmauder/remote-test-repository/pull/1>
-	Es muss ein neuer Branch erzeugt und dort eine Veränderung eingefügt werden, um einen Pull-Request auf Github erzeugen zu können.

## Mac Einführung (Marwin)
-	Finder: wie Windows Explorer. Marwin erklärt, wie man Finder anpasst (Finder -> Prefenrences). Ansicht kann über Reiter oben im Header des Finder-Fensters geändert werden.
-	Dock-Tray: App Leiste (standardmäßig unten am Bildschirm. Position kann verändert werden). Drag&Drop-System zum Erweitern oder Löschen.
-	Kurzbefehle: 
    - `cmd+q` schließt Programm
    - `cmd+c` kopieren 
    - `cmd+x` ausschneiden
    - `cmd+v` einfügen
    - `cmd+t` neuer Tab
    - `cmd+w` Tab/Fenster schließen
    - `cmd+n` neues Fenster (auch im Finder)
    - `cmd+space` öffnen der Spotlight Search
    - `cmd+shift+n` incognito-Fenster
    - `cmd+shift+.` Anzeigen von versteckten Dateien
    - `cmd+tab` Wechsel zwischen Programmen
    - `cmd+shift+3` Screenshot vom ganzen Bild (für Protokoll Umbenennen, in Bilder-Folder laden. Und keine Leerzeichen im Namen!)
    - `cmd+shift+4` Fadenkreuz für Auswahl (Screenshot)
    - `cmd+shift+5` ruft Screenshot/Video-Tools auf
-	`Trackpad Gesten` (unter Einstellungen: App mit Zahnrad-Logo)
    - Mit 3 oder 4 Fingern (je nach Einstellung in: System Preferences -> Trackpad -> More Gestures -> „Mission Control“ oder „App Exposé“) auf Trackpad nach oben streichen: Fenster gehen dann alle auseinander und oben in der Leiste können die Fenster auf andere (freie) Desktops verteilt werden.
-	`Hot Corners` (unter System Preferences -> Mission Control -> Hot Corners)
    - Bestimmte Finger-Gesten/Befehle können in die Bildschirm-Ecken gelegt werden. Wenn man mit der Maus in diese Ecke scrollt, dann löst die Ecke automatisch die definierte Geste/Befehl aus.
-	`Download-Stack` rechts im Dock-Tray
-	`Forced Quit` eines Programmes: `Rechtsklick` auf App-Icon, dann `Opt` auf Tastatur drücken.
-	iCloud für die, die einen Account haben: Ausstellen der Home-Directory für die Syncro mit der Cloud (Empfehlung von Marwin)

## Mac OS vs. Windows
- Thanh fragt, ob Windows als OS für die Programmierung auch möglich wäre. Marwin erklärt, dass das kein Thema sei. Terminal funktioniert jedoch anders (andere Architektur), da Mac und Linux beide auf Unix basieren. Für Windows kann Shell auch über Virtual Machine genutzt werden. 
- Welche Shell unter Windows? Z.B. Z Shell, Power Shell, Git installiert auch eine Shell, etc.

### Pause: 13-14 Uhr

## Einführung IntelliJ Idea Ultima (Fabian)
-	Erklärung Downloadprozess (4 Monate Full-Access mit individuellen Codes)
-	Nach Download einloggen
-	Neues Projekt erzeugen
-	Öffnet sein Beispiel-Repository in IntelliJ
-	Datei .gitignore: ganze Ordner wird nicht getrackt und hochgeladen
-	In .gitignore Ordner bzw. Files eintragen. Diese werden dann nicht mehr getrackt
-	Schrift grün: geadded, aber nicht committed
-	Schrift blau: geadded, aber nicht hinzugefügt/Änderungen an File
-	Alle sollen IntelliJ installieren und ein Test-Repository in .gitignore einfügen, das dann nicht mehr getrackt wird. 

## Protokoll
- Protokoll mit Markdown schreiben. 
- Beispiel an mir selbst: Protokoll aus neuefische-Github-Account in IntelliJ öffnen.
- Links sieht man Markdown-Code des Dokumentes. Rechts das optische Resultat des Dokumentes.
- Es wird kurz erklärt, dass im IntelliJ-Programm-Fenster rechts unten der Reiter für den aktuellen Branch ist und links unten der Reiter für Git (und für den Terminal)

## Task
-	Repository schreiben, Readme-Datei anlegen und mit Markdown Inhaltsbeschreibung erstellen. 
-	Im Branch arbeiten, damit die Master-Datei nicht verändert wird. 
-	Branch-Erzeugung: git branch [Name] -> Branch auswählen: git checkout [branch-name] -> Änderungen committen: git commit -m „[Bezeichnung]“ -> In Github Pull-Request erstellen.
-	Fabian erstellt zusammen mit Sabine angeleitet die Readme-File (IntelliJ, Github).

## Hinweis
-	Empfehlung, Google Chrome als Browser zu nehmen, da mehr Entwickler Tools integriert sind als bei Safari.

## IntelliJ (Ergänzungen zu oben)
-	Fabian erklärt, wie die Consolen-Eingabe(Terminal)/Sourcetree in IntelliJ aufgerufen und eingetragen wird (s. Videos vom 12.05.2020) **Link ?!?**
-	`Log` einzelne Commits können eingesehen werden. 
-	`Rechtsklick` -> `Git` -> `Rollback` (undo changes)
-	`Rechtsklick` -> `Local History` (zeigt Bearbeitungs-Historie an)
-	Unten rechts im Programm-Bildschirm: Branch, auf dem ich mich befinde, wird aufgezeigt
-	Unten links im Programm-Bildschirm: Git- und Terminal-Reiter
-	`Git-Reiter` zeigt quasi die Sourcetree Struktur in IntelliJ
-	`Terminal-Reiter` integrierter Terminal in IntelliJ
-	`cmd+k` Commit Changes
-	`cmd+shift+a` Such-Leiste aufrufen
-	`run-button` links neben Code (grüne Play-Symbole) oder auch oben in Command-Leiste unter `Run`

## Gruppen-Nachrichten in Slack
-	Direct messages 
-	Einzelne Personen hinzufügen -> Dann auf „go“
-	Gruppen-Chat wird geöffnet: alle hinzugefügten Personen nehmen am Chat Teil

## Webapp Architektur
-	Fullstack = Frontend + Backend
-	Intro-Video zu „Wie funktioniert das Internet“
-	Web-Anwendung: Browser sendet request an Backend. Dieses sendet response zurück an Browser. Gleiches Prinzip zwischen Backend&API und Backend&Database.
-	Backend in 4 Programmiersprachen möglich: node.js (JavaScript), Java, C#, Go, C++, Python
-	Frontend: Browser (lokal)
-	Backend, API, Database: Server (remote)

### Kurzer Exkurs zu Programmiersprachen und deren Unterschiede, Vor- und Nachteile, etc.

## Einstieg Java
-	Geschichte zu Java (Sun -> Oracle)
-	1995 aus C++ entstanden
-	Java code -> wird kompiliert (Compiler)/in Byte-Code umgeschrieben -> Byte-Code (.class-Datei) kann universal auf sämtlichen Plattformen mittels Java-Virtual-Machine (JVM) ausgeführt werden und wird dort in maschinenlesbaren Code überführt.
-	Installation: über brew -> `brew cask install java`
-   Befehl `check` überprüft Java-Version
-	Entwicklungsumgebungen für Java: IntelliJ, Eclipse, Visual Studio Code
-	Erstes Java-Programm „Hello World“ in IntelliJ
-	Programm-Einstieg: `main-Methode` public static void main(String[] args){ … }
-   Ausgabe aus der Konsole: `System.out.printl()`
-   Programm laufen lassen: `javac [class-name].java` -> `java [class-name]`
-	Java wird über javac compiler in byte-code überführt.

## Task
-	Erstes Java Programm „Hallo Kurs!” in IntelliJ selbst aufsetzen. 
-	In Repository (Github) hochladen.

## Sonstiges (Links in Slack, etc.)
- Kurs-Videos vom 12.05.2020: <???>
- Open any app on Mac: <https://www.imore.com/how-open-apps-anywhere-macos-catalina-and-mojave>
    - Aktiviert die Option Installationen aus allen Quellen zulassen unter System Preferences -> Security & Privacy -> General 
- How to delete remote branches in Git: <https://www.educative.io/edpresso/how-to-delete-remote-branches-in-git>
- Markdown Cheatsheet: <https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet>
- Kommunikation in Projekten: <https://medium.com/@danielfeelfine/commit-verbs-101-why-i-like-to-use-this-and-why-you-should-also-like-it-d3ed2689ef70>

### 18:00 – Ende Week1 Day2

