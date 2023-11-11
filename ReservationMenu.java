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

    public void option1(Map<Integer, Reservation> reservations)
    {
        //create new reservation
    }
    public void option2(Map<Integer, Reservation> reservations)
    {
        //edit reservation
    }
    public void option3(Map<Integer, Reservation> reservations)
    {
        //cancel reservation
    }
    public void option4(Map<Integer, Reservation> reservations)
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
        Map<Integer, Reservation> reservations = hotel.getAllReservations();
        while(true)
        {
            System.out.printf("%nWhat do you want to do?%n(1) Create Reservation %n(2) Edit Reservation %n(3) Cancel Reservation %n(4) Look up reservation %n(5) Back to main menu%n (6) Logout%n (7) Quit");
            Scanner in = new Scanner(System.in);
            option = in.nextByte();
            switch (option)
            {
                case 1: option1(reservations);  break;
                case 2: option2(reservations);  break;
                case 3: option3(reservations);  break;
                case 4: option4(reservations);  break;
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
