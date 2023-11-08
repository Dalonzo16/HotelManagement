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
public class RoomsMenu extends Menu{
    private byte userSelection;

    @Override
    public void displayMenu() {
        Scanner in = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("| 1. Available Rooms          |");
        System.out.println("| 2. Search Room Information  |");
        System.out.println("| 3. Back to main menu        |");
        System.out.println("===============================");
        this.userSelection = in.nextByte();
    }
    
    /**
     *
     * @param theHotel
     */
    public void checkInput(ArrayList<Room> rooms){
        
        switch(this.userSelection){
            
            case 1:
                for(Room allRooms : rooms){
                    System.out.println("Room Number: "+ allRooms.getRoomNumber());
                }
            break;
            case 2:
                int roomNumber;
                System.out.println("Enter the room number you want to search");
                Scanner in = new Scanner(System.in);
                roomNumber = in.nextInt();
                for(Room allRooms : rooms){
                    if(allRooms.getRoomNumber() == roomNumber){
                        System.out.println("Floor: " + allRooms.getFloorNumber() + " | Room Number: " + allRooms.getRoomNumber() + " | $"+ allRooms.getPricePerNight() + " per night | ");
                        break;
                    }
                }
        }
    }

    public byte getUserSelection() {
        return userSelection;
    }
    
    
    
}
