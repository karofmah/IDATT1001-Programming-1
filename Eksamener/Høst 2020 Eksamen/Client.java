import java.util.Locale;
import java.util.Scanner;

/**
 * Client
 * @author 22090291517
 *  @version 1.01 2021.12.15
 * @see CovidInformation
 * @see CovidRegister
 */
public class Client {
    /**
            * Presents the menu for the user, and awaits input from the user. The menu
* choice selected by the user is being returned.
            *
            * @return the menu choice by the user as a positive number starting from 1.
            * If 0 is returned, the user has entered a wrong value
*/
    private int getMenuChoice()
    {
        int menuChoice = 0;
        System.out.println("\n***** Covid Statistics Application v0.1 *****\n");
        System.out.println("1. Add a COVID-19 entry");
        System.out.println("2. List all COVID-19 entries");
        System.out.println("3. Find COVID-19 entry by date");
        System.out.println("4. Find all entries after date");
        System.out.println("5. Show the total deaths for a country");
        System.out.println("6. Show the total deaths");
        System.out.println("7. Show number of entries");
        System.out.println("8. Exit program");
        System.out.println("\nPlease enter a number between 1 and 8.\n");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            menuChoice = sc.nextInt();
        } else {
            System.out.println("You must enter a number, not text");
        }
        return menuChoice;
    }
    /**
     * Starts the application. This is the main loop of the application,
     * presenting the menu, retrieving the selected menu choice from the user,
     * and executing the selected functionality.
     */
    public void start() {
        boolean finished = false;
        CovidRegister register=new CovidRegister();
// The while-loop will run as long as the user has not selected
// to quit the application
        while (!finished) {
            int menuChoice = getMenuChoice();
            Scanner sc =new Scanner(System.in);

            switch (menuChoice)
            {
                case ADD_COVID_ENTRY_TO_REGISTER:
                    System.out.println("Please enter the date of the covid entry:");
                    String date=sc.nextLine();
                    while(date.isBlank()){
                        System.out.println("the date can not be blank, please try again");
                        date= sc.nextLine();
                    }
                    System.out.println("Please enter the country of the covid entry");
                    String country=sc.nextLine();
                    while(date.isBlank()){
                        System.out.println("");
                    }
                    System.out.println("Please enter the number of infected:");
                    int infected=sc.nextInt();
                    while(infected<0){
                        System.out.println("Number of infected must be 0 or higher, please try again");
                        infected= sc.nextInt();
                    }
                    System.out.println("Please enter the number" +
                            " of deaths:\n");
                    int deaths=sc.nextInt();
                    while(infected<0){
                        System.out.println("Number of deaths must be 0 or higher, please try again");
                        deaths= sc.nextInt();
                    }
                    if(register.addToRegister(date,country,infected,deaths));
                    System.out.println("Entry has been successfully added.");
                    break;
                case LIST_ALL_COVID_ENTRIES:
                    System.out.println(register.toString());
                    break;
                case FIND_COVID_ENTRY_BY_DATE:
                    System.out.println("Please enter the date of the covid entry:");
                    String date_1=sc.nextLine();
                    System.out.println(register.searchForInfo(date_1));

                    break;
                case FIND_COVID_ENTRY_AFTER_DATE:
                    System.out.println("Please enter the date before the covid entries:");
                    String date_2=sc.nextLine();
                    System.out.println(register.searchforInfoAfterDate(date_2));
                    break;

                case CALCULATE_TOTAL_DEATHS_IN_COUNTRY:
                    System.out.println("Please enter the country youw want to find the number of deaths in: ");
                    String country_1=sc.nextLine();
                    System.out.println(register.numberOfDeathsCountry(country_1)+ " deaths in "+ country_1);
                    break;

                case CALCULATE_TOTAL_DEATHS:
                    System.out.println(register.numberOfDeaths() + " deaths");
                    break;
                case CALCULATE_NUMBER_OF_ENTRIES:
                    System.out.println(register.numberOfRegistrations() + " covid entries" );
                    break;
                case EXIT_PORGRAM:
                    finished=true;
                    System.out.println("Thanks for using CovidRegister Application!");
                    break;
                default:
                    System.out.println("Unrecognized menu selected..");
                    break;
            }
        }
    }

    // Constants representing the different menu choices
    private static final int ADD_COVID_ENTRY_TO_REGISTER = 1;
    private static final int LIST_ALL_COVID_ENTRIES = 2;
    private static final int FIND_COVID_ENTRY_BY_DATE = 3;
    private static final int FIND_COVID_ENTRY_AFTER_DATE = 4;
    private static final int CALCULATE_TOTAL_DEATHS_IN_COUNTRY =5;
    private static final int CALCULATE_TOTAL_DEATHS = 6;
    private static final int CALCULATE_NUMBER_OF_ENTRIES=7;
    private static final int EXIT_PORGRAM=8;

    public static void main(String[] args) {
        Client client=new Client();
        client.start();

        while(true){
            client.getMenuChoice();
        }
    }
}
