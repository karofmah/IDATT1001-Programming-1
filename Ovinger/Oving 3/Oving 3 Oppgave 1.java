/**Programmet skriver ut en del av multiplikasjonstabellen */
class Oving_3_Oppgave_1 {
    public static void main(String[] args) {
        
        int factor=1;
        int number=13;

        System.out.println("Multiplikasjonstabellen fra 13 til 15");
        System.out.println(number + " gangen: \n");
        do{
            System.out.println(number + " x " + factor +" = " + number*factor);
            factor++;
            while(number<15 && factor>10){
                factor=1;
                number++;
                System.out.println(number + " gangen : \n");

                
            }

        
         
        }
        while(number<=15 && factor<=10);
         
        
        
         }
        
            
    }

