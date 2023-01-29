import java.util.*;
import java.lang.*;

public class ArrangementRegister {
    private ArrayList<Arrangement> register;

//Lager konstruktør
    public ArrangementRegister() {
        register = new ArrayList<Arrangement>();

    }
//Metode for å lage nytt arrangement
    public void registerNewArrangement(int newNumber, String newplace, String newHost, String newType, long newTime) {
        Arrangement arrangement_1 = new Arrangement(newNumber, newplace, newHost, newType, newTime);
        register.add(arrangement_1);
    }
//Metode for å finne alle arrangementer på et gitt sted
    public ArrayList findSpecificArrPlace(String specificPlace) {
        ArrayList<Arrangement> arrSpecificPlace = new ArrayList<>();
        for (int i = 0; i < register.size(); i++) {
            if (register.get(i).getPlace().equals(specificPlace)) {
                arrSpecificPlace.add(register.get(i));
            }

        }
        return arrSpecificPlace;

    }

//Metode for å finne alle arrangement på en gitt dato
    public ArrayList findSpecificArrDate(int newDate) {
        ArrayList<Arrangement> arrSpecificDate = new ArrayList<>();
        for (int i = 0; i < register.size(); i++) {
            long arrangementDate = register.get(i).getTime() / 10000;
            if (arrangementDate==newDate) {
                arrSpecificDate.add(register.get(i));
            }
        }
        return arrSpecificDate;


    }
    //Metode for å finne alle arrangementer innenfor et tidsintervall gitt ved to datoer
    public ArrayList findSpecificArrDateInterval(int startDate, int endDate) {
        ArrayList<Arrangement> arrSpecificDateInterval = new ArrayList<>();

        for (int i = 0; i < register.size(); i++) {
            long arrangementDate = register.get(i).getTime() / 10000;
            if (arrangementDate > startDate && arrangementDate < endDate) {
                arrSpecificDateInterval.add(register.get(i));
            }
        }
        ArrayList<Arrangement> listSorted = new ArrayList<Arrangement>(arrSpecificDateInterval);
        listSorted.sort(Comparator.comparing(Arrangement::getTime));
        return listSorted;

    }
    //Metoder sortert etter sted, type og tid
    public ArrayList listSortedByPlace(){
        ArrayList<Arrangement> listSorted=new ArrayList<Arrangement>(register);
        listSorted.sort(Comparator.comparing(Arrangement::getPlace));

        return listSorted;

    }

    public ArrayList listSortedByType(){
        ArrayList<Arrangement> listSorted=new ArrayList<Arrangement>(register);
        listSorted.sort(Comparator.comparing(Arrangement::getType));

        return listSorted;
    }
    public ArrayList listSortedByTime(){
        ArrayList<Arrangement> listSorted=new ArrayList<Arrangement>(register);
        listSorted.sort(Comparator.comparing(Arrangement::getTime));

        return listSorted;
    }
    //Lager toString-Metode
    public String toString() {
        return "ArrangementRegister{" +
                "register=" + register +
                '}';
    }

}