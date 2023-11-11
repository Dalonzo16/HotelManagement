
import java.util.Scanner;
/**
 * This is the ReceptionistMenu class another child class of Menu
 * @Author Devon Alonzo
 * @date 2023-11-09 19:48:58
 */
public class ReceptionistMenu
{
    private byte option;
    private byte classification = 2;
    
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
        InitialLogin initialLoginMenu = new InitialLogin();
        initialLoginMenu.displayMenu(hotel);
    }

    public void displayMenu(Hotel hotel) 
    {
        while(true)
        {
            Scanner in = new Scanner(System.in);
            System.out.printf("%nWhat do you want to access?%n(1) Guests %n(2) Rooms %n(3) Reservations %n(4) Logout%n(5) Exit%n");
            option = in.nextByte();
            switch (option)
            {
                case 1: option1(hotel);  break;
                case 2: option2(hotel);  break;
                case 3: option3(hotel);  break;
                case 4: option4(hotel);  break;
                case 5: System.out.println("Bye...");
                        System.exit(0);
                                    break;
                default:System.out.println("Please select a valid option.");
            }
        }
    }
}