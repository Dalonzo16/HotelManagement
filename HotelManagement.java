import java.util.Random;
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
       
        mainHotel.addEmployee(employee1);//added employees
        mainHotel.addEmployee(employee2);
        mainHotel.addEmployee(employee3);
        mainHotel.addEmployee(reseptionist1);
        mainHotel.addEmployee(manager1);

        InitialLogin initialLogin = new InitialLogin();//created initial login object
        initialLogin.displayMenu(mainHotel);//displayed initial login menu
    }
}