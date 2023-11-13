import java.util.Scanner;

/**
 *This is the ReportsMenu another child class of Menu
 * @author Devon Alonzo
 * @date 11-8-2023
 */
public class ReportsMenu extends InitialLogin
{
    private byte option;

    /**
     * Constructor for objects of class ReportsMenu
     */
    public ReportsMenu()
    {
        option = 0;
    }
    /**
     * this method calls the printHotelEconomics method from the hotel class
     */
    public void option1(Hotel hotel)
    {
        
        hotel.printHotelEconomics();
    }
    /**
     * This method takes the manager back to the main menu
     * @param hotel
     */ 
    public void option2(Hotel hotel)
    {
        ManagerMenu managerMenu = new ManagerMenu();
        managerMenu.displayMenu(hotel);
    }
    /**
     * This method takes the user back to the initial login menu
     * @param hotel
     */
    public void option3(Hotel hotel)
    {
        InitialLogin initialLogin = new InitialLogin();
        initialLogin.displayMenu(hotel);
    }
    /**
     * This method displays the reports menu
     * @param hotel
     */
    public void displayMenu(Hotel hotel)
    {
        while(true)
        {
            Scanner in = new Scanner(System.in);
            System.out.printf("%nWhat do you want to do?%n(1) Show hotel income%n(2) Main menu%n(3) Logout%n(4) Exit%n");
            option = in.nextByte();
            switch (option)
            {
                case 1: option1(hotel);  break; //show hotel economics
                case 2: option2(hotel);  break; //go back to main menu
                case 3: option3(hotel);  break; //logout
                case 4: System.out.println("Bye..."); //exit
                        System.exit(0);
                                    break;
                default:System.out.println("Please select a valid option.");
            }
        }
    }
}
