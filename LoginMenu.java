import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Devon
 */
public class LoginMenu {
    
    private int employeeId;
    private String password;
    private boolean valid = false;
    
    public void displayLogin(){
        Scanner in = new Scanner(System.in);
        System.out.println("    Sign in     ");
        System.out.print("Employee ID:    ");
        employeeId = in.nextInt();
        System.out.print("Password:    ");
        password = in.next();
        
    }
    
    public void checkUserCredentials(ArrayList<Employee> employees){
        for(Employee anEmployee : employees){
            if(anEmployee.getEmployeeId() == employeeId  && anEmployee.getPassword().equals(password)){
                valid = true;
                break;
            }
            
            if(anEmployee.getPassword().equals(password)){
                System.out.println("Employee ID does not exist");
                
            }
            if(anEmployee.getEmployeeId() == employeeId){
                System.out.println("Password incorrect");
            }
        }
    }
    
    public boolean isValid(){
        return valid;
    }
    
    public String getPassword(){
        return password;
    }
    
    
    
}
