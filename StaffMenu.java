import java.util.Map;
import java.util.Scanner;
/**
 * This is the staff menu class another child class of Menu
 * @author Devon Alonzo
 * @date 2023-11-09 19:46:59
 */
public class StaffMenu
{
    private byte option;
    private byte classification = 1;

    public void option1(Hotel hotel, Map<Integer, Room> rooms)
    {
        RoomsMenu roomsMenu = new RoomsMenu();
        roomsMenu.displayMenu(hotel, rooms);
    }
    public void option2()
    {
        //Logout (call initial login menu)
    }

    public void displayMenu(Hotel hotel)
    {
        while(true)
        {
            Map<Integer, Room> rooms = hotel.getRooms();
            Scanner in = new Scanner(System.in);
            System.out.printf("%nWhat do you want to access?%n(1) Rooms%n(2) Logout%n(3) Exit)");
            option = in.nextByte();
            switch (option)
            {
                case 1: option1(hotel, rooms);  break;
                case 2: option2();  break;
                case 5: System.out.println("Bye...");
                        System.exit(0);
                                    break;
                default:System.out.println("Please select a valid option.");
            }
        }
    }
}