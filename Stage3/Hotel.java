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
     * adds room to list of rooms by getting the room info from the user and calling the other addRoom method with the Room object as parameter
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
    /**
     * adds room to list of rooms (receiving the room as parameter)
     * @param room
     */
    public void addRoom(Room room)
    {
        rooms.put(room.getRoomNumber(), room);
    }
    /**
     * adds guest to allGuests by getting the guest info from the user and calling the other addGuest method with the Guest object as parameter
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
        System.out.println("Please enter the guest's credit card number:");
        String creditCardNumber = in.next();
        System.out.println("Please enter the guest's reservation number:");
        int reservationNumber = in.nextInt();
        Reservation reservation = reservations.get(reservationNumber);
        Guest guest = new Guest(firstName, lastName, phoneNumber, email, creditCardNumber, reservation);

        addGuest(guest);
    }
    /**
     * adds guest to allGuests (receiving the guest as parameter)
     * @param guest
     */
    public void addGuest(Guest guest)
    {
        allGuests.put(guest.getGuestID(), guest);
    }
    /**
     * adds guest to allGuests by getting the guest info from the user and calling the other 
     * addGuest method with the Guest object as parameter and then returning the added Guest object
     */
    public Guest addGuestWithReturn()
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
        System.out.println("Please enter the guest's credit card number:");
        String creditCardNumber = in.next();
        System.out.println("Please enter the guest's reservation number:");
        int reservationNumber = in.nextInt();
        Reservation reservation = reservations.get(reservationNumber);
        Guest guest = new Guest(firstName, lastName, phoneNumber, email, creditCardNumber, reservation);

        addGuest(guest);
        return guest;
    }
    /**
     * adds employee to employees by getting the employee info from the user and calling 
     * the other addEmployee method with the Employee object as parameter
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
    /**
     * adds employee to employees (receiving the employee as parameter)
     * @param employee
     */
    public void addEmployee(Employee employee)
    {
        employees.put(employee.getEmployeeId(), employee);
    }
    /**
     * removes guest from allGuests by getting the guest ID from the user and calling the other removeGuest method with the input
     */
    public void removeGuest()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the ID of the guest you want to remove: ");
        int guestID = in.nextInt();
        removeGuest(guestID);
    }
    /**
     * removes guest from allGuests (receiving the guestID as parameter)
     * @param guestID
     */
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
     * removes room from rooms by getting the room number from the user and calling the other removeRoom method with the input
     */
    public void removeRoom()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the room number of the room you want to remove: ");
        int roomNumber = in.nextInt();
        removeRoom(roomNumber);
    }
    /**
     * removes room from rooms (receiving the roomNumber as parameter)
     * @param roomNumber
     */
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
     * removes employee from employees by getting the employee ID from the user and calling the other removeEmployee method with the input
     */
    public void removeEmployee()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the ID of the employee you want to remove: ");
        int employeeID = in.nextInt();
        removeEmployee(employeeID);
    }
    /**
     * removes employee from employees (receiving the employee as parameter)
     * @param employeeID
     */
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
     * adds reservation to reservations by getting the reservation info from the user and 
     * calling the other addReservation method with the Reservation object as parameter
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
    /**
     * adds reservation to reservations (receiving the reservation as parameter)
     * @param reservation
     */
    public void addReservation(Reservation reservation)
    {
            reservations.put(reservation.getReservationNumber(), reservation);
    }
    /**
     * removes reservation from reservations by getting the reservation number from the user and 
     * calling the other removeReservation method with the input
     */
    public void removeReservation()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the reservation number of the reservation you want to remove: ");
        int reservationNumber = in.nextInt();
        removeReservation(reservationNumber);
    }
    /**
     * removes reservation from reservations (receiving the reservationNumber as parameter)
     * @param reservationNumber
     */
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
     * adds payment to payments by getting the payment info from the user and calling 
     * the other addPayment method with the Payment object as parameter
     */
    public void addPayment()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the amount paid: ");
        double amountPaid = in.nextDouble();
        System.out.println("Please enter the credit card number: ");
        String creditCardNumber = in.next();
        Payment payment = new Payment(amountPaid, creditCardNumber);
        addPayment(payment);
    }
    /**
     * adds payment to payments (receiving the payment as parameter)
     * @param payment
     */
    public void addPayment(Payment payment)
    {
        payments.put(payment.getPaymentID(), payment);
    }
    /**
     * removes payment from payments by getting the payment ID from the user and 
     * calling the other removePayment method with the input
     */
    public void removePayment()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the payment ID of the payment you want to remove: ");
        int paymentID = in.nextInt();
        payments.remove(paymentID);
    }
    /**
     * removes payment from payments (receiving the paymentID as parameter)
     * @param paymentID
     */
    public void removePayment(int paymentID)
    {
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
     * this method cleans a specific room by getting the room number from the user and 
     * calling the other cleanRoom method with the input
     */
    public void cleanRoom()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the room number of the room you want to clean: ");
        int roomNumber = in.nextInt();
        cleanRoom(roomNumber);
    }
    /**
     * this method cleans a specific room (receiving the roomNumber as parameter)
     * @param roomNumber
     */
    public void cleanRoom(int roomNumber)
    {
        rooms.get(roomNumber).clean();
        System.out.println("Room " + roomNumber + " has been cleaned");
    }
    /**
     * This method cleans all the rooms in the hotel
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
     * This method prints all the available rooms in the hotel
     */
    public void printAvailableRooms()
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
        System.out.println(availableRooms);
    }
    /**
     * This method displays the info about a specific room by getting the room number from the user and 
     * calling the other lookUpRoom method with the input
     */
    public String lookUpRoom()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the room number of the room you want to look up: ");
        int roomNumber = in.nextInt();
        return lookUpRoom(roomNumber);
    }
    /**
     * This method displays the info about a specific room (receiving the roomNumber as parameter)
     * @param roomNumber
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
     * This method prints all the occupied rooms in the hotel
     */
    public void printOccupiedRooms()
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
        System.out.println(occupiedRooms + "\n");
    }
    /**
     * this method checks in a guest by getting the reservation number from the user and calling 
     * the other checkInGuest method with the input
     */
    public void checkInGuest()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the reservation number of the guest you want to check in: ");
        int reservationNumber = in.nextInt();
        checkInGuest(reservationNumber);
    }
    /**
     * this method checks in a guest (receiving the reservation number as parameter)
     * @param reservationNumber
     */
    public void checkInGuest(int reservationNumber)
    {
        Scanner in = new Scanner(System.in);
        if(reservations.containsKey(reservationNumber))
        {
            Reservation reservation = reservations.get(reservationNumber);
            Room currentRoom;
            Guest guest = addGuestWithReturn();
            double totalRoomPrice = 0;
            Map<Integer, Room> reservedRooms = reservation.getRooms();
            for(Integer key : reservedRooms.keySet())
            {
                currentRoom = reservedRooms.get(key);
                totalRoomPrice += currentRoom.getPricePerNight();
                rooms.get(key).setUnavailable();
            }
            double grandTotal = totalRoomPrice * reservation.getDuration();
            Payment payment = new Payment(grandTotal, guest.getCreditCardNumber());
            addPayment(payment);
            System.out.println("Amount due for a total of " + reservation.getDuration() + " nights is: $" + grandTotal);
            System.out.println("Enter amount paid: ");
            payment.setAmountPaid(in.nextDouble());
            double amountPaid = payment.getAmountPaid();
            if(amountPaid != grandTotal)
            {
                do
                {
                    System.out.println("Please pay the full amount due.");
                }while(amountPaid != grandTotal);

            }
            System.out.println("Guest is checked in");
        }
        else
        {
            System.out.println("No reservation found. Please create a reservation in the reservation menu before checking a guest in.");
        }
    }
    /**
     * this method checks out a guest by getting the guest ID from the user and 
     * calling the other checkOutGuest method with the input
     */
    public void checkOutGuest()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the guest ID of the guest you want to check out: ");
        int guestID = in.nextInt();
        checkOutGuest(guestID);
    }
    /**
     * this method checks out a guest (receiving the guestID as parameter)
     * @param guestID
     */
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
    /**
     * this method edits a guest's info by getting the guest ID from the user and calling 
     * the other editGuestInfo method with the input
     */
    public void editGuestInfo()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the guest ID of the guest you want to edit: ");
        int guestID = in.nextInt();
        editGuestInfo(guestID);
    }
    /**
     * this method edits a guest's info (receiving the guestID as parameter)
     * @param guestID
     */
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
        String email = in.next();
        System.out.println("Please enter the guest's credit card number:");
        String creditCardNumber = in.next();
        System.out.println("Please enter the guest's reservation number:");
        int reservationNumber = in.nextInt();
        editReservation(reservationNumber);
        guestToEdit.setFirstName(firstName);
        guestToEdit.setLastName(lastName);
        guestToEdit.setPhoneNumber(phoneNumber);
        guestToEdit.setEmail(email);
        guestToEdit.setCreditCardNumber(creditCardNumber);
        guestToEdit.setReservation(reservations.get(reservationNumber));
        System.out.println("Guest info has been updated");

    }
    /**
     * this method edits a room's info by getting the room number from the user and 
     * calling the other editRoomInfo method with the input
     */
    public void editReservation()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the reservation number of the reservation you want to edit: ");
        int reservationNumber = in.nextInt();
        editReservation(reservationNumber);
    }
    /**
     * this method edits a room's info (receiving the roomNumber as parameter)
     * @param roomNumber
     */
    public void editReservation(int reservationNumber)
    {
        if(reservations.containsKey(reservationNumber)) 
        {
            Reservation reservationToEdit = reservations.get(reservationNumber);
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
            reservationToEdit.setGuestName(lastName);
            reservationToEdit.setNumberOfGuests(numberOfGuests);
            reservationToEdit.setDuration(duration);
            reservationToEdit.setRooms(roomsToReserve);
            System.out.println("Reservation info has been updated");
        }
        else
        {
            System.out.println("Reservation number does not exist.");
        }
    }
    /**
     * this method looks up a reservation by getting the reservation number from the user and 
     * calling the other lookUpReservation method with the input
     */
    public void lookUpReservation()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the reservation number of the reservation you want to look up: ");
        int reservationNumber = in.nextInt();
        lookUpReservation(reservationNumber);
    }
    /**
     * this method looks up a reservation (receiving the reservationNumber as parameter)
     * @param reservationNumber
     */
    public void lookUpReservation(int reservationNumber)
    {
        if(reservations.containsKey(reservationNumber))
        {
            Reservation reservation = reservations.get(reservationNumber);
            System.out.println("Reservation " + reservationNumber + ": " + reservation.getGuestName() + "\nNumber of guests: " + reservation.getNumberOfGuests() + "\nDuration: " + reservation.getDuration() + " days");
            System.out.println("Rooms booked: ");
            for(Integer key : reservation.getRooms().keySet())
            {
                System.out.println("# " + key);
            }
        }
        else
        {
            System.out.println("Reservation number does not exist.");
        }
    }
    /**
     * this method prints all reservations
     */
    public void printAllReservations()
    {
        System.out.println("All current reservations: ");
        for(Integer key : reservations.keySet())
        {
            System.out.println(reservations.get(key));
        }
    }
    /**
     * this method looks up a payment by getting the payment ID from the user and calling the other 
     * lookUpPayment method with the input
     */
    public void lookUpPayment()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the payment ID of the payment you want to look up: ");
        int paymentID = in.nextInt();
        lookUpPayment(paymentID);
    }
    /**
     * this method looks up a payment (receiving the paymentID as parameter)
     * @param paymentID
     */
    public void lookUpPayment(int paymentID)
    {
        if(payments.containsKey(paymentID))
        {
            Payment payment = payments.get(paymentID);
            System.out.println("Payment " + paymentID + " with amount: " + payment.getAmountPaid() + "\nPaid with Credit card: " + payment.getCreditCardNumber());
        }
        else
        {
            System.out.println("Payment ID does not exist.");
        }
    }
    /**
     * this method prints all payments
     */
    public void printAllPayments()
    {
        System.out.println("All current payments: ");
        for(Integer key : payments.keySet())
        {
            System.out.println(payments.get(key));
        }
    }
    /**
     * this method edits an employee by getting the employee ID from the user and 
     * calling the other editEmployee method with the input
     */
    public void editEmployee()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the ID of the employee you want to edit: ");
        int employeeID = in.nextInt();
        editEmployee(employeeID);
        
    }
    /**
     * this method edits an employee (receiving the employeeID as parameter)
     * @param employeeID
     */
    public void editEmployee(int employeeID)
    {
        if(employees.containsKey(employeeID))
        {
            Employee employeeToEdit = employees.get(employeeID);
            Scanner in = new Scanner(System.in);
            System.out.println("Please enter the employee's first name:");
            String firstName = in.next();
            System.out.println("Please enter the employee's last name:");
            String lastName = in.next();
            System.out.println("Please enter the employee's address:");
            String address = in.next();
            System.out.println("Please enter the employee's phone number:");
            String phoneNumber = in.next();
            System.out.println("Please enter the employee's pay rate:");
            double payRate = in.nextDouble();
            System.out.println("Please enter the employee's shift duration:");
            int shiftDuration = in.nextInt();
            System.out.println("Please enter the employee's password:");
            String password = in.next();
            employeeToEdit.setFirstName(firstName);
            employeeToEdit.setLastName(lastName);
            employeeToEdit.setAddress(address);
            employeeToEdit.setPhoneNumber(phoneNumber);
            employeeToEdit.setPayRate(payRate);
            employeeToEdit.setShift(shiftDuration);
            employeeToEdit.setPassword(password);
            System.out.println("Employee info has been updated");
        }
        else
        {
            System.out.println("Employee ID does not exist.");
        }
    }
    /**
     * this method looks up an employee by getting the employee ID from the user and 
     * calling the other lookUpEmployee method with the input
     */
    public void lookUpEmployee()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the ID of the employee you want to look up: ");
        int employeeID = in.nextInt();
        lookUpEmployee(employeeID);
    }
    /**
     * this method looks up an employee (receiving the employeeID as parameter)
     * @param employeeID
     */
    public void lookUpEmployee(int employeeID)
    {
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
    /**
     * this method prints all employees
     */
    public void printAllEmployees()
    {
        for(Integer key : employees.keySet())
        {
            System.out.println(employees.get(key));
        }
    }
    /**
     * this method prints all guests
     */
    public void printAllGuests()
    {
        for(Integer key : allGuests.keySet())
        {
            System.out.println(allGuests.get(key));
        }
    }
    /**
     * this method calculates and prints the hotel economics 
     * i.e. the total weekly payroll expenses and the total earnings from reservations
     */
    public void printHotelEconomics()
    {
        double grandTotal = 0;
        double payForOneShift = 0;
        for(int key : payments.keySet())
        {
            Payment payment = payments.get(key);
            grandTotal += payment.getAmountPaid();
        }
        for(int employeeID : employees.keySet())
        {
            Employee employee = employees.get(employeeID);
            payForOneShift = employee.getPayRate() * employee.getShift();
        }
        double totalWeeklyPay = payForOneShift * 5;

        System.out.println("Weekly PayRoll Expenses: $" + totalWeeklyPay + " | Total earnings from reservations: " + grandTotal);
    }
}
