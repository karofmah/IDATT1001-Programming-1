package Oving_6;

import static javax.swing.JOptionPane.*;

public class TekstAnalyseKlient {
    public static void main(String[] args) {
    int choice=YES_OPTION;
    do{
        
    String tekst=showInputDialog("Skriv tekst");
    TekstAnalyse tekstInput=new TekstAnalyse(tekst);
    String bokstav=showInputDialog("Skriv bokstav");
    System.out.println(tekst);
    System.out.println("Antall forskjellige bokstaver: " + tekstInput.getAntallForskjelligeBokstaver());
    System.out.println("Antall bokstaver: " + tekstInput.getAntallBokstaver());
    System.out.println("Antall " + bokstav + ": " + tekstInput.getAntallBestemtBokstav(bokstav));
    System.out.println("Antall ikke-bokstaver(%): " + tekstInput.getAntallIkkeBokstaver()+ "%");
    System.out.println("Bokstav(er) som forekommer oftest: "+ tekstInput.getOftest());
    


choice = showConfirmDialog(null, "Ønsker du å fortsette programmet?", "Tekst", YES_NO_OPTION);//Spør brukeren om den vil fortsette programmet (starte loop på nytt)
                           
    }while(choice==YES_OPTION);


   
    }
}