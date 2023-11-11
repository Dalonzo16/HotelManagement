
import java.util.Scanner;

/**
 *This is the RoomsMenu class another child class of Menu
 * @author Devon Alonzo
 * @date 11-8-2023
 */
public class RoomsMenu extends Menu
{
    private byte userSelection;

    @Override
    public void displayMenu() 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("| 1. Available Rooms          |");
        System.out.println("| 2. Search Room Information  |");
        System.out.println("| 3. Back to main menu        |");
        System.out.println("===============================");
        this.userSelection = in.nextByte();
    }
    
    /**
     *This is the checkInput method it recieves a list of rooms to show the available rooms and search a room
     * @param map a list of rooms
     */
    public void checkInput(Hotel hotel, Receptionist employee)//this is just a list of all the rooms need to switch to the availrooms list
    {
        Room currentRoom;
        String availableRooms = "";
        switch(this.userSelection)
        {
            case 1:
                System.out.println("The following rooms are available:\n");
                for(Integer key : hotel.getRooms().keySet())
                {
                    currentRoom = hotel.getRooms().get(key);
                    if(currentRoom.isAvailable())
                    {
                        availableRooms = availableRooms + Integer.toString(currentRoom.getRoomNumber()) + System.lineSeparator();
                    }
                }
                System.out.println(availableRooms);
            break;
            case 2:
                Scanner in = new Scanner(System.in);
                int roomNumber;
                System.out.println("Enter the room number you want to search");
                roomNumber = in.nextInt();
                Room theRoom = hotel.getRooms().get(roomNumber);
                System.out.println("Floor: " + theRoom.getRoomNumber() / 100 + " |Room Number: " + theRoom.getRoomNumber() + " |Available? : " + theRoom.isAvailable());
            }
    }
    @Override
    public byte getUserSelection() 
    {
        return userSelection;
    }
}
