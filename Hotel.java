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
    private Map<Integer, Guest> allGuests;
    private Map<Integer, Reservation> reservations;
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
        reservations = new HashMap<>();
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
    public void addGuest(Guest guest)
    {
        allGuests.put(guest.getGuestID(), guest);
    }
    /**
     * adds employee to employees
     * @param employee
     */
    public void addEmployee(Employee employee)
    {
        employees.put(employee.getEmployeeId(), employee);
    }
    /**
     * removes guest from allGuests
     * @param guest
     */
    public void removeGuest(Guest guest)
    {
        allGuests.remove(guest.getGuestID());
    }
    /**
     * removes room from rooms
     * @param room
     */
    public void removeRoom(Room room)
    {
        rooms.remove(room.getRoomNumber());
    }
    /**
     * removes employee from employees
     * @param employee
     */
    public void removeEmployee(Integer employeeId)
    {
        employees.remove(employeeId);
    }
    /**
     * adds reservation to reservations
     * @param reservation
     */
    public void addReservation(Reservation reservation)
    {
        reservations.put(reservation.getReservationNumber(), reservation);
    }
    /**
     * removes reservation from reservations
     * @param reservation
     */
    public void removeReservation(Reservation reservation)
    {
        reservations.remove(reservation.getReservationNumber());
    }
    /**
     * adds payment to payments
     * @param payment
     */
    public void addPayment(Payment payment)
    {
        payments.put(payment.getPaymentID(), payment);
    }
    /**
     * removes payment from payments
     * @param payment
     */
    public void removePayment(Payment payment)
    {
        payments.remove(payment.getPaymentID());
    }
    /**
     * gets all guests
     * @return
     */
    public Map<Integer, Guest> getAllGuests()
    {
        return allGuests;
    }
    /**
     * gets all reservations
     * @return
     */
    public Map<Integer, Reservation> getAllReservations()
    {
        return reservations;
    }
    /**
     * gets all payments
     * @return
     */
    public Map<Integer, Payment> getAllPayments()
    {
        return payments;
    }
}