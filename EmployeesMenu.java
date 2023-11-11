
import java.util.Scanner;

/**
 *This is the EmployeesMenu another child class of Menu
 * @author Devon Alonzo
 * @date 11-8-2023
 */
public class EmployeesMenu
{
    private byte option;

    public void option1()
    {
        //create new employee
    }
    public void option2()
    {
        //remove employee
    }
    public void option3()
    {
        //look up employee info
    }
    public void option4()
    {
        //view all employees
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
            System.out.printf("%nWhat do you want to do?%n(1) Create new employee %n(2) Remove employee %n(3) Look up employee info %n(4) View all employees%n(5) Back to main menu%n (6) Logout%n (7) Quit");
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
