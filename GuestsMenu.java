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
    public void option1(Map<Integer, Guest> guests) //check-in guest
    {
        //TO-DO: check-in guest method
    }
    public void option2(Map<Integer, Guest> guests) //check-out guest
    {
        //TO-DO: check-out guest method
    }
    public void option3(Map<Integer, Guest> guests) // edit guest info
    {
        //TO-DO: edit guest info method
    }
    /**
     * This method displays all the guests in the hotel
     * @param guests
     */
    public void option4(Map<Integer, Guest> guests)
    {
        Set<Integer> keySet = guests.keySet();
        for(Integer key : keySet)
        {
            System.out.println(guests.get(key).toString());
        }
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
        Map<Integer, Guest> guests = hotel.getAllGuests(); 
        while(true)
        {
            Scanner in = new Scanner(System.in);
            System.out.printf("%nWhat do you want to do?%n(1) Check-in guest %n(2) Check-out guest %n(3) Edit guest info %n(4) View all guests%n(5) Back to main menu%n (6) Logout%n (7) Quit%n");
            option = in.nextByte();
            switch (option) // switch statement for the different menu options defined above
            {
                case 1: option1(guests);  break;
                case 2: option2(guests);  break;
                case 3: option3(guests);  break;
                case 4: option4(guests);  break;
                case 5: option5(hotel, classification);  break;
                case 6: option6(hotel);  break;
                case 7: System.out.println("Bye...");
                        System.exit(0);
                                    break;
                default:System.out.println("Please select a valid option.");
            }
        }
    }
}
