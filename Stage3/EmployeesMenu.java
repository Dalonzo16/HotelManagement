import java.util.Scanner;

/**
 *This is the EmployeesMenu another child class of Menu
 * @author Devon Alonzo
 * @date 11-8-2023
 */
public class EmployeesMenu extends InitialLogin
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
     * This method calls the createEmployee method from the Hotel class
     * @param hotel
     */
    public void option1(Hotel hotel)
    {
        hotel.addEmployee();
    }
    /**
     * This method calls the removeEmployee method from the Hotel class
     * @param hotel
     */
    public void option2(Hotel hotel)
    {
        hotel.removeEmployee();
    }
    /**
     * This method calls the lookUpEmployee method from the Hotel class
     * @param hotel
     */
    public void option3(Hotel hotel)
    {
        hotel.lookUpEmployee();
    }
    /**
     * This method calls the editEmployee method from the Hotel class
     * @param hotel
     */
    public void option4(Hotel hotel)
    {
        hotel.editEmployee();
    }
    /**
     * This method calls the printAllEmployees method from the Hotel class
     * @param hotel
     */
    public void option5(Hotel hotel)
    {
        hotel.printAllEmployees();
    }
    /**
     * This method takes the manager back to the main menu
     * @param hotel
     */
    public void option6(Hotel hotel)
    {
        ManagerMenu managerMenu = new ManagerMenu();
        managerMenu.displayMenu(hotel);
    }
    /**
     * This method logs the user out and takes them back to the initial login menu
     * @param hotel
     */
    public void option7(Hotel hotel)
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
            Scanner in = new Scanner(System.in);
            System.out.printf("%nWhat do you want to do?%n(1) Create new employee %n(2) Remove employee %n(3) Look up employee info %n(4) Edit employee info%n (5)View all employees%n(6) Back to main menu%n(7) Logout%n(8) Quit%n");
            option = in.nextByte();
            switch (option) // switch statement for the different menu options defined above
            {
                case 1: option1(hotel);  break; //create new employee
                case 2: option2(hotel);  break; //remove employee
                case 3: option3(hotel);  break; //look up employee info
                case 4: option4(hotel);  break; //edit employee info
                case 5: option5(hotel);  break; //view all employees
                case 6: option6(hotel);  break; //back to main menu
                case 7: option7(hotel);  break; //logout
                case 8: System.out.println("Bye..."); //quit
                        System.exit(0);
                                    break;
                default:System.out.println("Please select a valid option.");
            }
        }
    }
}
