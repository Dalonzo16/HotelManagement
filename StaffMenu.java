import java.util.Scanner;
/**
 * This is the staff menu class another child class of Menu
 * @author Devon Alonzo
 * @date 2023-11-09 19:46:59
 */
public class StaffMenu
{
    private byte option;

    public void option1()
    {
        //create new Rooms menu
    }
    public void option2()
    {
        //Logout (call initial login menu)
    }

    public void displayMenu()
    {
        while(true)
        {
            Scanner in = new Scanner(System.in);
            System.out.printf("%nWhat do you want to access?%n(1) Rooms%n(2) Logout%n(3) Exit)");
            option = in.nextByte();
            switch (option)
            {
                case 1: option1();  break;
                case 2: option2();  break;
                case 5: System.out.println("Bye...");
                        System.exit(0);
                                    break;
                default:System.out.println("Please select a valid option.");
            }
        }
    }
}