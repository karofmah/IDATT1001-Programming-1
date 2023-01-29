/**Programmet skriver ut en del av multiplikasjonstabellen (leser inn fra brukeren) */
import java.util.Scanner;
class Oving_3_Oppgave_1_inndata {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Tall (start): ");
        int number_1 = in.nextInt();
        System.out.println("Tall (slutt): ");
        int number_2=in.nextInt();
        
        System.out.println("Multiplikasjonstabellen fra " + number_1 + " til " + number_2 + ": ");
        int factor=1;
        System.out.println(number_1 + " gangen: \n");
        do{
            System.out.println(number_1 + " x " + factor +" = " + number_1*factor);
            factor++;
            while(number_2>number_1 && factor>10){
                factor=1;
                number_1++;
                System.out.println(number_1 + " gangen : \n");
                in.close();
            
            } 
         
        }  while(number_1<=number_2 && factor<=10);
        }
    }

    
