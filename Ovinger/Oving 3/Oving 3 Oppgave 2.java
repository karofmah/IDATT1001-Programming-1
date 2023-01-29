/**Programmet finner ut om et tall er primtall eller ikke */
import static javax.swing.JOptionPane.*;
class Oving_3_Oppgave_2 {
    public static void main(String[] args) {
        String tallstring=showInputDialog("Skriv tall, avslutt med Esc");
        

        while(tallstring!=null){
        int tall = Integer.parseInt(tallstring);
        boolean flag=false;

        
        if(tall==0||tall==1){
            System.out.println(tall + " er ikke et primtall");
            tallstring=showInputDialog("skriv tall, avsutt med Esc");
        }else{
                for(int i=2; i<=tall/2;i++){
                    if(tall%i==0){
                        System.out.println(tall + " er ikke et primtall");
                        flag=true;
                        tallstring=showInputDialog("skriv tall, avsutt med Esc");
                        break;
            }
            
                }
            
                if(flag==false){
                System.out.println(tall + " er et primtall");
                tallstring=showInputDialog("skriv tall, avsutt med Esc");
                
                
                
            }       
        }
        }
    }}
        
        
    
