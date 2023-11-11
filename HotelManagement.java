import java.util.Map;

/**
 *This program is a hotel management program
 * @author Devon
 */
public class HotelManagement 
{
    public static void main(String[] args) 
    {    
        Hotel mainHotel = new Hotel("Best Hotel Ever"); //created hotel object
        Employee employee1 = new Employee("Devon", "Alonzo", "hello", 20.34);//creating employees
        Employee employee2 = new Employee("Ludwig", "Scherer", "hi", 15);
        Employee employee3 = new Employee("Michael", "Phelps", "bye",15);
        Manager manager1 = new Manager("manager",20);//created one manager
       
        mainHotel.addEmployee(employee1);//added employees
        mainHotel.addEmployee(employee2);
        mainHotel.addEmployee(employee3);
        mainHotel.addEmployee(manager1);
        Room room1 = new Room(101, 50.00);//created room
        mainHotel.addRoom(room1);//added room to hotel

        InitialLogin initialLogin = new InitialLogin();//created initial login object
        initialLogin.displayMenu(mainHotel);//displayed initial login menu
    }
}