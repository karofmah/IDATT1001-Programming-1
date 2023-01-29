package Oving_5;

import java.util.Scanner;

public class Brokregning {
   private int teller;//Lager objektbariabler
   private int nevner;

   public Brokregning(int teller, int nevner){//Lager konstruktør, og kast unntaksobjekt av typen IllegalArgumentException
       if(nevner==0){
           throw new IllegalArgumentException("Brøken kan ikke ha 0 som nevner");
       }
       this.teller=teller;
       this.nevner=nevner;
   }
   public Brokregning(int teller){//Lager konstruktør der kun argument for telleren blir mottatt
       this.teller = teller;
       this.nevner=1;
   }
   public int getTeller(){//Metode for å returnere telleren
       return teller;

   }
   public int getNevner(){//Metode for å returnere nevner
       return nevner;
   }
   public void multi(Brokregning brøkB) {//Metode for å gange en brøk med en annen brøk(brøkB/objekt)
       teller*=brøkB.getTeller();
       nevner*=brøkB.getNevner();

   }
   public void div(Brokregning brøkB){//Metode for å dele en brøk med en annen brøk(BrøkB/objekt)
    teller*=brøkB.getNevner();
    nevner*=brøkB.getTeller();
   }
   public void add(Brokregning brøkB){//Metode for å legge sammen en brøk med en annen brøk(BrøkB/objekt)
    teller*=brøkB.getNevner();
       if(nevner==brøkB.getNevner()){
           teller+=brøkB.getTeller();
           
           
       }else{
           teller=(teller*brøkB.getNevner())+(nevner*brøkB.getTeller());
           nevner*=brøkB.getNevner();
       }

   }
   public void sub(Brokregning brøkB){//Metode for å trekke en brøk fra en annen brøk(BrøkB/objekt)
    teller*=brøkB.getNevner();
        if(nevner==brøkB.getNevner()){
        teller-=brøkB.getTeller();
        
        
        }else{
        teller=(teller*brøkB.getNevner())-(nevner*brøkB.getTeller());
        nevner*=brøkB.getNevner();
    }
}
        //for(int i=0;i<nevner;i++){
            //if(nevner%i==0){
                //nevner/=i;
            
            //}
       // }
       // for(int i=0;i<teller;i++){
         //   if(teller%i==0){
          //      teller/=i;
           // }
      //  }
        
        
   
   
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);//Lager Scanner
    System.out.println("'1' som nevner:\nIkke 1: Nei\n1: Ja");//Presenterer meny for å velge mellom nevner lik eller ulik 1 (som default)
    int Èn_eller_ikke=in.nextInt();//Skrive inn 1 for å ha nevner lik 1, og 2 for å ikke ha nevner lik 1 (som default)
    if(Èn_eller_ikke==1){//Hvis man har skrevet 1, skal man bestemme teller for to ulike brøker (brøkA og brøkB)
        System.out.println("Brøk A:\nTeller: ");
        int teller=in.nextInt();
        Brokregning brøkA=new Brokregning(teller);
        System.out.println("Brøk B:\nTeller: ");
        int teller_2=in.nextInt();
        Brokregning brøkB=new Brokregning(teller_2);
        System.out.println("1: Multiplikasjon\n2: Divisjon\n3: Addisjon\n4: Subtraksjon ");//Presenterer meny for regneoperasjon
        int Regneoperasjon=in.nextInt();//Bestemmer regneoperasjon
        in.close();
    

        switch (Regneoperasjon){
            case 1://Utfører multiplikasjon dersom tallet 1 skrives inn (regneoperasjon==1)
                brøkA.multi(brøkB);
                System.out.println("Teller: " + brøkA.getTeller());
                System.out.println("Nevner: " + brøkA.getNevner());
            break;
            case 2://Utfører divisjon dersom tallet 2 skrives inn (regneoperasjon==2)
                brøkA.div(brøkB);
                System.out.println("Teller: " + brøkA.getTeller());
                System.out.println("Nevner: " + brøkA.getNevner());
            break;
            case 3://Utfører addisjon dersom tallet 3 skrives inn (regneoperasjon==3)
                brøkA.add(brøkB);
                System.out.println("Teller: " + brøkA.getTeller());
                System.out.println("Nevner: " + brøkA.getNevner());
            break;
            case 4://Utfører subtraksjon dersom tallet 4 skrives inn (regneoperasjon==4)
                brøkA.sub(brøkB);
                System.out.println("Teller: " + brøkA.getTeller());
                System.out.println("Nevner: " + brøkA.getNevner());
            break;
        } }else{//Hvis et annet tall enn 1 skrives inn når man skal bestemme om nevneren er 1 (Èn_eller_ikke!=1), 

    System.out.println("Brøk A:\nTeller: ");//Hvis man har skrevet 1, skal man bestemme teller for to ulike brøker (brøkA og brøkB)
    int teller=in.nextInt();
    System.out.println("Brøk_A\nNevner: ");
    int nevner=in.nextInt();
    Brokregning brøkA=new Brokregning(teller,nevner);
    System.out.println("Brøk B:\nTeller: ");
    int teller_2=in.nextInt();
    System.out.println("Brøk_B\nNevner: ");
    int nevner_2=in.nextInt();
    Brokregning brøkB=new Brokregning(teller_2,nevner_2);
    System.out.println("1: Multiplikasjon\n2: Divisjon\n3: Addisjon\n4: Subtraksjon ");//Presenterer meny for operasjon
    int Regneoperasjon=in.nextInt();//Bestemmer regneoperasjon
    in.close();

    switch (Regneoperasjon){
        case 1://Utfører multiplikasjon dersom tallet 1 skrives inn (regneoperasjon==1)
            brøkA.multi(brøkB);
            System.out.println("Teller: " + brøkA.getTeller());
            System.out.println("Nevner: " + brøkA.getNevner());
        break;
        case 2://Utfører multiplikasjon dersom tallet 2 skrives inn (regneoperasjon==2)
            brøkA.div(brøkB);
            System.out.println("Teller: " + brøkA.getTeller());
            System.out.println("Nevner: " + brøkA.getNevner());
        break;
        case 3://Utfører addisjon dersom tallet 3 skrives inn (regneoperasjon==3)
            brøkA.add(brøkB);
            System.out.println("Teller: " + brøkA.getTeller());
            System.out.println("Nevner: " + brøkA.getNevner());
        break;
        case 4://Utfører subtraksjon dersom tallet 4 skrives inn (regneoperasjon==4)
            brøkA.sub(brøkB);
            System.out.println("Teller: " + brøkA.getTeller());
            System.out.println("Nevner: " + brøkA.getNevner());
        break;
    } 
    }
       }
    }

       



