import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *This is the ManagerLogin class a child class of LoginMenu
 * @author Devon
 */
public class ManagerLogin extends LoginMenu {
    
    private int managerId;
    private String password;
    private boolean valid = false;
    
    @Override
    public void displayLogin(){
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
    public void checkManagerCredentials(Map<Integer, Employee> employees){
        for(Employee anEmployee : employees){
            if(managerId == anEmployee.getEmployeeId() && password.equals(anEmployee.getPassword()) && anEmployee instanceof Manager){
                valid = true;
                break;
            }
            if(managerId == anEmployee.getEmployeeId() && !(anEmployee instanceof Manager)){
                System.out.println("Invalid Authority. Please try again: ");
                break;
            }
            else if(managerId == anEmployee.getEmployeeId()){
                System.out.println("Manager ID or password incorrect");
            }
                
        }
    }

    @Override
    public boolean isValid() {
        return valid;
    }
    
    
}
