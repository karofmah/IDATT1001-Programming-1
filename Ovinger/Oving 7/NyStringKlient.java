import static javax.swing.JOptionPane.*;
import java.util.*;
public class NyStringKlient {

    public static void main(String[] args) {//Brukeren kan skrive inn tekst og bokstaven som skal fjernes
        String tekst=showInputDialog("Skriv tekst");
        NyString tekstInput=new NyString(tekst);
        System.out.println("Tekst forkortet: " + tekstInput.getAbbreviated());
        String bokstav=showInputDialog("Skriv bokstav som skal fjernes");
        System.out.println("Bokstav fjernet: " + tekstInput.getRemoved(bokstav));
}}
