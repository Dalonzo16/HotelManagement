import java.util.Scanner;

/**
 *This is the ReservationsMenu class another child class of Menu
 * @author Devon Alonzo
 * @date 11-8-2023
 */
public class ReservationMenu
{
    private byte option;

    public void option1()
    {
        //create new reservation
    }
    public void option2()
    {
        //edit reservation
    }
    public void option3()
    {
        //cancel reservation
    }
    public void option4()
    {
        //look up reservation
    }
    public void option5()
    {
        //back to main menu
    }
    public void option6()
    {
        //logout
    }

    public void displayMenu()
    {
        while(true)
        {
            System.out.printf("%nWhat do you want to do?%n(1) Create Reservation %n(2) Edit Reservation %n(3) Cancel Reservation %n(4) Look up reservation %n(5) Back to main menu%n (6) Logout%n (7) Quit");
            Scanner in = new Scanner(System.in);
            option = in.nextByte();
            switch (option)
            {
                case 1: option1();  break;
                case 2: option2();  break;
                case 3: option3();  break;
                case 4: option4();  break;
                case 5: option5();  break;
                case 6: option6();  break;
                case 7: System.out.println("Bye...");
                        System.exit(0);
                                    break;
                default:System.out.println("Please select a valid option.");
            }
        }
        
    }
}
