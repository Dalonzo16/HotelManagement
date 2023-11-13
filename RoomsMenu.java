import java.util.Scanner;

/**
 *This is the RoomsMenu class another child class of Menu
 * @author Devon Alonzo
 * @date 11-8-2023
 */
public class RoomsMenu extends InitialLogin
{
    private byte option;

    /**
     * This is the constructor for the RoomsMenu class
     */
    public RoomsMenu()
    {
        option = 0;
    }
    /**
     * This method displays all the available rooms in the hotel
     * @param rooms
     */
    public void option1(Hotel hotel)
    {
        hotel.printOccupiedRooms();
    }
    /**
     * This method displays all the occupied rooms in the hotel
     * @param hotel
     */
    public void option2(Hotel hotel)
    {
        hotel.printOccupiedRooms();
    }
    /**
     * This method displays the info about a specific room
     * @param rooms
     */
    public void option3(Hotel hotel)
    {
        hotel.lookUpRoom();
    }
    /**
     * This method cleans a specific room
     * @param hotel
     */
    public void option4(Hotel hotel)
    {
        hotel.cleanRoom();
    }
    /**
     * This method cleans all the rooms in the hotel
     * @param hotel
     */
    public void option5(Hotel hotel)
    {
        hotel.cleanAllRooms();
    }
    /**
     * This method takes the employee back to the main menu according to their classification
     * @param hotel
     * @param classification
     */
    public void option6(Hotel hotel, byte classification)
    {
        if(classification == 1)
        {
            StaffMenu staffMenu = new StaffMenu();
            staffMenu.displayMenu(hotel);
        }
        if(classification == 2)
        {
            ReceptionistMenu receptionistMenu = new ReceptionistMenu();
            receptionistMenu.displayMenu(hotel);
        }
        else
        {
            ManagerMenu managerMenu = new ManagerMenu();
            managerMenu.displayMenu(hotel);
        }
    }
    /**
     * This method logs the user out and takes them back to the initial login menu
     */
    public void option7(Hotel hotel)
    {
        InitialLogin initialLogin = new InitialLogin();
        initialLogin.displayMenu(hotel);
    }
    /**
     * This method displays the menu for the rooms
     * @param hotel
     * @param classification
     */
    public void displayMenu(Hotel hotel, byte classification) 
    {
        while(true)
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Rooms menu, please select an option:\n(1) Show available rooms\n(2) Show occupied rooms\n(3) Look up info about room #\n(4) Clean a room #\n(5) Clean all rooms\n(6) Back to main menu\n(7) Logout\n(8) Quit\n");
            this.option = in.nextByte();
            switch (option) // switch statement for menu options
            {
                case 1: option1(hotel);  break; // show available rooms option
                case 2: option2(hotel);  break; // show occupied rooms option
                case 3: option3(hotel);  break; // look up info about room option
                case 4: option4(hotel);  break; // clean a room option
                case 5: option5(hotel);  break; // clean all rooms option
                case 6: option6(hotel, classification);  break; // back to main menu option
                case 7: option7(hotel);  break; // logout option
                case 8: System.out.println("Bye..."); // quit option
                        System.exit(0);
                                    break;
                default:System.out.println("Please select a valid option.\n");
            }
        }
        
    }
}