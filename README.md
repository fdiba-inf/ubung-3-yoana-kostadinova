# Übung 3
Quellcode der Vorlesung: https://github.com/fdiba-inf/vorlesung
## Repl.it öffnen
Klicken Sie die Taste _"Work in Repl.it"_.
## Aufgabe 1. Nummernzähler
Erstellen Sie eine neue Klasse mit dem Namen _NumberCounter_ im Paket _exercise3_. 
Beim Starten soll die Applikation eine unbestimmte Anzahl von Ganzzahlen bearbeiten. 
Das Programm bestimmt, wie viele positive und negative Werte gelesen wurden und berechnet die Summe und den Durchschnitt der Eingabewerte. 
Es endet, wenn _0_ eingegeben wird.
Zeigen Sie die Summe und den Durchschnitt als Fließkommazahlen an. 
Benutzen Sie eine while-Schleife.
``` 
Positive numbers: <value>
Negative numbers: <value>
Sum: <value>
Average: <value>
``` 
## Aufgabe 2. Primzahl
Erstellen Sie eine neue Klasse mit dem Namen _PrimeNumber_ im Paket _exercise3_.
Beim Starten soll der Benutzer eine Zahl _n (n > 2)_ in der Konsole eingeben.
Dann wird bestimmt, ob die Zahl eine Primzahl ist.
Benutzen Sie eine while-Schleife.
``` 
Prime number: <true/false>
``` 
## Aufgabe 3. Nummernsuche
Erstellen Sie eine neue Klasse mit dem Namen _NumberSearch_ im Paket _exercise3_. 
Das Programm zeigt alle Zahlen von _100_ bis _1000_, die durch _fünf_ und _sechs_ teilbar sind. 
Die Zahlen werden _zehn_ pro Zeile ausgegeben und durch genau ein Leerzeichen getrennt.
Benutzen Sie eine for-Schleife.
``` 
120 150 180 210 240 270 300 330 360 390
420 450 480 510 540 570 600 630 660 690
720 750 780 810 840 870 900 930 960 990
``` 
## Aufgabe 4. Name
Erstellen Sie eine neue Klasse mit dem Namen _NamePrinter_ im Paket _exercise3_.
Beim Starten soll der Benutzer einen Namen (Text) in der Konsole eingeben. 
Dann wird jeder Buchstabe des Namens auf eine neue Zeile ausgegeben. Benutzen Sie eine for-Schleife.
z.B. Eingabe: _FDIBA_
``` 
* F *
* D *
* I *
* B *
* A *
``` 
## Aufgabe 5. Winkelabmessung
Erstellen Sie eine neue Klasse mit dem Namen _AngleCalculation_ im Paket _exercise3_ zur Umrechnung zwischen Radiant (_r_) und Grad (_d_) von mehreren Winkeln. 
Der Wert des Winkels und seine Einheit (_r_ oder _d_) werden eingegeben. 
Die Berechnung wird nach der Formel _Radiant = Grad * π / 180_ ausgeführt. 
Das Programm wird bei inkorrekter Eingabe der Einheit unterbrochen. 
Benutzen Sie eine do-while-Schleife.
``` 
Angle: <value><r/d>
``` 
## Aufgabe 6. Dreieck
Erstellen Sie eine neue Klasse mit dem Namen _Triangle_ im Paket _exercise3_ zur Bearbeitung von einem Dreieck. 
Das Dreieck wird mit seinen drei Seiten angegeben: _a_, _b_ und _c_. 
Das Programm soll prüfen, ob die angegebenen Werte korrekt sind: _a_, _b_ und _c_ sind positiv, die Summe jeder zwei Seiten ist größer als die dritte Seite. 
Wenn die angegebenen Werte korrekt sind, wird die Fläche berechnet und der Typ des Dreiecks (gleichseitig (_equilateral_), gleichschenklig (_isosceles_), ungleichseitig (_scalene_)) bestimmt.
Wenn die angegebenen Werte nicht korrekt sind, wird _"Values are not correct!"_ ausgegeben.
Organisieren Sie eine do-while-Schleife, um ein neues Dreieck zu analysieren. 
Die Schleife wird unterbrochen, wenn _0_ oder ein Minuswert für _a_, _b_ oder _c_ eingegeben wird.
![Triangle Area](https://github.com/fdiba-inf/vorlesung/raw/master/images/exercise3/area.jpg)
``` 
Area: <value>
Triangle: <equilateral/isosceles/scalene>
``` 
## Achtung! Achtung! Achtung!
Wenn Sie alle Aufgaben gemacht haben, sollen Sie die Lösungen in _GitHub_ hochladen. 
Wenn "Version Control" nicht verfügbar ist, geben Sie die folgenden Befehle in die Konsole ein:
``` 
git pull
git add .
git commit -m "Some message"
git push
``` 
