package Oving_6;
import java.util.*;

public class RandomTabell {
    public static void main(String[] args) {

    Scanner in=new Scanner(System.in);
    System.out.println("Hvor mange ganger skal et tilfeldig tall hentes ut?");
    int antallGanger=in.nextInt();
    in.close();
    java.util.Random random=new java.util.Random();//Lager tilfeldighetsgenerator
    int[]antall=new int[10];//Lager en tabell med 10 verdier

    for(int i=0;i<antallGanger;i++){
        int tall=random.nextInt(10);//Genererer et tilfeldig tall i intervallet [0,9]
        antall[tall]++;//Lagt til 1 i indeksen i tabellen som tilsvarer det tilfeldige tallet 
    }
    System.out.println(Arrays.toString(antall));//Presenterer tabellen
    }
}
