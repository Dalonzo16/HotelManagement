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
    /**
     * This method takes the manager back to the main menu
     * @param hotel
     */ 
    public void option3(Hotel hotel)
    {
        ManagerMenu managerMenu = new ManagerMenu();
        managerMenu.displayMenu(hotel);
    }
    /**
     * This method takes the user back to the initial login menu
     * @param hotel
     */
    public void option4(Hotel hotel)
    {
        InitialLogin initialLogin = new InitialLogin();
        initialLogin.displayMenu(hotel);
    }
    public void displayMenu(Hotel hotel)
    {
        while(true)
        {
            Scanner in = new Scanner(System.in);
            System.out.printf("%nWhat do you want to do?%n(1) Show hotel income %n(2) Show payroll report%n(3) Main menu%n(4) Logout%n(5) Exit%n");
            option = in.nextByte();
            switch (option)
            {
                case 1: option1();  break; //show hotel income
                case 2: option2();  break; //show payroll report
                case 3: option3(hotel);  break; //go back to main menu
                case 4: option4(hotel);  break; //logout
                case 5: System.out.println("Bye..."); //exit
                        System.exit(0);
                                    break;
                default:System.out.println("Please select a valid option.");
            }
        }
    }
}