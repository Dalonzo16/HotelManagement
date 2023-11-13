package Stage3;
/**
 *This is the Receptionsist class
 * @author Devon Alonzo
 * @date 11-8-2023
 */
public class Receptionist extends Employee
{
    /**
     * This is a constructor method it initializes receptionist pass word and pay rate
     * @param firstName receptionist first name
     * @param lastName receptionist last name
     * @param password receptionist password
     * @param payRate receptionist pay rate
     */ 
    public Receptionist(String firstName, String lastName, String password, double payRate)// need to add new methods
    { 
        super(firstName, lastName, password, payRate);
    }
}