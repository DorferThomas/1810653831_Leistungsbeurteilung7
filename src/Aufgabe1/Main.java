package Aufgabe1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //Aufgabe1:

        //Die Methode zifferPrüfen wird ausgeführt.
        zifferPrüfen();
    }
    public static void zifferPrüfen()
    {
        //eine Variable eingabe erstellt, die zum schluss der Methode in die Konsole übergeben wird.
        int eingabe = 0;

        //Try catch block erstellt.
        //Im Try block wird die zu prüfende Funktion eingegeben, wie hir die zuweißung der eingabe.(Mit JOptionPane)

        try {
         eingabe = Integer.parseInt(JOptionPane.showInputDialog(null,"Geben Sie eine Ziffer ein!"));
        }

        //Mit dem Catch block wirde der Try Block auf die Exception was man haben will überprüft. (hier NumberFormatException)
        //Falls die Eingabe des Users richtig ist wird die letzte Zeile ausgeführt /sout
        //Falls die Eingabe des Users falsch ist, wird die Methode wiederholt.
        catch (NumberFormatException  e)
        {
            System.err.println("Die eingegebene Zahl war keine Ziffer!");
            zifferPrüfen();
        }
        System.out.println("Die vom Nutzter eingegebene Zahl lautet: " + eingabe);;
    }
}
