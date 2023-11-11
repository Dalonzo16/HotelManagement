
import java.util.Map;
import java.util.Scanner;
/**
 * This is the ManagerMenu class another child class of Menu
 * @author Devon Alonzo
 * @date 2023-11-09 20:06:42
 */
public class ManagerMenu
{
    private byte option;
    private byte classification = 3;

    public void option1(Hotel hotel)
    {
        GuestsMenu guestsMenu = new GuestsMenu();
        guestsMenu.displayMenu(hotel, classification);
    }

    public void option2(Hotel hotel)
    {
        RoomsMenu roomsMenu = new RoomsMenu();
        roomsMenu.displayMenu(hotel, classification);
    }
    
    public void option3(Hotel hotel)
    {
        ReservationMenu reservationsMenu = new ReservationMenu();
        reservationsMenu.displayMenu(hotel, classification);
    }
    public void option4(Hotel hotel)
    {
        EmployeesMenu employeeMenu = new EmployeesMenu();
        employeeMenu.displayMenu(hotel);
    }
    public void option5(Hotel hotel)
    {
        ReportsMenu reportsMenu = new ReportsMenu();
        reportsMenu.displayMenu(hotel);
    }
    public void option6(Hotel hotel)
    {
        InitialLogin initialLogin = new InitialLogin();
        initialLogin.displayMenu(hotel);
    }

    public void displayMenu(Hotel hotel)
    {
        while(true)
        {
            Scanner in = new Scanner(System.in);
            System.out.printf("%nSelect one of the options accordingly to your position:%n(1) Receptionist %n(2) General Staff %n(3) Manager %n(4) Quit %n");
            option = in.nextByte();
            switch (option)
            {
                case 1: option1(hotel);  break;
                case 2: option2(hotel);  break;
                case 3: option3(hotel);  break;
                case 4: option4(hotel);  break;
                case 5: option5(hotel);  break;
                case 6: option6(hotel);  break;
                case 7: System.out.println("Bye...");
                        System.exit(0);
                                    break;
                default:System.out.println("Please select a valid option.");
            }
        }
    }
}
