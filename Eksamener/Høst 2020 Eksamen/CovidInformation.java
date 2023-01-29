import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Objects;

/**
 * Class CovidInformation
 * @author 22090291517
 * @version 1.01 2021.12.15
 * @see CovidRegister
 * @see Client
 */

public class CovidInformation {
    private LocalDate date;
    private String country;
    private int infected;
    private int deaths;
   // private String dateString;
    /**
     * Create a constructor for CovidInformation
     * @param date the date of the Covid registration, can not be empty
     * @param country the country of the Covid registration, can not be empty
     * @param infected the number of infected in the Covid registration, must be a positive integer
     * @param deaths the number of daeths in the Covied registration, must be a positive integer
     * @throws IllegalArgumentException
     */
    public CovidInformation(String dateString, String country, int infected, int deaths) throws IllegalArgumentException{
        this.date = date=LocalDate.parse(dateString);
        if(country.isBlank() || dateString.isBlank()) throw new IllegalArgumentException("Country or date cannot be empty");
        this.country = country.trim().toUpperCase();
        if(infected<0 || infected<0) throw new IllegalArgumentException("Number of infected and deaths must be a positive integer");
        this.infected = infected;
        this.deaths = deaths;
    }

    /**
     * Create a constructor for CovidInformation
     * @param Object the object with the parameters described above
     */
    public CovidInformation(CovidInformation Object){
        this.date=Object.getDate();
        this.country=Object.getCountry();
        this.infected=Object.getInfected();
        this.deaths=Object.getDeaths();
    }

    /**
     * Get date
     * @return date as LocalDate
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * Get country
     * @return counry as a String
     */

    public String getCountry() {
        return country;
    }

    /**
     *Get infected
     * @return infected as an int
     */
    public int getInfected() {
        return infected;
    }

    /**
     * get deaths
     * @return deaths as an int
     */
    public int getDeaths() {
        return deaths;
    }

    /**
     * Compare one object with another
     * @param o the object is compared to
     * @return boolean based on if the date and country is identical compared to the other object.
     * Only date and country are compared are significant because they are enough to
     * identify an object
     * It is also worth to mention that is a built in method, hence @Override
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CovidInformation that = (CovidInformation) o;
        return date.equals(that.date) && country.equals(that.country);
    }

    /**
     * toString-Method
     * @return date, country, infected, deaths as Strings
     * For readabilty/simplcity, there is also added \n to gain better overview
     * It is also worth to mention that is a built in method, hence @Override
     */
    @Override
    public String toString() {
        return "CovidInformation{" +
                "date=" + date +
                ", country='" + country + '\'' +
                ", infected=" + infected +
                ", deaths=" + deaths +
                '}' + "\n";
    }
}
    /**
     * No set-methods are implemented because
     * the information is changed throughotu the day
     * Therefore it would not be logical
     * to not register the Covid information at the end of the day.
     * Hence all the information is consant.
     */



