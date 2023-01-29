public class OppgaveKlient {
    public static void main(String[] args) {
        Oppgaveoversikt oversikt=new Oppgaveoversikt(0);
        oversikt.registrerNyStudent("Karo",8);
        System.out.println(oversikt.antStudRegistrert());
        oversikt.øktAntOppg("Karo",1);
        System.out.println(oversikt.antOppggaver("Karo"));
        System.out.println(oversikt.toString());

    }

}
