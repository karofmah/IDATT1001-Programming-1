import static javax.swing.JOptionPane.*;
//Programmet tilbyr/utfører ulike operasjoner basert på informasjon om en arbeidstaker
public class ArbTakerKlient {
    public static void main(String[] args) {
        //Testklient for programmet der de ulike operasjonene blir utført
        Person personalia=new Person("Karo","Mahmoud",2002);
        ArbTaker person=new ArbTaker(personalia,213184014,2010,20000,40);
        System.out.println("Navn: " + person.getNavn());
        System.out.println("Alder: " + person.alder() + " år");
        System.out.println("Antall år ansatt: " + person.antallÅrAnsatt() + " år");
        System.out.println("Ansatt i mer enn " + 10 + " år? " + person.merEnnAntallÅr(10));
        System.out.println("Skattetrekk per måned: " + person.skattetrekkPerMåned() + " kr");
        System.out.println("Bruttolønn per år: " + person.bruttolønnPerÅr() + " kr");
        System.out.println("Skattetrekk per år: " + person.skattetrekkPerÅr() + " kr");

        int choice=YES_OPTION;
        do{//do-while løkke for menystyrt program
            //Presenterer meny for brukeren
            String operasjonLest=showInputDialog("1: Navn\n2: Alder\n3:Antall år ansatt i bedriften\n4: Om personen har vært ansatt i bedriften mer enn et gitt antall år\n5:Skattetrekk per måned\n6: Bruttolønn per år\n7: Skattetrekk per år\nBestem operasjon: ");
            int operasjon=Integer.parseInt(operasjonLest);
            switch(operasjon) {
                case 1://Bruker uendret navn og fornavn fra det immutable objektet for å deretter utføre operasjon nummer 1
                    System.out.println("Navn: " + person.getNavn());
                    break;
                case 2://Bruker fødselsår fra det immutable objektet for å deretter utføre operasjon nummer 2
                    System.out.println("Alder: " + person.alder() + " år");
                    break;
                case 3://Bestemmer ansettelsesår for å deretter utføre operasjon nummer 3
                    String ansettelsesårLest=showInputDialog("Ansettelsesår: ");
                    int ansettelsesår=Integer.parseInt(ansettelsesårLest);
                    person.setAnsettelsesår(ansettelsesår);
                    System.out.println("Antall år ansatt: " + person.antallÅrAnsatt() + " år");
                    break;
                case 4://Bestemmer antall år man vil sammenligne med ansettelsesår for å deretter utføre operasjon nummer 4
                    String ansettelsesårLest_1=showInputDialog("Ansettelsesår: ");
                    int ansettelsesår_1=Integer.parseInt(ansettelsesårLest_1);
                    person.setAnsettelsesår(ansettelsesår_1);
                    String antallÅrLest=showInputDialog("Antall år: ");
                    int antallÅr=Integer.parseInt(antallÅrLest);
                    System.out.println("Ansatt i mer enn " + antallÅr + " år? " + person.merEnnAntallÅr(antallÅr));
                    break;
                case 5://Bestemmer månedslønn og skatteprosent for å deretter utføre operasjon nummer 5
                    String månedslønnLest=showInputDialog("Månedslønn: ");
                    int månedslønn=Integer.parseInt(månedslønnLest);
                    person.setMånedslønn(månedslønn);
                    String skatteprosentLest=showInputDialog("Skatteprosent: ");
                    int skatteprosent=Integer.parseInt(skatteprosentLest);
                    person.setSkatteprosent(skatteprosent);
                    System.out.println("Skattetrekk per måned: " + person.skattetrekkPerMåned() + " kr");
                    break;
                case 6://Bestemmer månedslønn for å deretter utføre operasjon nummer 6
                    String månedslønnLest1=showInputDialog("Månedslønn: ");
                    int månedslønn1=Integer.parseInt(månedslønnLest1);
                    person.setMånedslønn(månedslønn1);
                    System.out.println("Bruttolønn per år: " + person.bruttolønnPerÅr() + " kr");
                    break;
                case 7://Bestemmer månedslønn og skatteprosent for å deretter utføre operasjon nummer 7
                    String månedslønnLest2=showInputDialog("Månedslønn: ");
                    int månedslønn2=Integer.parseInt(månedslønnLest2);
                    person.setMånedslønn(månedslønn2);
                    String skatteprosentLest2=showInputDialog("Skatteprosent: ");
                    int skatteprosent2 =Integer.parseInt(skatteprosentLest2);
                    person.setSkatteprosent(skatteprosent2);
                    System.out.println("Skattetrekk per år: " + person.skattetrekkPerÅr() + " kr");
                    break;
            }
            choice = showConfirmDialog(null,"Ønsker du å fortsette programmet?","ArbTaker", YES_NO_OPTION);
        }while(choice==YES_OPTION);//Løkken fortsetter så lenge brukeren ønsker å fortsette programmet
    }
}
