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
public class ReportsMenu extends Menu {
    private byte userSelection;
    
    @Override
    public void displayMenu(){
        Scanner in = new Scanner(System.in);
        System.out.println("=============================");
        System.out.println("| 1. Show Payment Reports   |");
        System.out.println("| 2. Back to main menu      |");
        System.out.println("=============================");
        this.userSelection = in.nextByte();
    }

    public void checkInput() {
        if(userSelection == 1){
            System.out.println("print payments");
        }

    }

    @Override
    public byte getUserSelection() {
        return userSelection;
    }
    

        
    
}