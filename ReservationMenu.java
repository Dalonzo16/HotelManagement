import java.util.Scanner;

/**
 *This is the ReservationsMenu class another child class of Menu
 * @author Devon Alonzo
 * @date 11-8-2023
 */
public class ReservationMenu
{
    private byte option;

    /**
     * Constructor for objects of class ReservationsMenu
     */
    public ReservationMenu()
    {
        option = 0;
    }
    /**
     * this is the add reservation option
     * @param hotel
     */
    public void option1(Hotel hotel)
    {
        hotel.addReservation();
    }
    /**
     * this is the edit reservation option
     * @param hotel
     */
    public void option2(Hotel hotel)
    {
        hotel.editReservation();
    }
    /**
     * this is the remove reservation option
     * @param hotel
     */
    public void option3(Hotel hotel)
    {
        hotel.removeReservation();
    }
    /**
     * this is the look up reservation option
     * @param hotel
     */
    public void option4(Hotel hotel)
    {
        hotel.lookUpReservation();
    }
    /**
     * this is the back to main menu option
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
    }
    /**
     * this is the logout option
     * @param hotel
     */
    public void option6(Hotel hotel)
    {
        InitialLogin initialLogin = new InitialLogin();
        initialLogin.displayMenu(hotel);
    }
    /**
     * this is the quit option
     * @param hotel
     */
    public void displayMenu(Hotel hotel, byte classification)
    {
        while(true)
        {
            System.out.printf("%nWhat do you want to do?%n(1) Create Reservation %n(2) Edit Reservation %n(3) Cancel Reservation %n(4) Look up reservation %n(5) Back to main menu%n (6) Logout%n (7) Quit%n");
            Scanner in = new Scanner(System.in);
            option = in.nextByte();
            switch (option)
            {
                case 1: option1(hotel);  break; // add reservation
                case 2: option2(hotel);  break; // edit reservation 
                case 3: option3(hotel);  break; // cancel reservation  
                case 4: option4(hotel);  break; // look up reservation 
                case 5: option5(hotel, classification);  break; // back to main menu
                case 6: option6(hotel);  break; // logout 
                case 7: System.out.println("Bye..."); // quit 
                        System.exit(0);
                                    break;
                default:System.out.println("Please select a valid option.");
            }
        } 
    }
}
