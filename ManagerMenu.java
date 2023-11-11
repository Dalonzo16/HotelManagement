import java.util.Scanner;
/**
 * This is the ManagerMenu class another child class of Menu
 * @author Devon Alonzo
 * @date 2023-11-09 20:06:42
 */
public class ManagerMenu extends Menu {

    private byte userSelection;

    @Override
    public void displayMenu(){
        Scanner in = new Scanner(System.in);
        System.out.println("=========================");
        System.out.println("| 1. Guests             |");
        System.out.println("| 2. Rooms              |");
        System.out.println("| 3. Reservations       |");
        System.out.println("| 4. Employees          |");
        System.out.println("| 5. Reports            |");
        System.out.println("| 6. Back to Main Menu  |");
        System.out.println("=========================");
        this.userSelection = in.nextByte();
    }
    /**
     * This the checkInput method it checks the users input and then uses a switch case statement
     */
    public void checkInput(Hotel hotel){
        switch(userSelection){
            case 1:
                Menu option1_3 = new GuestsMenu();
                do{
                    option1_3.displayMenu();
                    option1_3.checkInput(hotel);
                }while(option1_3.getUserSelection() != 7);
            break;
            case 2:
                Menu option2_3 = new RoomsMenu();
                do{
                    option2_3.displayMenu();
                    option2_3.checkInput(hotel);
                }while(option2_3.getUserSelection() != 3);
            break;
            case 3:
                Menu option3_3 = new ReservationMenu();
                do{
                    option3_3.displayMenu();
                    option3_3.checkInput(hotel);
                }while(option3_3.getUserSelection() != 5);
            break;
            case 4:
                Menu option4_3 = new EmployeesMenu();
                do{
                    option4_3.displayMenu();
                    option4_3.checkInput(hotel);
                }while(option4_3.getUserSelection() != 5);
            break;
            case 5:
                Menu option5_3 = new ReportsMenu();
                do{
                    option5_3.displayMenu();
                    option5_3.checkInput(hotel);
                }while(option5_3.getUserSelection() != 2);


        }
    }
    /**
     * This method gets the users selection
     * @return the users selection
     */
    public byte getUserSelection(){
        return userSelection;
    }

}
