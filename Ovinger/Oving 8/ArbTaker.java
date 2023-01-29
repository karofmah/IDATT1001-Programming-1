public class ArbTaker {
    java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
    private Person personalia;
    private int arbtakernr;
    private int ansettelsesår;
    private int månedslønn;
    private int skatteprosent;

    public ArbTaker(Person personalia, int arbtakernr, int ansettelsesår, int månedslønn, int skatteprosent) {
        this.personalia = new Person(personalia.getFornavn(), personalia.getEtternavn(), personalia.getFødselsår());
        this.arbtakernr = arbtakernr;
        this.ansettelsesår = ansettelsesår;
        this.månedslønn = månedslønn;
        this.skatteprosent = skatteprosent;

    }
    public Person getPersonalia() {

        return personalia;
    }
    public String getNavn() {

        return personalia.getEtternavn() + "," + personalia.getFornavn();
    }
    public int getArbtakernr() {

        return arbtakernr;
    }

    public int getAnsettelsesår() {

        return ansettelsesår;
    }
    public int getMånedslønn() {

        return månedslønn;
    }
    public int getSkatteprosent() {
        return skatteprosent;
    }
    public void setAnsettelsesår(int nyAnsettelsesår) {

        this.ansettelsesår = nyAnsettelsesår;
    }
    public void setMånedslønn(int nyMånedslønn) {

        this.månedslønn = nyMånedslønn;
    }
    public void setSkatteprosent(int skatteprosent) {

        this.skatteprosent = skatteprosent;
    }
    public int alder() {
        int år = kalender.get(java.util.Calendar.YEAR);
        int alder = år - personalia.getFødselsår();

        return alder;
    }

    public int antallÅrAnsatt() {
        int år = kalender.get(java.util.Calendar.YEAR);
        int antallÅrAnsatt = år - ansettelsesår;
        return antallÅrAnsatt;
    }
        public String merEnnAntallÅr(int antallÅr){
            if (antallÅrAnsatt()>antallÅr) {
                return "Ja";
            } else {
                return "Nei";
            }
        }

    public int skattetrekkPerMåned() {
        int skattetrekkPerMåned = (månedslønn * skatteprosent) / 100;
        return skattetrekkPerMåned;
    }
    public int bruttolønnPerÅr(){
        int bruttolønnPerÅr=månedslønn*12;
        return bruttolønnPerÅr;
        }
    public int skattetrekkPerÅr(){
        int skattetrekkPerÅr=(skattetrekkPerMåned()*10)+(skattetrekkPerMåned()/2);
        return skattetrekkPerÅr;
    }
}

