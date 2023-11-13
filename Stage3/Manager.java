/**
 *This is the Manager class a child class of Employee
 * @author Devon Alonzo
 * @date 11-8-2023
 */
public class Manager extends Employee 
{
    /** 
     * This is a constructor method it initializes manager pass word and pay rate
     * @param firstName manager first name
     * @param lastName manager last name
     * @param password manager password
     * @param payRate manager pay rate
    */
    public Manager(String firstName, String lastName, String password, int payRate)
    {
        super(firstName, lastName, password, payRate);
    }
}
