
import java.util.Scanner;
/**
 *This is the GuestsMenu class a child class of Menu
 * @author Devon Alonzo
 * @date 11-8-2023
 */
public class GuestsMenu
{
    private byte option;
    
    public void option1()
    {
        //check-in guest
    }
    public void option2()
    {
        //check-out guest
    }
    public void option3()
    {
        //edit guest info
    }
    public void option4()
    {
        //view all guests
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
            Scanner in = new Scanner(System.in);
            System.out.printf("%nWhat do you want to do?%n(1) Check-in guest %n(2) Check-out guest %n(3) Edit guest info %n(4) View all guests%n(5) Back to main menu%n (6) Logout%n (7) Quit");
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
