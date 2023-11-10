
import java.util.ArrayList;

/**
 * @author Ludwig Scherer
 * @date 10-30-2023
 */

public class Hotel 
{
    private String hotelName;
    private ArrayList<Room> rooms;
    private ArrayList<Employee> employees;
    private ArrayList<Guest> allGuests;
    
    /**
     * Constructor for objects of class Hotel
     */
    public Hotel(String hotelName)
    {
        this.hotelName = hotelName;
        rooms = new ArrayList<Room>();
        employees = new ArrayList<Employee>();
        allGuests = new ArrayList<Guest>();
    }
    /**
     * gets hotel name
     * @return
     */
    public String getHotelName()
    {
        return hotelName;
    }
    /**
     * gets all occupied rooms
     * @return
     */
    public ArrayList<Room> getRooms()
    {
        return rooms;
    }
    /**
     * gets all employees
     * @return
     */
    public ArrayList<Employee> getEmployees()
    {
        return employees;
    }
    /**
     * adds room to list of rooms
     * @param room
     */
    public void addRoom(Room room)
    {
        rooms.add(room);
    }
    /**
     * adds guest to allGuests
     * @param guest
     */
    public void addGuest(Guest guest)
    {
        allGuests.add(guest);
    }
    public void addEmployee(Employee employee)
    {
        employees.add(employee);
    }
    /**
     * removes guest from allGuests
     * @param guest
     */
    public void removeGuest(Guest guest)
    {
        allGuests.remove(guest);
    }
}