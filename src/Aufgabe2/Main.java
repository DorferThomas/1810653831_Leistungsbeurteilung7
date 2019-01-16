package Aufgabe2;
import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String eingabe = JOptionPane.showInputDialog("Geben Sie Ihre E-Mail Adresse ein: ");//Meine E-mail: t.dorfer.td@gmail.com
        try {
            checkEmail(eingabe);
            System.out.println("Die E-Mail lautet: " + eingabe);
        } catch (Exception e){
            System.out.println("Die Eingabe war ungültig!");
        }
    }

    //Eine Methode checkEmail erstellt, die überprüft, ob es sich beim übergebenen String um eine E-mail Adresse handelt.
    public static void checkEmail (String email) throws Exception{
        // der Patter interpretiert die Reihenfolge, in welche der übergebene String mittels "Matcher" überprüft werden soll.
        //hier zum beistpiel, ob es sich um eine E-Mail Adresse handelt.
        //[\\w|-] bedeutet das alle zeichen vor dem nachstehendem @ erlaubt sind
        //nach dem @ sind wieder alle zeichen bis zum "." erlaubt sind.
        //nach dem "." sind nur noch Buchstaben von "a-z" erlaubt und max. 3 stk.
        Pattern pattern = Pattern.compile( "[\\w|-]+@[\\w|-]*\\.[a-z]{2,3}" );
        //Mit dem Matcher wird nun geprüft ob alle eingaben korrekt waren.
        //ist dies der Fall, spring man in den IF-Block in welchem mittels looking.At() ein Boolischer Wert zurückgegeben wird.
        //anhand welcher Boolischer Wert herauskommt, schmeist man eine Exception zurück oder die Methode ist fertig.
        Matcher matcher = pattern.matcher(email);
        if(!matcher.find()){
            throw new Exception();
        }
    }
}
