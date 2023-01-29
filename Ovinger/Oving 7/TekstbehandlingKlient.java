import static javax.swing.JOptionPane.showInputDialog;

public class TekstbehandlingKlient {
    public static void main(String[] args) {
        //Brukeren kan skrive inn tekst, ord man vil fjerne og ord man vil legge til
        String tekst=showInputDialog("Skriv tekst");
        Tekstbehandling tekstInput=new Tekstbehandling(tekst);
        System.out.println("Opprinnelig Tekst: " + tekstInput.getTekst());
        System.out.println("Tekst med store bokstaver: " + tekstInput.getTekstUpperCase());
        System.out.println("Antall ord: "+ tekstInput.getAntallOrd());
        System.out.println("Gjennomsnittlig ordlengde: " + tekstInput.getGjennomsnittOrdLengde() + " bokstaver");
        System.out.println("Gjennomsnittlig antall ord per periode: " + tekstInput.getOrdPerPeriode());
        String fjernOrd=showInputDialog("Skriv ord du vil fjerne");
        String leggTilOrd=showInputDialog("Skriv ord du vil legge til: ");
        System.out.println("Tekst etter erstatning: " + tekstInput.replaceOrd(fjernOrd,leggTilOrd));


    }
}
