/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package hotelmanagement;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *This is the EmployeesMenu another child class of Menu
 * @author Devon Alonzo
 * @date 11-8-2023
 */
public class EmployeesMenu extends Menu{
    private byte userSelection;

    @Override
    public void displayMenu() {
        Scanner in = new Scanner(System.in);
        System.out.println("===================================");
        System.out.println("| 1. Create New Employee          |");
        System.out.println("| 2. Remove Employee              |");
        System.out.println("| 3. Search Employee Information  |");
        System.out.println("| 4. View All Employees           |");
        System.out.println("| 5. Back to main menu                         |");
        System.out.println("===================================");
        this.userSelection = in.nextByte();
    }
    /**
     * This is the checkInput method there is no computations yet
     */
    public void checkInput() {
        switch(userSelection){
            case 1:
                
            break;
            
            case 2:
            
            break;
            
            case 3:
            break;
            
            case 4:
            break;
        }
    }

    @Override
    public byte getUserSelection() {
        return userSelection;
    }
    
    
    
    
    
}
