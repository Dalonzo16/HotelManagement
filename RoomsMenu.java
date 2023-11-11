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
    public void option2(Map<Integer, Room> rooms)
    {
        //look up info about room
    } 
    public void option3(Map<Integer, Room> rooms)
    {
        //back to main menu
    }
    public void option4(Hotel hotel, Map<Integer, Room> rooms)
    {
        InitialLogin initialLogin = new InitialLogin();
        initialLogin.displayMenu(hotel);
    }
    public void displayMenu(Hotel hotel, byte classification) 
    {
        Map<Integer, Room> rooms = hotel.getRooms();
        Scanner in = new Scanner(System.in);
        System.out.println("Rooms menu, please select an option:\n(1) Show available rooms\n(2) Look up info about room #\n(3) Back to main menu\n(4)Logout\n(5)Quit");
        this.option = in.nextByte();
        switch (option)
            {
                case 1: option1(rooms);  break;
                case 2: option2(rooms);  break;
                case 3: option3(rooms);  break;
                case 4: option4(hotel, rooms);  break;
                case 5: System.out.println("Bye...");
                        System.exit(0);
                                    break;
                default:System.out.println("Please select a valid option.");
            }
    }
    
    /**
     *This is the checkInput method it recieves a list of rooms to show the available rooms and search a room
     * @param map a list of rooms
     */
    public void checkInput(Map<Integer, Room> rooms)//this is just a list of all the rooms need to switch to the availrooms list
    {
        Room currentRoom;
        String availableRooms = "";
        switch(this.option)
        {
            case 1:
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
            break;
            case 2:
                int roomNumber;
                System.out.println("Enter the room number you want to search");
                Scanner in = new Scanner(System.in);
                roomNumber = in.nextInt();
                for(Integer key : rooms.keySet())
                {
                    currentRoom = rooms.get(key);
                    if(currentRoom.getRoomNumber() == roomNumber)
                    {
                        System.out.println("Floor: " + (int) currentRoom.getRoomNumber()/100 + " | Room Number: " + currentRoom.getRoomNumber() + " | $"+ currentRoom.getPricePerNight() + " per night | ");
                        break;
                    }
                }
        }
    }
}
