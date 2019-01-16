package Aufgabe4;

import javax.swing.*;

public class Main {
    public static void main(String[] args) throws MeineEigeneException {
        //Zwei Zahlen werden vom User übergeben
        int eingabe1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Geben Sie eine Zahl ein: "));
        int eingabe2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Geben Sie eine Zahl ein: "));
        //Im Try Block wird die Methode berechnungDivision aufgerufen und mittels des catch Blcokes auf meine erstellte Exception geprüft.
        try {
            System.out.println(berechnungDivision(eingabe1,eingabe2));
        }catch (MeineEigeneException e)
        {
            //e.toString damit wir eine schöne Fehlermeldung haben.
            System.out.println(e.toString());
        }
    }

        public static int berechnungDivision(double a,double b) throws MeineEigeneException {
        /*Die übergebenen Parameter werden Dividiert und anschließend in der if-schleife geprüft ob das
        Erbebnis eine Ganze Zahl ist oder nicht. Ist Sie eine Ganze Zahl wird "c" übergeben.
        Ansonsten wird meine eigene Exception geworfen.
           */
        int c = (int) (a/b);
        double d = a/b;
        //
        if (c!=d)
        {
            throw new MeineEigeneException("Das Ergebnis ist keine Ganze Zahl!");
        }
        return c;
    }
}
