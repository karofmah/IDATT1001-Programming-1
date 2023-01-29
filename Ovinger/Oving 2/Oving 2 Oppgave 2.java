/**Programmet bestemmer om kjøttdeig av merke A eller merke B er billigst */
class Oving_2_Oppgave_2 {
    public static void main(String[] args) {
    
    double merke_A=35.90;
    double merke_B=39.50;
    double A_per_gram=merke_A/450;
    double B_per_gram=merke_B/500;

    if(A_per_gram>B_per_gram) {
        System.out.println("Kjøttdeig av merke B er billigst");

    }

    if(A_per_gram<B_per_gram){
        System.out.println("Kjøttdeig av merke A er billigst");
    }
}

}
