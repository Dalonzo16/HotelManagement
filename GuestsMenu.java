import java.util.Map;
import java.util.Scanner;
import java.util.Set;
/**
 *This is the GuestsMenu class a child class of Menu
 * @author Devon Alonzo
 * @date 11-8-2023
 */
public class GuestsMenu
{
    private byte option;
    
    /**
     * This is the constructor for the GuestsMenu class
     */
    public GuestsMenu()
    {
        option = 0;
    }
    public void option1(Hotel hotel) //check-in guest
    {
        hotel.checkInGuest();
    }
    public void option2(Hotel hotel) //check-out guest
    {
        hotel.checkOutGuest();
    }
    public void option3(Hotel hotel) // edit guest info
    {
        hotel.editGuestInfo();
    }
    /**
     * This method displays all the guests in the hotel
     * @param guests
     */
    public void option4(Hotel hotel)
    {
        hotel.printAllGuests();
    }
    /**
     * This method takes the employee back to the main menu according to their classification
     * @param hotel
     * @param classification
     */
    public void option5(Hotel hotel, byte classification)
    {
        if(classification == 2)
        {
            ReceptionistMenu receptionistMenu = new ReceptionistMenu();
            receptionistMenu.displayMenu(hotel);
        }
        else
        {
            ManagerMenu managerMenu = new ManagerMenu();
            managerMenu.displayMenu(hotel);
        }
    /**
     * This method logs the user out and takes them back to the initial login menu
     */
    }
    public void option6(Hotel hotel) //logout
    {
        InitialLogin initialLogin = new InitialLogin();
        initialLogin.displayMenu(hotel);
    }
    /**
     * This method displays the guests menu
     * @param hotel
     * @param classification
     */
    public void displayMenu(Hotel hotel, byte classification)  //display menu
    { 
        while(true)
        {
            Scanner in = new Scanner(System.in);
            System.out.printf("%nWhat do you want to do?%n(1) Check-in guest %n(2) Check-out guest %n(3) Edit guest info %n(4) View all guests%n(5) Back to main menu%n(6) Logout%n(7) Quit%n");
            option = in.nextByte();
            switch (option) // switch statement for the different menu options defined above
            {
                case 1: option1(hotel);  break; //check-in guest
                case 2: option2(hotel);  break; //check-out guest
                case 3: option3(hotel);  break; //edit guest info
                case 4: option4(hotel);  break; //view all guests
                case 5: option5(hotel, classification);  break; //back to main menu
                case 6: option6(hotel);  break; //logout
                case 7: System.out.println("Bye..."); //quit
                        System.exit(0);
                                    break;
                default:System.out.println("Please select a valid option.");
            }
        }
    }
}
