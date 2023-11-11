
import java.util.Map;
import java.util.Scanner;
/**
 *This is the GuestsMenu class a child class of Menu
 * @author Devon Alonzo
 * @date 11-8-2023
 */
public class GuestsMenu
{
    private byte option;
    
    public void option1(Map<Integer, Guest> guests)
    {
        //check-in guest
    }
    public void option2(Map<Integer, Guest> guests)
    {
        //check-out guest
    }
    public void option3(Map<Integer, Guest> guests)
    {
        //edit guest info
    }
    public void option4(Map<Integer, Guest> guests)
    {
        //view all guests
    }
    public void option5(Hotel hotel)
    {
        //back to main menu
    }
    public void option6(Hotel hotel)
    {
        InitialLogin initialLogin = new InitialLogin();
        initialLogin.displayMenu(hotel);
    }

    public void displayMenu(Hotel hotel, byte classification) 
    {
        Map<Integer, Guest> guests = hotel.getAllGuests(); 
        while(true)
        {
            Scanner in = new Scanner(System.in);
            System.out.printf("%nWhat do you want to do?%n(1) Check-in guest %n(2) Check-out guest %n(3) Edit guest info %n(4) View all guests%n(5) Back to main menu%n (6) Logout%n (7) Quit");
            option = in.nextByte();
            switch (option)
            {
                case 1: option1(guests);  break;
                case 2: option2(guests);  break;
                case 3: option3(guests);  break;
                case 4: option4(guests);  break;
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
