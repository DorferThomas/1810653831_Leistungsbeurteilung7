package Aufgabe5;

import javax.swing.*;
import java.rmi.server.ExportException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        ExceptionRuntimeExceptionunchecked
        Betreffen den Programmierer
        Sind Bugs in dem Programm welche während des Ablaufs des Programms vorkommen und
        Abgefangen werden müssen. (mittels TRY/CATCH) [ArrayOutOfBound]

        Werden schon beim compilieren abgefangen????[Frage an Michael]
         */

        try {
            int a = 10;
            int b = 2;
            System.out.println(a/b);

        }catch (Exception e)
        {
            System.err.println("Durch null dividierren ist nicht erlaubt.");
        }
        try {
            int[] arrayUnchecked = new int[2];
            System.out.println(arrayUnchecked[5]);
        }catch (ArrayIndexOutOfBoundsException f)
        {
            System.err.println("ArrayOutOfBoundsException");
        }

        /*
        Exceptionchecked
	    Der Anwender führt diese herbei, welche mittels TRY/CATCH abgefangen werden müssen.
	    Auswahl einer Datei, auf die der Anwender keinen Zugriff hat.
         */

        try {
            divisionGanzeZahlen();

        }catch (Exception e)
        {
            System.err.println("Die eingegebene Zahl war keine ganze Zahl!!! ");
            divisionGanzeZahlen();
        }

    }
    public static void divisionGanzeZahlen()
    {
        int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Geben sie eine ganze Zahl ein: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null,"Geben sie eine ganze Zahl ein: "));
        int c = a/b;
        System.out.println(c);
    }
}
