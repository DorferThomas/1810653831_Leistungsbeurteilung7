package Aufgabe4;

public class MeineEigeneException extends Exception{
    //Individuelle Checked Exception erstellt:
    //Standart Konstruktor erstellt, welcher den Konstruktor der Oberklasse Exception aufruft. Welcher einen String param. benötigt
    //welcher beim auftreten eines Fehler ausgegeben wird. "super"("hier die Fehlermeldung")
    public MeineEigeneException(){
        super("Meine Fehlermeldung");
    }
    //Hier wird der Fehler mittels des übergebenen Parameter beschrieben der auftritt.
    public MeineEigeneException(String param){
        super(param);
    }
}
