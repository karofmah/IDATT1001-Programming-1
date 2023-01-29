/**Programmet leser in et antall sekunder og beregner hvor mange timer, minutter og sekunder dette er */
import static javax.swing.JOptionPane.*;

class Oving_1_Oppgave_3 {
public static void main(String[] args) {
    String secLest=showInputDialog("sekunder");
int sec= Integer.parseInt(secLest);
int min=sec/60;
int hour=sec/3600;
int secrest=sec%60;
int minrest=min%60;
System.out.println(hour + " timer " + minrest + " minutter "  + secrest +" sekunder");
}
}