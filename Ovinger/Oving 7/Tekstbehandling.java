public class Tekstbehandling {
    private String tekst;//Lager objektvariabel

    public Tekstbehandling(String tekst) {//Lager konstruktør med tekst som argument
        this.tekst=tekst;
        String[] ord;
    }
    public String getTekst(){//Lager metode for å få tilgang til teksten

        return tekst;
    }
    public String getTekstUpperCase(){//Lager metode for å returnere teksten med store bokstaver

        return tekst.toUpperCase();
    }
    public int getAntallOrd() {//Lager metode for å finne antall ord i teksten
        String[] ord = tekst.split(" ");//Lager tabell for hvert ord som skilles med mellomrom
        int antallOrd=0;//Lager ny variabel
        for(int i=0;i<ord.length;i++) {//For-løkke som går gjennom tabellen og legger til 1 for hver plass
            antallOrd++;
        }
        return antallOrd;//Returnerer antall ord
    }
    public double getGjennomsnittOrdLengde(){//Lager metode for å finne gjennomsnitten av ordlengde i teksten
        String[] ord = tekst.split(" ");//Lager  tabell for hvert ord som skilles med mellomrom
        double sumOrdLengde=0;//Lager ny variabel
        for(int i=0;i<ord.length;i++){//For-løkke som går gjennom tabellen og legger til antall bokstaver
           sumOrdLengde+=ord[i].length();
        }
        double gjennomsnitt=sumOrdLengde/(double)getAntallOrd();//Deler antall bokstaver på antall ord
        return gjennomsnitt;//Returnerer gjennomsnittet av ordlengde i teksten

   }

   public double getOrdPerPeriode(){//Lager metode for å finen antall ord per periode
        String[] periode=tekst.split("[.!:?]");//Lager tabell som skilles av tegn som begrenser periode
        int ordPerPeriode=0;//Lager ny variabel
        for(int i=0;i<periode.length;i++){//For-løkke som går gjennom tabellen og lager en ny tabell for hver periode
            String [] ord= periode[i].split("[ ]");
            for (int j=0;j<ord.length;j++){//For-løkke som går gjennom tabellen for hvert ord og legger til 1
                if(ord[j].length()>0)//hvis et ord eksisterer i denne plassen
                ordPerPeriode++;
            }
        }
        double gjennomsnitt=(double)ordPerPeriode/periode.length;//Deler antall ord på antall perioder
        return gjennomsnitt;//Returnerer gjennomsnittet antall ord per periode
   }
    public String replaceOrd(String gammelOrd,String nyOrd){//Lager metode for å erstatte et ord med et annet ord

        return tekst.replaceAll(gammelOrd,nyOrd);//Returnerer teksten der et ord har blitt erstattet
    }

}
