import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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
    public void removeEmployee()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the ID of the employee you want to remove: ");
        int employeeID = in.nextInt();
        if(employees.containsKey(employeeID))
        {
            employees.remove(employeeID);
        }
        else
        {
            System.out.println("Employee ID does not exist.");
        }
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
    /**
     * this method cleans a specific room
     * @param roomNumber
     */
    public void cleanRoom(int roomNumber)
    {
        rooms.get(roomNumber).clean();
        System.out.println("Room " + roomNumber + " has been cleaned");
    }
    /**
     * This method cleans all the rooms in the hotel
     * @param hotel
     */
    public void cleanAllRooms()
    {
        for(Integer key : rooms.keySet())
        {
            rooms.get(key).clean();
        }
        System.out.println("All rooms have been cleaned");
    }
    /**
     * This method displays all the available rooms in the hotel
     * @param hotel
     */
    public String getAvailableRooms()
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
        if(availableRooms.equals(""))
        {
            availableRooms = "There are no available rooms";
        }
        return availableRooms;
    }
    /**
     * This method displays the info about a specific room
     * @param rooms
     */
    public String lookUpRoom(int roomNumber)
    {
        if(!rooms.containsKey(roomNumber))
        {
            return "Room not found";
        }
        Room roomToSearch;
        roomToSearch = rooms.get(roomNumber);
        return "Floor: " + (int) roomToSearch.getRoomNumber()/100 + " | Room Number: " + roomToSearch.getRoomNumber() + " | $"+ roomToSearch.getPricePerNight() + " per night | Is it available? " + roomToSearch.isAvailable() + " | Is it clean? " + roomToSearch.isClean();
    }
    /**
     * This method displays all the occupied rooms in the hotel
     * @param hotel
     */
    public String getOccupiedRooms()
    {
        Room currentRoom;
        String occupiedRooms = "";
        System.out.println("The following rooms are occupied:\n");
                for(Integer key : rooms.keySet())
                {
                    currentRoom = rooms.get(key);
                    if(!currentRoom.isAvailable())
                    {
                        occupiedRooms = occupiedRooms + Integer.toString(currentRoom.getRoomNumber()) + System.lineSeparator();
                    }
                }
        if(occupiedRooms.equals(""))
        {
            occupiedRooms = "There are no occupied rooms";
        }
        return occupiedRooms;
    }
    public void checkInGuest(int reservationNumber)
    {
        if(reservations.containsKey(reservationNumber))
        {
            Reservation reservation = reservations.get(reservationNumber);
            Room currentRoom;
            createGuest();
            Map<Integer, Room> reservedRooms = reservation.getRooms();
            for(Integer key : reservedRooms.keySet())
            {
                currentRoom = reservedRooms.get(key);
                currentRoom.setUnavailable();
                System.out.println("Guest is checked in");
            }
        }
        else
        {
            System.out.println("No reservation found. Please create a reservation in the reservation menu before checking a guest in.");
        }
    }
    public void checkOutGuest(int reservationNumber)
    {
        if(reservations.containsKey(reservationNumber))
        {
            Reservation reservation;
        }
        else
        {

        }
        //TO-DO: check-out guest method
    }
    public void createGuest()
    {
        //TO-DO: create guest method
    }
    public void editGuestInfo(Guest guest)
    {
        //TO-DO: edit guest info method
    }
    public void cancelReservation(int reservationNumber)
    {
        //TO-DO: cancel reservation method
    }
    public void createReservation()
    {
        System.out.println();
    }
    public void editReservation(int reservationNumber)
    {
        //TO-DO: edit reservation method
    }
    public void lookUpReservation(int reservationNumber)
    {
        //TO-DO: look up reservation method
    }
    public void showAllReservations()
    {
        //TO-DO: show all reservations method
    }
    public void createPayment()
    {
        //TO-DO: create payment method
    }
    public void editPayment(Payment payment)
    {
        //TO-DO: edit payment method
    }
    public void lookUpPayment(int paymentID)
    {
        //TO-DO: look up payment method
    }
    public void showAllPayments()
    {
        //TO-DO: show all payments method
    }
    public void createEmployee()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the employee's first name:");
        String firstName = in.next();
        System.out.println("Please enter the employee's last name:");
        String lastName = in.next();
        System.out.println("Please enter the employee's password:");
        String password = in.next();
        System.out.println("Please enter the employee's pay rate:");
        double payRate = in.nextDouble();
        Employee employee = new Employee(firstName, lastName, password, payRate);
        addEmployee(employee);
    }
    public void editEmployee()
    {
        
    }
    public void lookUpEmployee()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the ID of the employee you want to look up: ");
        int employeeID = in.nextInt();
        if(employees.containsKey(employeeID)) // if the employee ID exists
        {
            Employee employee = employees.get(employeeID);
            System.out.println("Employee " + employeeID + ": " + employee.getFirstName() + " " + employee.getLastName() + "\nAddress: " + employee.getAddress() + "\nPhone number: " + employee.getPhoneNumber() + "\nPay Rate: " + employee.getPayRate() +  "\nShift: " + employee.getShift());
        }
        else
        {
            System.out.println("Employee ID does not exist.");
        }
    }
    public void printAllEmployees()
    {
        for(Integer key : employees.keySet())
        {
            System.out.println(employees.get(key));
        }
    }
}