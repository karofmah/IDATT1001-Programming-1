import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;

/**
 * Class CovidRegister
 * @author 22090291517
 * @version 1.01 2021.12.15
 * @see CovidInformation
 * @see Client
 */
public class CovidRegister {
    /**
     * Utilizes ArrayList because it has much more built in methods than fixed array.
     *
     */
    private ArrayList<CovidInformation> register;

    /**
     * Creates constructor for CovidRegister
     * Here a new list is constructed
     */
    public CovidRegister() {
        register=new ArrayList();
    }

    /**
     * Adds Covid registration at the end of a day to the Covid Register
     * @param date the date of the Covid registration, can not be empty
     * @param country the country of the Covid registration, can not be empty
     * @param infected the number of infected in the Covid registration, must be a positive integer
     * @param deaths the number of infected in the Covid registration, must be a positive integer
     * @return boolean based on whether the information/registration/object is already in the register
     */
    public boolean addToRegister(String date, String country, int infected, int deaths){
        CovidInformation info=new CovidInformation(date, country, infected, deaths);
        if(register.contains(info)){
            return false;
        }
        return register.add(info);
    }

    /**
     *
     * @param date the date of the Covid registration, can not be empty
     * @return info the information/registration/object that alligns
     * with the requirements given in the if-statement
     * @return null if info is not returned due to it not meeting the requirements
     */
    public CovidInformation searchForInfo(String date){
        ArrayList infoList=new ArrayList();
        LocalDate date_1=LocalDate.parse(date);
        for (CovidInformation info : register){
            if(info.getDate().equals(date_1)){
                return info;
            }
        }
        return null;
    }

    /**
     *Searches for the information/registrations after a specific date
     * @param date the date of the Covid registration, can not be empty
     * @return searchForInfo as an ArrayList that
     * contains the information after a specific date
     */
    public ArrayList searchforInfoAfterDate(String date){
        ArrayList searchForInfo=new ArrayList();
        LocalDate date_1=LocalDate.parse(date);
        for (CovidInformation info : register){
            if(info.getDate().isAfter(date_1)){
                searchForInfo.add(new CovidInformation(info));

          }
        }
        return searchForInfo;
    }

    /**
     * toString-Method
     * @return register as a String
     * It is also worth to mention that is a built in method, hence @Override
     */
    @Override
    public String toString() {
        return "CovidRegister{" +
                "register=" + register +
                '}';
    }

    /**
     * Find number of Covid registrations
     * @return int that represents the size of the register,
     * and therefore the number of Covid registrations
     */
    public int numberOfRegistrations(){
        return register.size();
    }

    /**
     * Calculates the number of deaths in a country
     * @param country the country of the Covid registration, can not be empty
     * @return numberOfDeathsCounty as an int
     */
    public int numberOfDeathsCountry(String country){
        int numberOfDeathsCountry=0;
        for (CovidInformation info : register){
            if(info.getCountry().equals(country.trim().toUpperCase())){
                numberOfDeathsCountry+=info.getDeaths();
            }
        }
        return numberOfDeathsCountry;
    }

    /**
     * Calculates the total number of deaths
     * @return numberOfDeaths as an int
     */
    public int numberOfDeaths(){
        int numberOfDeaths=0;
        for (CovidInformation info : register){
            numberOfDeaths+=info.getDeaths();
        }
        return numberOfDeaths;
    }
}



