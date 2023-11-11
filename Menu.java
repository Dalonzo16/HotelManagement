import java.util.Map;
import java.util.Scanner;

/**
 *This is the Menu class it is the main menu and is a parent class to all of the options in the menu
 * @author Devon Alonzo
 * @date 11-8-2023
 */
public class Menu 
{
     private byte userSelection;
    private byte quitOption;
    
    public Menu(){
        this.quitOption = 4;

    }
    /**\
     * This is the displayMenu method it displays the menu options and recieves the user input
     */
    public void displayMenu()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("=============================================================================");
        System.out.println("|   Welcome to Hotel Mangement. Please select one of the following options  |");
        System.out.println("=============================================================================\n");
        System.out.println("=====================");
        System.out.println("| 1. Receptionist   |");
        System.out.println("| 2. Staff          |");
        System.out.println("| 3. Manager        |");
        System.out.println("| 4. Exit           | ");
        System.out.println("=====================");
        this.userSelection = in.nextByte();
    }
    /**
     * This is the checkInput method it creates a new object of whatever submenu is seleted. it recieves a list of rooms that is recieved in case 2 and it recieves a list of employees in case 4
     * @param rooms a list of rooms
     * @param rooms2 a list of employees
     */

    public void checkInput(Hotel hotel, Receptionist employee){
        switch(userSelection){
            case 1:
                ReceptionistMenu option1 = new ReceptionistMenu();
                LoginMenu regLogin = new LoginMenu();
                do{
                    regLogin.displayLogin();
                    regLogin.checkUserCredentials(hotel.getEmployees());
                }while(!regLogin.isValid());

                do{
                    option1.displayMenu();
                    option1.checkInput1(hotel, employee);
                }while(option1.getUserSelection() != 4);

            break;
            case 2:
                StaffMenu option2 = new StaffMenu();
                LoginMenu regLogin1 = new LoginMenu();
                do{
                    regLogin1.displayLogin();
                    regLogin1.checkUserCredentials(hotel.getEmployees());
                }while(!regLogin1.isValid());
                
                do{
                    option2.displayMenu();
                    option2.checkInput2(hotel);
                }while(option2.getUserSelection() != 2);
            break;
            case 3:
                ManagerMenu option3 = new ManagerMenu();
                ManagerLogin mangLogin = new ManagerLogin();
                do{
                    mangLogin.displayLogin();
                    mangLogin.checkManagerCredentials(hotel.getEmployees());
                }while(!mangLogin.isValid());

                do{
                    option3.displayMenu();
                    option3.checkInput3(hotel, employee);
                }while(option3.getUserSelection() != 6);               

        }
    }
    /**
     * this method gets the user selection
     * @return the users selection
     */
    public byte getUserSelection()
    {
        return userSelection;
    }
    /**
     * This method gets the quit option
     * @return the quit option
     */
    public byte getQuitOption() 
    {
        return quitOption;
    }
}
    
