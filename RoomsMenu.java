import java.util.Map;
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
    public void checkInput(Map<Integer, Room> rooms)//this is just a list of all the rooms need to switch to the availrooms list
    {
        Room currentRoom;
        switch(this.userSelection)
        {
            
            case 1:
                for(Integer key : rooms.keySet())
                {
                    currentRoom = rooms.get(key);
                    System.out.println("Room Number: "+ currentRoom.getRoomNumber());
                }
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
    @Override
    public byte getUserSelection() 
    {
        return userSelection;
    }
}
