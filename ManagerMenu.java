
import java.util.Map;
import java.util.Scanner;
/**
 * This is the ManagerMenu class another child class of Menu
 * @author Devon Alonzo
 * @date 2023-11-09 20:06:42
 */
public class ManagerMenu
{
    private byte option;

    public ManagerMenu()
    {
        super();
    }

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
        //create new Employees menu
    }
    public void option5()
    {
        //create new Reports menu
    }
    public void option6()
    {
        //Logout (call initial login menu)
    }
    public void option7()
    {
        System.out.println("Bye...");
        System.exit(0);
    }

    public void displayMenu(Map<Integer, Employee> employees)
    {
        while(true)
        {
            Scanner in = new Scanner(System.in);
            System.out.printf("%nSelect one of the options accordingly to your position:%n(1) Receptionist %n(2) General Staff %n(3) Manager %n(4) Quit %n");
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
