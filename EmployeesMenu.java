import java.util.Map;
import java.util.Scanner;

/**
 *This is the EmployeesMenu another child class of Menu
 * @author Devon Alonzo
 * @date 11-8-2023
 */
public class EmployeesMenu
{
    private byte option;

    /**
     * This is the constructor for the EmployeesMenu class
     */
    public EmployeesMenu()
    {
        option = 0;
    }
    /**
     * This method creates a new employee by asking the user for the employee info and 
     * then calls the addEmployee method from the Hotel class
     * @param hotel
     */
    public void option1(Hotel hotel)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the employee's first name:");
        String firstName = in.next();
        System.out.println("Please enter the employee's last name:");
        String lastName = in.next();
        System.out.println("Please enter the employee's password:");
        String password = in.next();
        System.out.println("Please enter the employee's pay rate:");
        double payRate = in.nextDouble();
        Employee employee = new Employee(firstName, lastName, password, payRate);
        hotel.addEmployee(employee);
    }
    /**
     * This method removes an employee by asking the user for the employee ID and 
     * then calls the removeEmployee method from the Hotel class
     * @param hotel
     */
    public void option2(Map<Integer, Employee> employees)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the ID of the employee you want to remove: ");
        int employeeID = in.nextInt();
    }
    /**
     * This method looks up an employee by asking the user for the employee ID and 
     * then calls the getEmployee method from the Hotel class
     * @param hotel
     */
    public void option3(Map<Integer, Employee> employees)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the ID of the employee you want to look up: ");
        int employeeID = in.nextInt();
        if(employees.containsKey(employeeID)) // if the employee ID exists
        {
            Employee employee = employees.get(employeeID);
            System.out.println("Employee " + employeeID + ": " + employee.getFirstName() + " " + employee.getLastName() + "\nAddress: " + employee.getAddress() + "\nPhone number: " + employee.getPhoneNumber() + "\nPay Rate: " + employee.getPayRate() +  "\nShift: " + employee.getShift());
        }
        else
        {
            System.out.println("Employee ID does not exist.");
        }
    }
    /**
     * This method displays all the employees in the hotel
     * @param hotel
     */
    public void option4(Hotel hotel)
    {
        Map<Integer, Employee> employees = hotel.getEmployees();
        for(Integer key : employees.keySet())
        {
            System.out.println(employees.get(key));
        }
    }
    /**
     * This method takes the manager back to the main menu
     * @param hotel
     */
    public void option5(Hotel hotel)
    {
        ManagerMenu managerMenu = new ManagerMenu();
        managerMenu.displayMenu(hotel);
    }
    /**
     * This method logs the user out and takes them back to the initial login menu
     * @param hotel
     */
    public void option6(Hotel hotel)
    {
        InitialLogin initialLogin = new InitialLogin();
        initialLogin.displayMenu(hotel);
    }
    /**
     * This method displays the employees menu
     * @param hotel
     */
    public void displayMenu(Hotel hotel) // displays menu to user
    {
        while(true)
        {
            Map<Integer, Employee> employees = hotel.getEmployees();
            Scanner in = new Scanner(System.in);
            System.out.printf("%nWhat do you want to do?%n(1) Create new employee %n(2) Remove employee %n(3) Look up employee info %n(4) View all employees%n(5) Back to main menu%n(6) Logout%n(7) Quit%n");
            option = in.nextByte();
            switch (option) // switch statement for the different menu options defined above
            {
                case 1: option1(hotel);  break;
                case 2: option2(employees);  break;
                case 3: option3(employees);  break;
                case 4: option4(hotel);  break;
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
