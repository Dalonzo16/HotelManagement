import java.util.Map;
import java.util.Scanner;
/**
 *This is the LoginMenu class it is a parent class
 * @author Devon Alonzo
 * @date 11-8-2023
 */
public class LoginMenu 
{
    private int employeeId;
    private String password;
    private boolean valid = false;
    /**
     * this is the displayLogin method it displays the login messages and recieves the user input
     */
    public void displayLogin()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("    Sign in     ");
        System.out.print("Employee ID:    ");
        employeeId = in.nextInt();
        System.out.print("Password:    ");
        password = in.next();
        in.close();
    }
    /**
     * This is the checkUserCredentials method it checks the user input to make sure the ID exists and the password is correct recieves a list of employees
     * @param employees a list of employees
     */
    public void checkUserCredentials(Map<Integer, Employee> employees)
    {
        Employee currentEmployee;
        for(Integer key : employees.keySet())//for each loop to check if credentials are valid
        {
            currentEmployee = employees.get(key);
            if(currentEmployee.getEmployeeId() == employeeId  && currentEmployee.getPassword().equals(password))
            {
                valid = true; //valid is true if ID matches and password matches
                break;
            }
            if(currentEmployee.getPassword().equals(password))
            {
                System.out.println("Employee ID does not exist");
                
            }
            if(currentEmployee.getEmployeeId() == employeeId)
            {
                System.out.println("Password incorrect");
            }
        }
    }
    /**
     * This method returns value of valid
     * @return the valid value
     */
    public boolean isValid()
    {
        return valid;
    }
}
