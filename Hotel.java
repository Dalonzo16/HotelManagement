
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Ludwig Scherer
 * @date 10-30-2023
 */

public class Hotel 
{
    private String hotelName;
    private ArrayList<Room> availableRooms;
    private ArrayList<Room> occupiedRooms;
    private ArrayList<Employee> employees;
    private Map<String, Guest> allGuests;
    /**
     * Constructor for objects of class Hotel
     */
    public Hotel(String hotelName)
    {
        this.hotelName = hotelName;
        availableRooms = new ArrayList<Room>();
        occupiedRooms = new ArrayList<Room>();
        employees = new ArrayList<Employee>();
        allGuests = new TreeMap<>();
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
     * gets all available rooms
     * @return
     */
    public ArrayList<Room> getAvailableRooms()
    {
        return availableRooms;
    }
    /**
     * gets all occupied rooms
     * @return
     */
    public ArrayList<Room> getOccupiedRooms()
    {
        return occupiedRooms;
    }
    /**
     * gets all employees ??????????????????????????????????????????
     * @return
     */
    public ArrayList<Employee> getEmployees()
    {
        return employees;
    }
    public Map<String, Guest> getGuests(){
        return allGuests;
    }
    /**
     * adds available room to availableRooms and removes it from occupiedRooms
     * @param room
     */
    public void addAvailableRoom(Room room)
    {
        availableRooms.add(room);
        occupiedRooms.remove(room);
    }
    /**
     * adds occupied room to occupiedRooms and removes it from availableRooms
     * @param room
     */
    public void addOccupiedRoom(Room room)
    {
        occupiedRooms.add(room);
        availableRooms.remove(room);
    }
    /**
     * adds guest to allGuests
     * @param guest
     */
    public void addGuest(String name, Guest guest)
    {
        allGuests.put(name , guest);
    }
    /**
     * removes guest from allGuests
     * @param guest
     */
    public void removeGuest(String name)
    {
        allGuests.remove(name);
    }
    public void addEmployees(Employee anEmployee){
        employees.add(anEmployee);
    }

}