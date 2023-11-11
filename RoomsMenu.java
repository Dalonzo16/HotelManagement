import java.util.Map;
import java.util.Scanner;

/**
 *This is the RoomsMenu class another child class of Menu
 * @author Devon Alonzo
 * @date 11-8-2023
 */
public class RoomsMenu
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
    public void option1(Map<Integer, Room> rooms)
    {
        Room currentRoom;
        String availableRooms = "";
        System.out.println("The following rooms are available:\n");
                for(Integer key : rooms.keySet())
                {
                    currentRoom = rooms.get(key);
                    if(currentRoom.isAvailable())
                    {
                        availableRooms = availableRooms + Integer.toString(currentRoom.getRoomNumber()) + System.lineSeparator();
                    }
                }
                System.out.println(availableRooms);
    }
    /**
     * This method displays the info about a specific room
     * @param rooms
     */
    public void option2(Map<Integer, Room> rooms)
    {
        Room roomToSearch;
        int roomNumber;
        System.out.println("Enter the room number you want to search");
        Scanner in = new Scanner(System.in);
        roomNumber = in.nextInt();
        roomToSearch = rooms.get(roomNumber);
        System.out.println("Floor: " + (int) roomToSearch.getRoomNumber()/100 + " | Room Number: " + roomToSearch.getRoomNumber() + " | $"+ roomToSearch.getPricePerNight() + " per night | Is it available? " + roomToSearch.isAvailable() + " | Is it clean? " + roomToSearch.isClean());
    }
    /**
     * This method takes the employee back to the main menu according to their classification
     * @param hotel
     * @param classification
     */
    public void option3(Hotel hotel, byte classification)
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
    public void option4(Hotel hotel, Map<Integer, Room> rooms)
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
        Map<Integer, Room> rooms = hotel.getRooms();
        Scanner in = new Scanner(System.in);
        System.out.println("Rooms menu, please select an option:\n(1) Show available rooms\n(2) Look up info about room #\n(3) Back to main menu\n(4) Logout\n(5) Quit\n");
        this.option = in.nextByte();
        switch (option) // switch statement for menu options
            {
                case 1: option1(rooms);  break;
                case 2: option2(rooms);  break;
                case 3: option3(hotel, classification);  break;
                case 4: option4(hotel, rooms);  break;
                case 5: System.out.println("Bye...");
                        System.exit(0);
                                    break;
                default:System.out.println("Please select a valid option.\n");
            }
    }
}