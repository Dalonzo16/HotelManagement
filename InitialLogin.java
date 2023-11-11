
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Ludwig Scherer
 * @date 11-10-2023
 */

public class InitialLogin
{
    private int employeeID;
    private String password;
    private byte option;
    private byte classification;

    public InitialLogin()
    {
        super();
    } 
    public void option1(Map<Integer, Employee> employees)
    {
        Scanner in = new Scanner(System.in);
        Set<Integer> keySet = employees.keySet();
        System.out.println("Please enter your employee ID: ");
        employeeID = in.nextInt();
        if(keySet.contains(employeeID))
        {
            classification = 1;
            //create new general staff menu
        }
        else
        {
            System.out.println("User ID does not exist.");
        }
    }
    public void option2(Map<Integer, Employee> employees)
    {
        Scanner in = new Scanner(System.in);
        Set<Integer> keySet = employees.keySet();
        System.out.printf("%nPlease enter your employee ID: ");
        employeeID = in.nextInt();
        if(keySet.contains(employeeID) )
        {
            if(employees.get(employeeID) instanceof Receptionist || employees.get(employeeID) instanceof Manager)
            {
                System.out.println("Please enter your password: ");
                password = in.next();
                if(employees.get(employeeID).getPassword() == password)
                {
                    classification = 2;
                    //create new receptionist menu
                }
                else
                {
                    System.out.println("Incorrect password.");
                }
            }
            else
            {
                System.out.println("You are not authorized to access this menu.");
            }
        }
        else
        {
            System.out.println("User ID does not exist.");
        }
    }
   
    public void option3(Map<Integer, Employee> employees)
    {
        Scanner in = new Scanner(System.in);
        Set<Integer> keySet = employees.keySet();
        System.out.println("Please enter your employee ID: ");
        employeeID = in.nextInt();
        if(keySet.contains(employeeID))
        {
            if(employees.get(employeeID) instanceof Manager)
            {
                System.out.println("Please enter your password: ");
                password = in.next();
                if(employees.get(employeeID).getPassword() == password)
                {
                    classification = 3;
                    //create new manager menu
                }
                else
                {
                    System.out.println("Incorrect password.");
                }
            }
            else
            {
                System.out.println("You are not authorized to access this menu.");
            }
        }
        else
        {
            System.out.println("User ID does not exist.");
        }
    }
    public void displayMenu(Map<Integer, Employee> employees)
    {
        Map<Integer, Employee> allEmployees = employees;
        while(true)
        {
            Scanner in = new Scanner(System.in);
            System.out.printf("%nSelect one of the options accordingly to your position:%n(1) General Staff %n(2) Receptionist %n(3) Manager %n(4) Quit %n");
            option = in.nextByte();
            switch (option)
            {
                case 1: option1(allEmployees);  break;
                case 2: option2(allEmployees);  break;
                case 3: option3(allEmployees);  break;
                case 4: System.out.println("Bye...");
                        System.exit(0);
                                    break;
                default:System.out.println("Please select a valid option.");
            }
        }
    }
}
