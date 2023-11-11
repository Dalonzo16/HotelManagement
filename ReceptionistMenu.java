
import java.util.Scanner;
/**
 * This is the ReceptionistMenu class another child class of Menu
 * @Author Devon Alonzo
 * @date 2023-11-09 19:48:58
 */
public class ReceptionistMenu
{
    private byte option;
    
    public void option1()
    {
        //create new Guests menu
    }
    public void option2()
    {
        //create new Rooms menu
    }
    public void option3()
    {
        //create new Reservations menu
    }
    public void option4()
    {
        //Logout (call initial login menu)
    }

    public void displayMenu() 
    {
        while(true)
        {
            Scanner in = new Scanner(System.in);
            System.out.printf("%nWhat do you want to access?%n(1) Guests %n(2) Rooms %n(3) Reservations %n(4) Logout%n(5) Exit)");
            option = in.nextByte();
            switch (option)
            {
                case 1: option1();  break;
                case 2: option2();  break;
                case 3: option3();  break;
                case 4: option4();  break;
                case 5: System.out.println("Bye...");
                        System.exit(0);
                                    break;
                default:System.out.println("Please select a valid option.");
            }
        }
    }
}