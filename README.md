# Stack und Palindrom

In dieser Übung implementieren wir die Datenstruktur _Stack_ (siehe Interface `CharStack`), und verwenden sie anschließend um Strings auf Palindrome zu prüfen.


## Vorarbeiten

1. Erstellen Sie wieder einen persönlichen Fork des Projekts.

2. Klonen Sie das Projekt lokal, in dem Sie in IntelliJ das Projekt von Git importieren lassen, oder "per Hand" in der Konsole: `git clone htps://github.com/IHR_BENUTZERNAME/example.git`

3. Erstellen Sie einen lokalen Branch `loesung` (oder einem anderen Namen Ihrer Wahl), entweder in IntelliJ (Git Schaltfläche rechts unten -> "+ New Branch") oder in der Konsole (Schaltfläche links unten: "Console"/"Konsole") `git checkout -b loesung`


## Teilaufgabe 1

4. Vervollständigen Sie die Klasse `CharStackImpl` in dem Sie die `push`, `pop` und `size` Methoden implementieren
	- `push` legt ein Element oben auf den Stack, `pop` entfernt das oberste; der Stack ist also FILO -- _first in-last out_.
	- Denken Sie auch an die benötigte Hilfsklasse um die Elemente zu modellieren.
	- Verifizieren Sie, dass der Test `CharStackTest` fehlerfrei abläuft.

5. Fügen Sie die geänderte Datei `CharStackImpl.java` sowie die Hilfsklasse Ihrem Commit hinzu, im IntelliJ mit Rechtsklick -> Git -> Add, oder in der Konsole mit `git add src/main/java/ueb01/CharStackImpl.java`

6. Committen und pushen Sie die Änderungen, entweder via VCS -> Commit Changes -> Commit and Push, oder in der Konsole mit
	```
	git commit -m "Ihre Commit-Nachricht"
	git push -u origin loesung
	```

## Teilaufgabe 2

7. Erweitern Sie nun die bestehende Testklasse um eine Testmethode `@Test void testPalindrom()`, in der Sie nun den Stack verwenden, um beliebige Strings auf Palindrome zu testen.
	- Ein String ist ein Palindrom, wenn er vorwärts wie rückwärts die selbst Buchstabenfolge hat, also in der Mitte "gespiegelt" ist.
		Wie kann dazu der Stack verwendet werden?
	- Die Methode `String.replaceAll` kann verwendet werden, um alle Leerzeichen zu entfernen.
	- Die Methode `String.toLowerCase` (bzw. `toUpperCase`) wandelt alle Zeichen in Klein- bzw. Großbuchstaben um
	- Die Methode `String.toCharArray` gibt den String als Array von `char` zurück.


> Hinweis: Die kommenden Aufgaben werden Git immer in der selben Art verwenden.
> Gewöhnen Sie sich diesen Workflow an, wir werden ihn in den weiteren Übungsangaben nicht erneut ausformulieren.


## Teilaufgabe 3 (optional)

Mergen Sie nun Ihren Branch `loesung` in den `master` Branch.

1. Checken Sie den `master` Branch aus
2. Mergen Sie `loesung`
3. Pushen Sie nun alles in Ihr Github Repository.
4. Verifizieren Sie auf Github, dass Ihre Änderungen alle übernommen und dokumentiert sind.
