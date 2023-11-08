import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Devon
 */
public class Menu {
    
    private byte userSelection;
    private byte quitOption;
    
    public Menu(){
        this.quitOption = 6;
    }
    
    public void displayMenu(){
        Scanner in = new Scanner(System.in);
        System.out.println("=============================================================================");
        System.out.println("|   Welcome to Hotel Mangement. Please select one of the following options  |");
        System.out.println("=============================================================================\n");
        System.out.println("=====================");
        System.out.println("| 1. Guests         |");
        System.out.println("| 2. Rooms          |");
        System.out.println("| 3. Reservations   |");
        System.out.println("| 4. Employees      |");
        System.out.println("| 5. Reports        |");
        System.out.println("| 6. Quit           |");
        System.out.println("=====================");
        this.userSelection = in.nextByte();
    }
    public void checkInput(ArrayList<Room> rooms, ArrayList<Employee> managers){
        switch(userSelection){
            case 1:
                GuestsMenu option1 = new GuestsMenu();
                do{
                    option1.displayMenu();
                    option1.checkInput();
                }while(option1.getUserSelection() != 7);
            break;
            case 2:
                RoomsMenu option2 = new RoomsMenu();
                do{
                    option2.displayMenu();
                    option2.checkInput(rooms);
                }while(option2.getUserSelection() != 3);
            break;
            case 3:
                ReservationMenu option3 = new ReservationMenu();
                do{
                    option3.displayMenu();
                    option3.checkInput();
                }while(option3.getUserSelection() != 5);
                
            case 4:
                EmployeesMenu option4= new EmployeesMenu();
                ManagerLogin manager = new ManagerLogin();
                do{
                    manager.displayLogin();
                    manager.checkManagerCredentials(managers);
                }while(!manager.isValid());
                do{
                    option4.displayMenu();
                    option4.checkInput();
                }while(option4.getUserSelection() != 5);
            break;
            case 5:
                ReportsMenu option5 = new ReportsMenu();
                do{
                    option5.displayMenu();
                    option5.checkInput();
                }while(option5.getUserSelection() != 2);
        }
    }
    
    public byte getUserSelection(){
        return userSelection;
    }

    public byte getQuitOption() {
        return quitOption;
    }
    
    
}
    
