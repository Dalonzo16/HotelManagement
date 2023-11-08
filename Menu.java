/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package hotelmanagement;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *This is the Menu class it is the main menu and is a parent class to all of the options in the menu
 * @author Devon Alonzo
 * @date 11-8-2023
 */
public class Menu {
    
    private byte userSelection;
    private byte quitOption;
    
    public Menu(){
        this.quitOption = 6;
    }
    /**\
     * This is the displayMenu method it displays the menu options and recieves the user input
     */
    public void displayMenu(){
        Scanner in = new Scanner(System.in);
        System.out.println("=============================================================================");
        System.out.println("|   Welcome to Hotel Mangement. Please select one of the following options  |");
        System.out.println("=============================================================================\n");
        System.out.println("=====================");
        System.out.println("| 1. Guests         |");
        System.out.println("| 2. Rooms          |");
        System.out.println("| 3. Reservations   |");
        System.out.println("| 4. Employees      |");
        System.out.println("| 5. Reports        |");
        System.out.println("| 6. Quit           |");
        System.out.println("=====================");
        this.userSelection = in.nextByte();
    }
    /**
     * This is the checkInput method it creates a new object of whatever submenu is seleted. it recieves a list of rooms that is recieved in case 2 and it recieves a list of employees in case 4
     * @param rooms a list of rooms
     * @param managers a list of employees
     */
    public void checkInput(ArrayList<Room> rooms, ArrayList<Employee> managers){
        switch(userSelection){
            case 1:
                GuestsMenu option1 = new GuestsMenu(); //created object of type Guestsmenu it is a submenu
                do{
                    option1.displayMenu(); // a do while loop that keeps showing the options unitl the quit option is selected
                    option1.checkInput();
                }while(option1.getUserSelection() != 7);
            break;
            case 2:
                RoomsMenu option2 = new RoomsMenu();
                do{
                    option2.displayMenu();
                    option2.checkInput(rooms);
                }while(option2.getUserSelection() != 3);
            break;
            case 3:
                ReservationMenu option3 = new ReservationMenu();
                do{
                    option3.displayMenu();
                    option3.checkInput();
                }while(option3.getUserSelection() != 5);
                
            case 4:
                EmployeesMenu option4= new EmployeesMenu();
                ManagerLogin manager = new ManagerLogin();
                do{
                    manager.displayLogin();
                    manager.checkManagerCredentials(managers);
                }while(!manager.isValid());
                do{
                    option4.displayMenu();
                    option4.checkInput();
                }while(option4.getUserSelection() != 5);
            break;
            case 5:
                ReportsMenu option5 = new ReportsMenu();
                do{
                    option5.displayMenu();
                    option5.checkInput();
                }while(option5.getUserSelection() != 2);
        }
    }
    /**
     * this method gets the user selection
     * @return the users selection
     */
    public byte getUserSelection(){
        return userSelection;
    }
    /**
     * This method gets the quit option
     * @return the quit option
     */
    public byte getQuitOption() {
        return quitOption;
    }
    
    
}
    
