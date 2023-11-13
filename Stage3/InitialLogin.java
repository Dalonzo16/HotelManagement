package Stage3;
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

    /**
     * Constructor for objects of class InitialLogin
     */
    public InitialLogin()
    {
        employeeID = 0;
        password = "";
        option = 0;
    }
    /**
     * This is the login option for General Staff
     * @param hotel
     * @param employees
     */
    public void option1(Hotel hotel, Map<Integer, Employee> employees)
    {
        Scanner in = new Scanner(System.in);
        Set<Integer> keySet = employees.keySet();
        System.out.println("Please enter your employee ID: ");
        employeeID = in.nextInt();
        if(keySet.contains(employeeID)) // if the employee ID exists
        {
            StaffMenu staffMenu = new StaffMenu(); // create a new StaffMenu object
            staffMenu.displayMenu(hotel); // call the displayMenu method from the StaffMenu class
        }
        else
        {
            System.out.println("User ID does not exist.");
        }
    }
    /**
     * This is the login option for Receptionists
     * @param hotel
     * @param employees
     */
    public void option2(Hotel hotel, Map<Integer, Employee> employees)
    {
        Scanner in = new Scanner(System.in);
        Set<Integer> keySet = employees.keySet();
        System.out.printf("%nPlease enter your employee ID: ");
        employeeID = in.nextInt();
        if(keySet.contains(employeeID)) // if the employee ID exists
        {
            if(employees.get(employeeID) instanceof Receptionist || employees.get(employeeID) instanceof Manager) // if the employee is a receptionist or a manager
            {
                System.out.println("Please enter your password: ");
                password = in.next();
                if(password.compareTo(employees.get(employeeID).getPassword()) == 0) // if the password is correct
                {
                    ReceptionistMenu receptionistMenu = new ReceptionistMenu(); // create a new ReceptionistMenu object
                    receptionistMenu.displayMenu(hotel); // call the displayMenu method from the ReceptionistMenu class
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
    /**
     * This is the login option for Managers
     * @param hotel
     * @param employees
     */
    public void option3(Hotel hotel, Map<Integer, Employee> employees)
    {
        Scanner in = new Scanner(System.in);
        Set<Integer> keySet = employees.keySet();
        System.out.println("Please enter your employee ID: ");
        employeeID = in.nextInt();
        if(keySet.contains(employeeID)) // if the employee ID exists
        {
            if(employees.get(employeeID) instanceof Manager) // if the employee is a manager
            {
                System.out.println("Please enter your password: ");
                password = in.next();
                if(password.compareTo(employees.get(employeeID).getPassword()) == 0) // if the password is correct
                {
                    ManagerMenu managerMenu = new ManagerMenu(); // create a new ManagerMenu object
                    managerMenu.displayMenu(hotel); // call the displayMenu method from the ManagerMenu class
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
    /**
     * This method displays the initial login menu
     * @param hotel
     */
    public void displayMenu(Hotel hotel)
    {
        Map<Integer, Employee> allEmployees = hotel.getEmployees();
        while(true)
        {
            Scanner in = new Scanner(System.in);
            System.out.printf("%nSelect one of the options accordingly to your position:%n(1) General Staff %n(2) Receptionist %n(3) Manager %n(4) Quit%n");
            option = in.nextByte();
            switch (option) // switch statement for the different login options defined above
            {
                case 1: option1(hotel, allEmployees);  break; //general staff 
                case 2: option2(hotel, allEmployees);  break; //receptionist
                case 3: option3(hotel, allEmployees);  break; //manager
                case 4: System.out.println("Bye..."); //quit
                        System.exit(0);
                                    break;
                default:System.out.println("Please select a valid option.");
            }
        }
    }
}
