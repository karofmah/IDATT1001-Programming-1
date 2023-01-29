import static java.lang.String.*;
import java.lang.*;
import java.util.Locale;

public class NyString {
    private String tekst;
    public NyString(String tekst){//Lager konstruktør med tekst som argument
        this.tekst=tekst.toLowerCase();
        String[] ord;

    }
    public String getAbbreviated() {//Lager metode for å forkorte teksten
        String[] ord = tekst.split(" ");//Lager tabell som inneholder ordene som teksten består av

        String nyTekst=" ";//Definerer en variabel
        for (int i =0; i <ord.length; i++) {//For løkke som sørger for å legge til forbokstaven i hver ord
            nyTekst+=ord[i].charAt(0);//til variabelen som har blitt definert (nyTekst)
        }
        return nyTekst;//Returnerer teksten etter å ha blitt forkortet
    }
    public String getRemoved(String bokstav){//Lager metode for å fjerne en bokstav (argument) fra teksten
        String nyTekst=" ";//Definerer en variabel
        nyTekst+= tekst.replace(bokstav,"");//Erstatter bokstaven med ingenting(fjerner bokstaven)
        return nyTekst;//Returnerer teksten etter å ha mistet den bestemte bokstaven
    }
    }
