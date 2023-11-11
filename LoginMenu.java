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
    }
    /**
     * This is the checkUserCredentials method it checks the user input to make sure the ID exists and the password is correct recieves a list of employees
     * @param employees a list of employees
     */
    public void checkUserCredentials(Map<Integer, Employee> employees)
    {
        if(employees.get(employeeId) != null && employees.get(employeeId).getPassword().equals(password)){
             valid = true;
        }
        else if(employees.get(employeeId) == null){
            System.out.println("Employee ID does not exist");
        }
        else{
            System.out.println("Employee ID or password incorrect");
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
