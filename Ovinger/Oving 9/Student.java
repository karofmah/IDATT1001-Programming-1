public class Student {
    private final String navn;
    private int antOppg;
    public Student(String navn, int antOppg){
        this.navn=navn;
        this.antOppg=antOppg;
    }

    public String getNavn() {

        return navn;
    }

    public int getAntOppg() {

        return antOppg;
    }
    public int økAntOppg(int økning){
        antOppg+=økning;
        return antOppg;
    }

    public String toString() {
        return "Student{" +
                "navn='" + navn + '\'' +
                ", antOppg=" + antOppg +
                '}';
    }
}
