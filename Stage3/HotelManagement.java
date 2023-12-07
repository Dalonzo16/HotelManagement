import java.util.Map;
import java.util.Random;
import java.util.HashMap;
/**
 *This program is a hotel management program
 * @author Devon
 */
public class HotelManagement 
{
    public static void main(String[] args) 
    {    
        Random random = new Random();
        Hotel mainHotel = new Hotel("Best Hotel Ever"); //created hotel object

        for(int i = 0; i < 20; i++)
        {
            Room room = new Room(random.nextInt(100, 400), (double) Math.round(random.nextDouble(40, 200)*100)/100);
            mainHotel.addRoom(room);
        }
        
        Employee employee1 = new Employee("Devon", "Alonzo", "hello", 20.34);//creating employees
        Employee employee2 = new Employee("Ludwig", "Scherer", "hi", 15);
        Employee employee3 = new Employee("Michael", "Phelps", "bye",15);
        Employee reseptionist1 = new Receptionist("Lionel", "Messi", "goat", 100);
        Employee manager1 = new Manager("Eduardo", "Ceh-Varela", "master",20);//created one manager

        employee1.setShift(8);
        employee2.setShift(8);
        employee3.setShift(8);
        reseptionist1.setShift(8);
        manager1.setShift(8);
        
        Room room1 = new Room(100, 100.00);//created rooms for reserved rooms
        Room room2 = new Room(204, 70.00);
        Room room3 = new Room(305, 70.00);
        Room room4 = new Room(203, 150.00);

        Map<Integer, Room> reservedRooms = new HashMap<Integer, Room>(); //created maps for reserved rooms for guest objects
        Map<Integer, Room> reservedRooms2 = new HashMap<Integer, Room>();

        reservedRooms.put(204, room1);
        reservedRooms.put(204, room2);
        reservedRooms2.put(305, room3);
        reservedRooms2.put(203, room4);
        

        byte duration = 3;
        byte numberOfGuests = 2;

        Reservation reservation1 = new Reservation("Alonzo", numberOfGuests, reservedRooms, duration); //created reservations
        Reservation reservation2 = new Reservation("Scherer", numberOfGuests, reservedRooms2, duration);
        
        mainHotel.addReservation(reservation1); //add objects to hotel
        mainHotel.addReservation(reservation2);
        mainHotel.addEmployee(employee1);
        mainHotel.addEmployee(employee2);
        mainHotel.addEmployee(employee3);
        mainHotel.addEmployee(reseptionist1);
        mainHotel.addEmployee(manager1);
        mainHotel.addRoom(room1);
        mainHotel.addRoom(room2);
        mainHotel.addRoom(room3);
        mainHotel.addRoom(room4);

        Guest guest1 = new Guest("Devon", "Alonzo", "(555) 5555-555", "hello@gmail.com", "4587345160345", reservation1);//created guests
        Guest guest2 = new Guest("Ludwig", "Scherer", "(555) 5555-555", "bye@yahoo.com", "8924572371430", reservation2);
        
        mainHotel.addGuest(guest1);//added guests to hotel
        mainHotel.addGuest(guest2);
        room1.setUnavailable(); // sets room unavailable since hard coded guests "skip" the check in
        room2.setUnavailable();
        room3.setUnavailable();
        room4.setUnavailable();
        Payment payment1 = new Payment(100, "4587345160345"); //created payments and set as paid also because hardcoded guests skip the check in
        Payment payment2 = new Payment(100, "8924572371430");
        payment1.setAmountPaid(510);
        payment2.setAmountPaid(660);
        mainHotel.addPayment(payment1); //added payments to hotel
        mainHotel.addPayment(payment2);

        InitialLogin initialLogin = new InitialLogin();//created initial login object
        initialLogin.displayMenu(mainHotel);//displayed initial login menu
    }
}
