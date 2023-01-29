import java.util.Arrays;

public class Oppgaveoversikt {
    private Student[] studenter;
    private int antStud=0;

    public Oppgaveoversikt(int antStud){
        this.antStud=antStud;
        studenter=new Student[antStud];

    }
    public String antStudRegistrert(){
        return "Antall studenter registrert: " + antStud;
    }
    public String antOppggaver(String navn){
        int antOppgaver=0;
        for(int i=0;i<studenter.length;i++) {
            if (studenter[i].getNavn().equals(navn)) {
                antOppgaver = studenter[i].getAntOppg();
            }
        }
        return "Antall oppgaver " + "(" + navn + ")" + ": " + antOppgaver;
    }
    public void registrerNyStudent(String navn,int antOppg){
        Student student_1=new Student(navn, antOppg);
        Student [] studenter_1=new Student[++antStud];
        studenter_1[antStud - 1] = student_1;
        for(int i=0;i<studenter.length;i++) {
            studenter_1[i]=studenter[i];
        }
        studenter=studenter_1;
        if(antStud<=0){
            throw new NegativeArraySizeException("Ingen studenter lagt til i tabellen");
        }
    }
    public void øktAntOppg(String navn,int økning){
        for(int i=0;i<studenter.length;i++){
            if(studenter[i].getNavn().equals(navn)) {
                int økAntOppg = studenter[i].økAntOppg(økning);
            }
        }
    }
    public String toString() {
        return "Oppgaveoversikt{" +
                "studenter=" + Arrays.toString(studenter) +
                ", antStud=" + antStud +
                '}';
    }
}
