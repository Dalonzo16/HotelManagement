
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
    private byte classification;

    /**
     * This is the constructor for the ManagerMenu class
     */
    public ManagerMenu()
    {
        option = 0;
        classification = 3;
    }
    /**
     * This method displays the guests menu
     * @param hotel
     */
    public void option1(Hotel hotel)
    {
        GuestsMenu guestsMenu = new GuestsMenu();
        guestsMenu.displayMenu(hotel, classification);
    }
    /**
     * This method displays the rooms menu
     * @param hotel
     */
    public void option2(Hotel hotel)
    {
        RoomsMenu roomsMenu = new RoomsMenu();
        roomsMenu.displayMenu(hotel, classification);
    }
    /**
     * This method displays the reservations menu
     * @param hotel
     */
    public void option3(Hotel hotel)
    {
        ReservationMenu reservationsMenu = new ReservationMenu();
        reservationsMenu.displayMenu(hotel, classification);
    }
    /**
     * This method displays the employees menu
     * @param hotel
     */
    public void option4(Hotel hotel)
    {
        EmployeesMenu employeeMenu = new EmployeesMenu();
        employeeMenu.displayMenu(hotel);
    }
    /**
     * This method displays the reports menu
     * @param hotel
     */
    public void option5(Hotel hotel)
    {
        ReportsMenu reportsMenu = new ReportsMenu();
        reportsMenu.displayMenu(hotel);
    }
    /**
     * This method logs the user out and takes them back to the initial login menu
     */
    public void option6(Hotel hotel)
    {
        InitialLogin initialLogin = new InitialLogin();
        initialLogin.displayMenu(hotel);
    }
    /**
     * This method displays the menu for the manager
     * @param hotel
     */
    public void displayMenu(Hotel hotel)
    {
        while(true)
        {
            Scanner in = new Scanner(System.in);
            System.out.printf("%nWhat would you like to access?%n(1) Guests menu%n(2) Rooms menu %n(3) Reservations menu %n(4) Employees menu%n(5) Reports menu%n(6) Logout%n(7) Exit%n");
            option = in.nextByte();
            switch (option) // switch statement for the different menu options defined above
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
