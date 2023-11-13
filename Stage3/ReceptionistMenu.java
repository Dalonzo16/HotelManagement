package Stage3;
import java.util.Scanner;
/**
 * This is the ReceptionistMenu class
 * @Author Devon Alonzo
 * @date 2023-11-09 19:48:58
 */
public class ReceptionistMenu extends InitialLogin
{
    private byte option;
    private byte classification;

    /**
     * Constructor for objects of class ReceptionistMenu
     */
    public ReceptionistMenu()
    {
        option = 0;
        classification = 2;
    }
    /**
     * This method takes the user to the guests menu
     * @param hotel
     */
    public void option1(Hotel hotel)
    {
        GuestsMenu guestsMenu = new GuestsMenu();
        guestsMenu.displayMenu(hotel, classification);
    }
    /**
     * This method takes the user to the rooms menu
     * @param hotel
     */
    public void option2(Hotel hotel)
    {
        RoomsMenu roomsMenu = new RoomsMenu();
        roomsMenu.displayMenu(hotel, classification);
    }
    /**
     * This method takes the user to the reservations menu
     * @param hotel
     */
    public void option3(Hotel hotel)
    {
        ReservationMenu reservationsMenu = new ReservationMenu();
        reservationsMenu.displayMenu(hotel, classification);
    }
    /**
     * This method takes the user back to the initial login menu
     * @param hotel
     */
    public void option4(Hotel hotel)
    {
        InitialLogin initialLoginMenu = new InitialLogin();
        initialLoginMenu.displayMenu(hotel);
    }
    /**
     * This method displays the receptionist menu
     * @param hotel
     */
    public void displayMenu(Hotel hotel) 
    {
        while(true)
        {
            Scanner in = new Scanner(System.in);
            System.out.printf("%nWhat do you want to access?%n(1) Guests %n(2) Rooms %n(3) Reservations %n(4) Logout%n(5) Exit%n");
            option = in.nextByte();
            switch (option)
            {
                case 1: option1(hotel);  break; //guests
                case 2: option2(hotel);  break; //rooms
                case 3: option3(hotel);  break; //reservations
                case 4: option4(hotel);  break; //logout
                case 5: System.out.println("Bye..."); //exit
                        System.exit(0); //exits program
                                    break;
                default:System.out.println("Please select a valid option.");
            }
        }
    }
}