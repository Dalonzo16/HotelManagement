import java.util.Scanner;
/**
 * This is the staff menu 
 * @author Devon Alonzo
 * @date 2023-11-09 19:46:59
 */
public class StaffMenu extends InitialLogin
{
    private byte option;
    private byte classification;

    /**
     * This is the constructor for the StaffMenu class
     */
    public StaffMenu()
    {
        option = 0;
        classification = 1;
    }
    /**
     * This method displays the rooms menu
     * @param hotel
     */
    public void option1(Hotel hotel)
    {
        RoomsMenu roomsMenu = new RoomsMenu();
        roomsMenu.displayMenu(hotel, classification);
    }
    /**
     * This method logs the user out and takes them back to the initial login menu
     */
    public void option2(Hotel hotel)
    {
        InitialLogin initialLogin = new InitialLogin();
        initialLogin.displayMenu(hotel);
    }
    /**
     * This method displays the menu for the staff
     * @param hotel
     */
    public void displayMenu(Hotel hotel)
    {
        while(true)
        {
            Scanner in = new Scanner(System.in);
            System.out.printf("%nWhat do you want to access?%n(1) Rooms%n(2) Logout%n(3) Exit%n");
            option = in.nextByte();
            switch (option) // switch statement for menu options
            {
                case 1: option1(hotel);  break; // rooms menu option
                case 2: option2(hotel);  break; // logout option
                case 5: System.out.println("Bye..."); // quit option
                        System.exit(0);
                                    break;
                default:System.out.println("Please select a valid option.\n");
            }
        }
    }
}