import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;



/**
 *This program is a hotel management program
 * @author Devon
 */
public class HotelManagement {
    
    /**
     * This method calls the main menu methods to display the menu options and take in the inputs
     * @param aMenu an object of Menu
     * @param option the quit option for the main menu
     * @param rooms a list of rooms
     * @param managers a list of employees
     */
    public static void menus(Menu aMenu, byte option, Hotel hotel, Receptionist anEmployee){
        do{
            aMenu.displayMenu();
            aMenu.checkInput(hotel, anEmployee);
        }
        while(aMenu.getUserSelection() != option);
    }
    /**
     * This is the main method
     * @param args a list of command line arguments
     */
    public static void main(String[] args) {
        
        Hotel mainHotel = new Hotel("LD Hotel"); //created hotel object
        Receptionist employee1 = new Receptionist("hello", 12);//creating employees
        Employee employee2 = new Employee("hi", 15);
        Employee employee3 = new Employee("bye",15);
        Manager manager1 = new Manager("manager",20);//created one manager
        
       
        mainHotel.addEmployees(employee1);//added employees
        mainHotel.addEmployees(employee2);
        mainHotel.addEmployees(employee3);
        mainHotel.addEmployees(manager1);
        Room room1 = new Room(1,  50.00);//created room
        mainHotel.addAvailableRoom(room1);//added room to hotel

        Reservation reservation1 = new Reservation("Bob", 2);
        reservation1.addRoom(room1);
        Guest guest1 = new Guest("Bob Lashley", "5758462145", "bobLash@gmail.com", reservation1);
        mainHotel.addGuest("Bob Lashley", guest1);

        Menu main = new Menu();
        menus(main, main.getQuitOption(), mainHotel, employee1);
        
        
    }
        

    
}
