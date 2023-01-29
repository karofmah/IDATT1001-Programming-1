public class Terningspill{

    java.util.Random terning= new java.util.Random();//Lager tilfeldighetsgenerator 
//Lager objektvariabler
    private int sumPoeng;
    private String navn;
    
    public Terningspill(String navn, int sumPoeng){//Lager konstruktør
        this.sumPoeng=sumPoeng;
        this.navn=navn;
    }
    //Lager objektmetoder
    public String getNavn(){
        return navn;
    }
    public int getSumPoeng(){
        return sumPoeng;
    }
    
    public int kastTerningen(){
    int terningkast=terning.nextInt(6)+1;//Metoden gir tiltang på "terningkast" som tislvarer et tall fra 1-6 (0 til 5 +1)
    if((sumPoeng+terningkast)>100){//Hvis summen av poengsummen og terningkast tilsvarer et tall høyere enn 100, vil terningkast heller bli fjernet fra poengsummen
        return sumPoeng-=terningkast;
    }if(terningkast==1){//Hvis terningkast tilsvarer tallet 1 blir poengsummen satt lik 0
        return sumPoeng=0;
}
    else{
        return sumPoeng+=terningkast;//Ellers legges terningkast til poengsummen
       
        }
       

    }
    
    public boolean erFerdig(){
        return sumPoeng==100;
        
    }
    
}