/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package hotelmanagement;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
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
    
    public void checkManagerCredentials(ArrayList<Employee> employees){
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