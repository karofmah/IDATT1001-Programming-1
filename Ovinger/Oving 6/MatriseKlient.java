package Oving_6;

import java.util.*;

public class MatriseKlient {
public static void main(String[] args) {

var matrise1=new Matrise(3,3);//Lager nytt objekt der antall rader og kolonner er 3, noe som tilsvarer en todimensjonal matrise/tabell

matrise1.makeMatrise();//Lager første matrisen ved å bruke metoden makeMatrise()

var matrise2=new Matrise(3,3);//Lager nytt objekt der antall rader og kolonner er 3, noe som tilsvarer en todimensjonal matrise/tabell

matrise2.makeMatrise();//Lage andre matrisen ved å bruke metoden makeMatrise()
//Presenterer de to matrisene 
System.out.println(Arrays.deepToString(matrise1.getMatrise()));

System.out.println(Arrays.deepToString(matrise2.getMatrise()));
//Presenterer produktet etter de ulike regneoperasjonene
System.out.println("Multiplisert: " + Arrays.deepToString(matrise1.multiMatrise(matrise2)));
       
System.out.println("Addert: " + Arrays.deepToString(matrise1.addMatrise(matrise2)));
       
System.out.println("Transponert 1: " + Arrays.deepToString(matrise1.transMatrise()));
        
System.out.println("Transponert 2: " + Arrays.deepToString(matrise2.transMatrise()));
}

}


