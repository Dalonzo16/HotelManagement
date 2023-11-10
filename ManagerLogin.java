import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *This is the ManagerLogin class a child class of LoginMenu
 * @author Devon
 */
public class ManagerLogin extends LoginMenu 
{
    
    private int managerId;
    private String password;
    private boolean valid = false;
    
    @Override
    public void displayLogin()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("    Manager Credentials required   ");
        System.out.print("Manager ID:    ");
        managerId = in.nextInt();
        System.out.print("Password:    ");
        password = in.next();
    }
    /**
     * This is the checkManagerCredentials method it checks employees list to see if the user input is of type Manager if not it will display a message and ask again
     */
    public void checkManagerCredentials(Map<Integer, Employee> employees)
    {
        Set<Integer> keySet = employees.keySet();
        if(keySet.contains(managerId))
        {
            if(employees.get(managerId) instanceof Manager)
            {
                if(employees.get(managerId).getPassword() == password)
                {
                    valid = true;
                }
                else
                {
                    System.out.println("Incorrect password.");
                }
            }
            else
            {
                System.out.println("ID not authorized for access.");
            }
        }
        else
        {
            System.out.println("ID does not exist.");
        }   
    }
    @Override
    public boolean isValid()
    {
        return valid;
    } 
}
