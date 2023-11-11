import java.util.HashMap;
import java.util.Map;

/**
 * @author Ludwig Scherer
 * @date 10-30-2023
 */

public class Hotel 
{
    private String hotelName;
    private Map<Integer, Room> rooms;
    private Map<Integer, Employee> employees;
    private Map<String, Guest> allGuests;
    private Map<Integer, Payment> payments;
    
    /**
     * Constructor for objects of class Hotel
     */
    public Hotel(String hotelName)
    {
        this.hotelName = hotelName;
        rooms = new HashMap<>();
        employees = new HashMap<>();
        allGuests = new HashMap<>();
        payments = new HashMap<>();
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
    public Map<Integer, Room> getRooms()
    {
        return rooms;
    }
    /**
     * gets all employees
     * @return
     */
    public Map<Integer, Employee> getEmployees()
    {
        return employees;
    }
    public Map<String, Guest> getGuests(){
        return allGuests;
    }
    /**
     * adds room to list of rooms
     * @param room
     */
    public void addRoom(Room room)
    {
        rooms.put(room.getRoomNumber(), room);
    }
    /**
     * adds guest to allGuests
     * @param guest
     */
    public void addGuest(String name, Guest guest)
    {
        allGuests.put(name, guest);
    }
    public void addEmployee(Employee employee)
    {
        employees.put(employee.getEmployeeId(), employee);
    }
    /**
     * removes guest from allGuests
     * @param guest
     */
    public void removeGuest(String name)
    {
        allGuests.remove(name);
    }
    public void removeRoom(Room room)
    {
        rooms.remove(room.getRoomNumber());
    }
    public void removeEmployee(Employee employee)
    {
        employees.remove(employee.getEmployeeId());
    }
    public Map<Integer, Payment> getPayments(){
        return payments;
    }
    public void addPayment(int payId, Payment payment){
        payments.put(payment.getPaymentID(), payment);
    }
}