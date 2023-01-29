
import static javax.swing.JOptionPane.*;
/**
 * LongJumpGUI
 * @author 10046 (projectfile has wrong number as its name)
 * @version 1.01 2021.12.16
 * @see LongJumpRegister
 * @see LongJumpResult
 * LongJumpGUI is where the user can interact with the program
 * the set-up of the client/class is from NTNU (Trondheim)
 * that is why there are no methods for start() and
 * getMenu().
 * There is also both an EXIT option and a YES_NO_OPTION, which was already implemented
 * Therefore i didnt want to change this, but the EXIT-function is the one
 * that is naturally/primarily used.
 * The reason for all this is to spare time.
 */

    public class LongJumpGUI {
    /**
     * The main where the GUi is ran
     * @param args
     */
        public static void main(String[] args) {
            String VERSION = "v1.0-SNAPSHOT";

            String[] menuItems
                    = {
                    "1. Register a long jump result",
                    "2. List all results",
                    "3. Show all results by a given athlete",
                    "4. Show the best result",
                    "5. Calculate the avarage result",
                    "6. Exit"
            };

            final int ADD_RESULT = 0;
            final int LIST_ALL_RESULTS = 1;
            final int SHOW_RESULT_BY_ATHLETE = 2;
            final int SHOW_BEST_RESULT = 3;
            final int CALCULATE_AVERAGE_RESULT = 4;
            final int EXIT = 5;

            /**
             * Menu selection that is depending on YES_NO_OPTION,
             * where the user can decide whether to continue with the program or not
             */
            int menuSelection = showOptionDialog(null, "Long Jump Competition \nSelect", "Exam des 2021", YES_NO_OPTION, INFORMATION_MESSAGE, null, menuItems, menuItems[0]);
            LongJumpRegister results=new LongJumpRegister();
            /**
             * While-loop while the EXIT-option is not chosen
             * Below there are different cases in the switch operation with different functions
             * the name of the function can be observed
             */
            while (menuSelection != EXIT) {
                switch (menuSelection) {
                    case ADD_RESULT:
                        System.out.println("You selected the ADD_RESULT");
                        String startNumberString=showInputDialog("Please enter the start number of the athlete: ");
                        int startnumber=Integer.parseInt(startNumberString);
                        String nameOfAthlete=showInputDialog("Please enter the name of the athlete ");
                        while(nameOfAthlete.isBlank()) {
                            nameOfAthlete=showInputDialog("The name of the athlete can not be blank, please try again");
                        }
                        String resultLengthString=showInputDialog("Please enter the result (meter) of the long jump: ");
                        double resultLength=Double.parseDouble(resultLengthString);
                        String validString=showInputDialog("Please enter whether the long jump is valid or not (write True or False):");
                        boolean valid=Boolean.parseBoolean(validString);
                        String time=showInputDialog("Please enter the time duration of the long jump (hours:minutes:seconds): ");
                        if(results.addNewResult(startnumber,nameOfAthlete,resultLength,valid,time)){
                            System.out.println("Result has been successfully added");
                        }
                        break;

                    case LIST_ALL_RESULTS:
                        System.out.println("You selected the LIST_ALL_RESULTS");
                        System.out.println(results.toString());
                        break;

                    case SHOW_RESULT_BY_ATHLETE:
                        System.out.println("TEST: You selected the SHOW_RESULT_BY_ATHLETE");
                        String startNumberString_1=showInputDialog("Please enter the start number of the athlete: ");
                        int startnumber_1=Integer.parseInt(startNumberString_1);
                        String nameOfAthlete_1=showInputDialog("Please enter the name of the athlete ");
                        while(nameOfAthlete_1.isBlank()) {
                            nameOfAthlete_1=showInputDialog("The name of the athlete can not be blank, please try again");
                        }
                        System.out.println(results.showResultFromAthlete(startnumber_1,nameOfAthlete_1));
                        break;

                    case SHOW_BEST_RESULT:
                        System.out.println("You selected the SHOW_BEST_RESULT");
                        System.out.println(results.showBestResult());
                        break;

                    case CALCULATE_AVERAGE_RESULT:
                        System.out.println("You selected the CALCULATE_AVERAGE_RESULT");
                        System.out.println(results.findAverageJump() + " meters");
                        break;

                    case EXIT:
                        System.out.println("\nThank you for using the Long Jump Application "
                                + VERSION + ". Bye!\n");
                        break;

                    default:
                        System.out.println(
                                "\nERROR: Please provide a number between 1 and " + menuItems.length + "..\n");
                }
                menuSelection = showOptionDialog(null, "Long Jump Competition \nSelect", "Exam des 2021", YES_NO_OPTION, INFORMATION_MESSAGE, null, menuItems, menuItems[0]);
            }
        }
    }



