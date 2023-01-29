/**Programmet leser in et bestemt årstall og bestemmer om dette er et skuddår */
import static javax.swing.JOptionPane.*;

class Oving_2_Oppgave_1 {
    public static void main(String[] args) {
    String årLest=showInputDialog("År");
    int år=Integer.parseInt(årLest);

    if(((år%4)==0 && (år%100!=0))||((år%400)==0)){   
        System.out.println(år + " er skuddår");
    }
    else {
        System.out.println(år + " er ikke skuddår");
    }
}
}


