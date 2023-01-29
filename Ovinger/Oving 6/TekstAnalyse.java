package Oving_6;

import java.util.Arrays;

public class TekstAnalyse {
  private int[] antallTegn = new int[30];
  
  
  public TekstAnalyse(String tekst) { //Lager Konstruktør med tekst som argument
    tekst=tekst.toLowerCase();//Teksten forekommer som små bokstaver
    int tegn;//Lager variabel

   
    
    for (int i = 0; i < tekst.length(); i++) {//For-løkke som sørger for at programmet går gjennom teksten og fyller tabellen 
      tegn = tekst.charAt(i);//Variabelen blir definert som det tegnet som gjelder for gjeldende indeks i teksten
      if (tegn >= 97 && tegn <=122) {//Hvis tegnet er fra a-z (tallene er tatt fra unicode), blir 1 lagt til tabellen i posisjonen som gjelder
        antallTegn[tegn - 97]++;
      } else if (tegn == 248) {//Hvis tegnet er Æ,Ø eller Å, blir 1 lagt til tabellen i posisjon som gjelder
        antallTegn[26]++;
      } else if (tegn ==230) {
        antallTegn[27]++;
      } else if (tegn == 229) {
        antallTegn[28]++;
      } else {//Hvis tegnet ikke er en bokstav, blir 1 lagt til tabellen i posisjon 29
        antallTegn[29]++;
      }
    }
    System.out.println(Arrays.toString(antallTegn));//Tabellen blir presentert 
  }
  
  public int getAntallForskjelligeBokstaver() { //Lager metode for å finne ut antall forskjellige bokstaver
    int antallForskjelligeBokstaver=0;//Setter variabelen lik 0 (start)
    for (int i = 0; i < antallTegn.length; i++) {//Lager for-løkke osm skal gå gjennom tabellen, og legger til 1 for hver plass i tabellen dersom tegnet eksisterer
      if (antallTegn[i] != 0) {
        antallForskjelligeBokstaver++;
      }
    }
    return antallForskjelligeBokstaver;//Returnerer antall forskjellige bokstaver
  }

  public int getAntallBokstaver() {//Lager metode for å finne antall bokstaver
    int antallBokstaver = 0;//Setter variabelen lik 0 (start)
    for (int i = 0; i < antallTegn.length-1; i++) {//For-løkke som går gjennom tabellen, og legger til antallet som står på hver plass i tabellen
      antallBokstaver += antallTegn[i];
    }
    return antallBokstaver;//Returnerer antall bosktaver
  }
  
  public int getAntallIkkeBokstaver() {//Lager metode for å finne antall ikke-bokstaver i prosent
    
    int antallIkkeBokstaver = antallTegn[29];//Definerer en variabel og setter den lik posisjonen i tabellen som teller antall ikke-bokstaver
    int antallIkkeBokstaverProsent = (antallIkkeBokstaver * 100) / (antallTegn[29] + getAntallBokstaver());//Regner ut hvor mange prosent som ikke er bokstaver i teksten
    return antallIkkeBokstaverProsent;//Returnerer antall ikke-bokstaver i prosent
  }
  
  public int getAntallBestemtBokstav(String bokstav) {//Lager metode for å finne antall av en bestemt bokstav, som har en bokstav som argument
    int bestemtBokstav = bokstav.charAt(0);//Definerer en variabel og setter den lik det første tegnet
    if (bestemtBokstav >= 97 && bestemtBokstav <= 122) {
      bestemtBokstav -= 97;
    } else if (bestemtBokstav == 248){//
      bestemtBokstav = 26;
    } else if (bestemtBokstav == 230 ) {
      bestemtBokstav = 27;
    } else if (bestemtBokstav == 229) {
      bestemtBokstav = 28;
    }
    return antallTegn[bestemtBokstav];
  }
  
  public char getOftest() { //Lager metode for å finne hvilket tegn som forekommer oftest
    char oftest=' ';
    int maks = 0;
    for (int i = 0; i < antallTegn.length-1; i++) {//For-løkke som går gjennom tabellen og setter maks lik antallet av en bokstav hvis bokstaven forekommer sjeldnere enn maks 
      if (antallTegn[i] > maks) {
        maks = antallTegn[i];
      }
    }
    int flestAv=97;
    for (int i = 0; i < antallTegn.length - 1; i++) {//For-løkke som går gjennom tabellen og legger til 97 hvis den forrige for-løkken er ferdig og antallet bokstaver er lik maks 
      if (antallTegn[i] == maks) {

       oftest=(char)(i+flestAv);
        
    
    }
  
}
    return oftest;//Returnerer hvilken bokstav som forekommer oftest
  }
}
