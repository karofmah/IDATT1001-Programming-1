package Oving_5;

import java.util.*;

public class MinRandom {//Lager tilfeldighetsgenerator 
    private Random tall;

    public MinRandom(){//Lager konstruktør
        tall= new java.util.Random();
    }

    public int nesteHeltall(int nedre, int ovre){ //Lager metode for tilfeldig heltall
        int nesteHeltall=tall.nextInt(ovre-nedre)+ nedre;
        return nesteHeltall;
    }


    public double nesteDesimaltall(double nedre, double ovre){//Lager metode for tilfeldig desimaltall
        double nesteDesimaltall=tall.nextDouble()*(ovre-nedre) + nedre;
        return nesteDesimaltall;

    }

}
class MinRandomKlient{
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);//Lager Scanner
    System.out.println("1:Heltall\n2:Desimaltall");//Presenterer valg mellom heltall og desimaltall
    int velgTall=in.nextInt();//Bestemmer om man vil finne et heltall eller desimaltall

    switch(velgTall){
        case 1://Dersom tallet 1 skrives inn og heltall bestemmes, skal man skrive inn nedre grense(heltall) og øvre grense(desimaltall) for det endelige tilfeldige tallet som blir presentert
            MinRandom heltall=new MinRandom();//Lager objekt for desimaltall
            System.out.println("Nedre grense: ");
            int nedre=in.nextInt();
            System.out.println("Øvre grense: ");
            int ovre=in.nextInt();
            int endeligTall=heltall.nesteHeltall(nedre,ovre);
            in.close();
            System.out.println("Endelig tall: " + endeligTall);//Presenter det endelige tilfeldige heltallet
            break;
        case 2://Dersom tallet 2 skrives inn og desimaltall bestemmes, skal man skrive inn nedre grense (desimaltall) og øvre grense(desimaltall) for det endelige tilfeldige tallet som blir presentert
            MinRandom desimaltall=new MinRandom();//Lager objekt for desimaltall
            System.out.println("Nedre grense: ");
            double nedre_2=in.nextDouble();
            System.out.println("Øvre grense: ");
            double ovre_2=in.nextDouble();
            double endeligTall_2=desimaltall.nesteDesimaltall(nedre_2,ovre_2);
            in.close();
            System.out.println("Endelig tall: " + endeligTall_2);//Presenter det endelige tilfeldige desimaltallet
            break;
    }

}}