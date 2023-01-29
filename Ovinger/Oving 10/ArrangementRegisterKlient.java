import static javax.swing.JOptionPane.*;
public class ArrangementRegisterKlient {
    public static void main(String[] args) {
        //Lager et arrangementregister
        ArrangementRegister register = new ArrangementRegister();
        int choice = YES_OPTION;
        //do-while som sørger for et menystyrt program ved bruk av switch
        do{
            String operationRead = showInputDialog("1:Registrer nytt arrangement\n2: Finn alle arrangementer på et gitt sted\n3: Finn alle arrangementer på en gitt dato\n4: Finne alle arrangementer innenfor et tidsintervall\n5: Sortere register etter sted\n6: Sortere register etter type\n7: Sortere register etter tidspunkt");
            int operation = Integer.parseInt(operationRead);
        switch (operation) {

            case 1:
                String newNumberRead = showInputDialog("Nummer: ");
                int newNumber = Integer.parseInt(newNumberRead);
                String newPlace = showInputDialog("Sted: ");
                String newHost = showInputDialog("Arrangør: ");
                String newType = showInputDialog("Type");
                String newTimeRead = showInputDialog("Tidspunkt:");
                long newTime = Long.parseLong(newTimeRead);
                register.registerNewArrangement(newNumber, newPlace, newHost, newType, newTime);
                System.out.println(register.toString());
                break;

            case 2:
                String findPlace = showInputDialog("Sted som skal finnes: ");
                System.out.println(register.findSpecificArrPlace(findPlace));
                break;

            case 3:
                String findDateRead = showInputDialog("Dato som skal finnes: ");
                int findDate = Integer.parseInt(findDateRead);
                System.out.println(register.findSpecificArrDate(findDate));
                break;

            case 4:
                String startDateRead = showInputDialog("Start Dato: ");
                int startDate = Integer.parseInt(startDateRead);
                String endDateRead = showInputDialog("Slutt Dato: ");
                int endDate = Integer.parseInt(endDateRead);
                System.out.println(register.findSpecificArrDateInterval(startDate, endDate));
                break;

            case 5:
                System.out.println(register.listSortedByPlace());
                break;

            case 6:
                System.out.println(register.listSortedByType());
                break;

            case 7:
                System.out.println(register.listSortedByTime());
                break;
        }
    choice = showConfirmDialog(null, "Ønsker du å fortsette programmet?", "ArrangementRegister", YES_NO_OPTION);
    }while(choice==YES_OPTION);
        }

}
