import java.util.Scanner;
import java.util.Map;

/**
 *This is the ReservationsMenu class another child class of Menu
 * @author Devon Alonzo
 * @date 11-8-2023
 */
public class ReservationMenu
{
    private byte option;

    public void option1(Hotel hotel)
    {
        //create new reservation
    }
    public void option2(Hotel hotel)
    {
        Scanner in = new Scanner(System.in);
        int reservationNumber;
        System.out.println("Enter the number of the reservation you want to cancel");
        reservationNumber = in.nextInt();
        hotel.cancelReservation(reservationNumber);
    }
    public void option3(Hotel hotel)
    {
        //cancel reservation
    }
    public void option4(Hotel hotel)
    {
        //look up reservation
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
        while(true)
        {
            System.out.printf("%nWhat do you want to do?%n(1) Create Reservation %n(2) Edit Reservation %n(3) Cancel Reservation %n(4) Look up reservation %n(5) Back to main menu%n (6) Logout%n (7) Quit%n");
            Scanner in = new Scanner(System.in);
            option = in.nextByte();
            switch (option)
            {
                case 1: option1(hotel);  break; // create reservation option
                case 2: option2(hotel);  break; // edit reservation option
                case 3: option3(hotel);  break; // cancel reservation option 
                case 4: option4(hotel);  break; // look up reservation option
                case 5: option5(hotel);  break; // back to main menu option
                case 6: option6(hotel);  break; // logout option
                case 7: System.out.println("Bye..."); // quit option
                        System.exit(0);
                                    break;
                default:System.out.println("Please select a valid option.");
            }
        } 
    }
}
