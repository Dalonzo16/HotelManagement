import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

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
    public void addRoom()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the room number:");
        int roomNumber = in.nextInt();
        System.out.println("Please enter the price per night:");
        double pricePerNight = in.nextDouble();
        Room room = new Room(roomNumber, pricePerNight);
        addRoom(room);
    }
    public void addRoom(Room room)
    {
        rooms.put(room.getRoomNumber(), room);
    }
    /**
     * adds guest to allGuests
     * @param guest
     */
    public void addGuest()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the guest's first name:");
        String firstName = in.next();
        System.out.println("Please enter the guest's last name:");
        String lastName = in.next();
        System.out.println("Please enter the guest's phone number:");
        String phoneNumber = in.next();
        System.out.println("Please enter the guest's email:");
        String email = in.next();
        System.out.println("Please enter the guest's reservation number:");
        int reservationNumber = in.nextInt();
        Reservation reservation = reservations.get(reservationNumber);
        Guest guest = new Guest(firstName, lastName, phoneNumber, email, reservation);

        addGuest(guest);
    }
    public void addGuest(Guest guest)
    {
        allGuests.put(guest.getGuestID(), guest);
    }
    /**
     * adds employee to employees
     * @param employee
     */
    public void addEmployee()
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
    public void addEmployee(Employee employee)
    {
        employees.put(employee.getEmployeeId(), employee);
    }
    /**
     * removes guest from allGuests
     * @param guest
     */
    public void removeGuest()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the ID of the guest you want to remove: ");
        int guestID = in.nextInt();
        if(allGuests.containsKey(guestID))
        {
            removeGuest(guestID);
        }
        else
        {
            System.out.println("Guest ID does not exist.");
        }
    }
    public void removeGuest(int guestID)
    {
        if(allGuests.containsKey(guestID))
        {
            allGuests.remove(guestID);
        }
        else
        {
            System.out.println("Guest ID does not exist.");
        }
    }
    /**
     * removes room from rooms
     * @param room
     */
    public void removeRoom()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the room number of the room you want to remove: ");
        int roomNumber = in.nextInt();
        if(rooms.containsKey(roomNumber))
        {
            removeRoom(roomNumber);
        }
        else
        {
            System.out.println("Room number does not exist.");
        }
    }
    public void removeRoom(int roomNumber)
    {
        if(rooms.containsKey(roomNumber))
        {
            rooms.remove(roomNumber);
        }
        else
        {
            System.out.println("Room number does not exist.");
        }
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
            removeEmployee(employeeID);
        }
        else
        {
            System.out.println("Employee ID does not exist.");
        }
    }
    public void removeEmployee(int employeeID)
    {
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
    public void addReservation()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the guest's last name:");
        String lastName = in.next();
        System.out.println("Please enter the number of guests:");
        byte numberOfGuests = in.nextByte();
        System.out.println("Please enter the duration of stay:");
        byte duration = in.nextByte();
        Map<Integer, Room> roomsToReserve = new HashMap<>();
        System.out.println("Please enter the amount of room you want to reserve:");
        int amountOfRooms = in.nextInt();
        for(int i = 0; i < amountOfRooms; i++)
        {
            System.out.println("Please enter the room number of room " + (i+1) + ":");
            int roomNumber = in.nextInt();
            if(rooms.containsKey(roomNumber))
            {
                roomsToReserve.put(roomNumber, rooms.get(roomNumber));
            }
            else
            {
                System.out.println("Room number does not exist.");
                i--;
            }
        }
        Reservation reservation = new Reservation(lastName, numberOfGuests, roomsToReserve, duration);
        addReservation(reservation);
    }
    public void addReservation(Reservation reservation)
    {
        reservations.put(reservation.getReservationNumber(), reservation);
    }
    /**
     * removes reservation from reservations
     * @param reservation
     */
    public void removeReservation()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the reservation number of the reservation you want to remove: ");
        int reservationNumber = in.nextInt();
        if(reservations.containsKey(reservationNumber))
        {
            removeReservation(reservationNumber);
        }
        else
        {
            System.out.println("Reservation number does not exist.");
        }
    }
    public void removeReservation(int reservationNumber)
    {
        if(reservations.containsKey(reservationNumber))
        {
            reservations.remove(reservationNumber);
        }
        else
        {
            System.out.println("Reservation number does not exist.");
        }
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
    public void removePayment()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the payment ID of the payment you want to remove: ");
        int paymentID = in.nextInt();
        if(payments.containsKey(paymentID))
        {
            payments.remove(paymentID);
        }
        else
        {
            System.out.println("Payment ID does not exist.");
        }
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
    public String printAvailableRooms()
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
    public String printOccupiedRooms()
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
            double totalRoomPrice=0;
            addGuest();
            Map<Integer, Room> reservedRooms = reservation.getRooms();
            for(Integer key : reservedRooms.keySet())
            {
                currentRoom = reservedRooms.get(key);
                totalRoomPrice += currentRoom.getPricePerNight();
                currentRoom.setUnavailable();
            }
            double grandTotal = totalRoomPrice * reservation.getDuration();
                
            System.out.println("Amount due for a total of " + reservation.getDuration() + " nights is: $" + grandTotal);
            System.out.println("Enter Credit card Number: ");
            String creditCardNum = in.next();
            System.out.println("Enter amount to be paid: ");
            double payAmount = in.nextDouble();
            if(payAmount != grandTotal){
                do{
                grandTotal = grandTotal - payAmount;
                System.out.println("amount due: " + grandTotal);
                payAmount = in.nextDouble();
            }while(payAmount != grandTotal);

            }
            System.out.println("Guest is checked in");
        }
        else
        {
            System.out.println("No reservation found. Please create a reservation in the reservation menu before checking a guest in.");
        }
    }
    public void checkOutGuest(int guestID)
    {
        if(allGuests.containsKey(guestID))
        {
            Guest guest = allGuests.get(guestID);
            Reservation reservation = guest.getReservation();
            Set<Integer> keySet = reservation.getRooms().keySet();
            for(Integer key : keySet)
            {
                rooms.get(key).setAvailable();
                rooms.get(key).setDirty();
            }
            reservations.remove(reservation.getReservationNumber());
            allGuests.remove(guestID);
            System.out.println("Guest is checked out");
        }
        else
        {
            System.out.println("Guest ID does not exist.");
        }
    }
    public void editGuestInfo(int guestID)
    {
        Guest guestToEdit = allGuests.get(guestID);
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the guest's first name:");
        String firstName = in.next();
        System.out.println("Please enter the guest's last name:");
        String lastName = in.next();
        System.out.println("Please enter the guest's phone number:");
        String phoneNumber = in.next();
        System.out.println("Please enter the guest's email:");
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