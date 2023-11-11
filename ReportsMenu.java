
import java.util.Scanner;

/**
 *This is the ReportsMenu another child class of Menu
 * @author Devon Alonzo
 * @date 11-8-2023
 */
public class ReportsMenu
{
    private byte option;

    public void option1()
    {
        //show hotel income
    }
    public void option2()
    {
        //show payroll report
    } 
    public void option3()
    {
        //logout
    }
    
    public void displayMenu()
    {
        while(true)
        {
            Scanner in = new Scanner(System.in);
            System.out.printf("%nWhat do you want to do?%n(1) Show hotel income %n(2) Show payroll report%n(3) Logout%n(4) Exit)");
            option = in.nextByte();
            switch (option)
            {
                case 1: option1();  break;
                case 2: option2();  break;
                case 3: option3();  break;
                case 4: System.out.println("Bye...");
                        System.exit(0);
                                    break;
                default:System.out.println("Please select a valid option.");
            }
        }
    }
}
