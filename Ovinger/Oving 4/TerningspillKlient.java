
public class TerningspillKlient {
    public static void main(String[] args) {
        Terningspill A=new Terningspill("A", 0);//Lager objekt for spiller A
        Terningspill B=new Terningspill("B", 0);//Lager objekt for spiller B
        int Runde=0;
        //While-løkke: Spillet fortsetter så lenge poengsummen til A og/eller B ikke er 100
        while(!(A.erFerdig()||B.erFerdig())){
          
          
                A.kastTerningen();//Spiler A kaster terningen
                System.out.println("Spiller "+ A.getNavn() + " : " + A.getSumPoeng() + " Poeng");//Poengsummen til spiller A blir presentert
                B.kastTerningen();//Spiller B kaster terningen
                System.out.println("Spiller "+ B.getNavn() + " : " + B.getSumPoeng() +" Poeng");//Poengsummen til spiller B blir presentert
                Runde++;//1 runde blir lagt til og presentert
                System.out.println("Runde " + Runde);
                
        }if(A.getSumPoeng()>B.getSumPoeng()){//Hvis poengsummen til spiller A er 100, og høyere en poengsummen til B, avslutter spillet og spiller A vinner

            System.out.println("Spillet er ferdig, spiller A vant");
            
        }else if (B.getSumPoeng()>A.getSumPoeng()){//Hvis poengsummen til spiller B er 100, og høyere en poengsummen til A, avslutter spillet og spiller B vinner
        System.out.println("Spillet er ferdig, spiller B vant");
    }
        else{//Hvis poengsummen til spiller A og B er 100, avslutter spillet og det blir uavgjort
            System.out.println("Spillet er ferdig, det ble uavgjort");
        }
            
        }
    }
    

        
    

