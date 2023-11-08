/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package hotelmanagement;

import java.util.Scanner;

/**
 *This is the ReservationsMenu class another child class of Menu
 * @author Devon Alonzo
 * @date 11-8-2023
 */
public class ReservationMenu extends Menu {
    private byte userSelection;
    @Override
    public void displayMenu(){
        Scanner in = new Scanner(System.in);
        System.out.println("=========================");
        System.out.println("| 1. Create Reservation |");
        System.out.println("| 2. Edit Reservation   |");
        System.out.println("| 3. Cancel Reservation |");
        System.out.println("| 4. Search Reservation |");
        System.out.println("| 5. Back to main menu  |");
        System.out.println("=========================");
        this.userSelection = in.nextByte();
    }
    /**
     * This is eh checkInput method there is no computations yet
     */
    public void checkInput(){
        switch(userSelection){
            case 1:
                System.out.println("created");
            break;
            case 2:
                System.out.println("edited");
            break;
            case 3:
                System.out.println("canceled");
            break;
            case 4:
                System.out.println("searched");
            break;
        }
    }
    
    @Override
    public byte getUserSelection() {
        return userSelection;
    }
    
}
