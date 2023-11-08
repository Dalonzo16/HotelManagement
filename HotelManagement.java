/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//package hotelmanagement;

import java.util.ArrayList;



/**
 *This program is a hotel management program
 * @author Devon
 */
public class HotelManagement {
    /**
     * This method calls the methods from login menu to execute and recieves a hotel and an object login
     * @param login an object of LoginMenu
     * @param hotel an object of Hotel
     */
    public static void Login(LoginMenu login, Hotel hotel){
        do{//do while loop to keep asking user for input until info is correct
            login.displayLogin();
            login.checkUserCredentials(hotel.getEmployees());
        }
        while(login.isValid() == false);
    }
    /**
     * This method calls the main menu methods to display the menu options and take in the inputs
     * @param aMenu an object of Menu
     * @param option the quit option for the main menu
     * @param rooms a list of rooms
     * @param managers a list of employees
     */
    public static void menus(Menu aMenu, byte option, ArrayList<Room> rooms, ArrayList<Employee> managers){
        do{
            aMenu.displayMenu();
            aMenu.checkInput(rooms, managers);
        }
        while(aMenu.getUserSelection() != option);
    }
    /**
     * This is the main method
     * @param args a list of command line arguments
     */
    public static void main(String[] args) {
        
        Hotel mainHotel = new Hotel(); //created hotel object
        Employee employee1 = new Employee("hello", 15);//creating employees
        Employee employee2 = new Employee("hi", 15);
        Employee employee3 = new Employee("bye",15);
        Manager manager1 = new Manager("manager",20);//created one manager
       
        mainHotel.addEmployees(employee1);//added employees
        mainHotel.addEmployees(employee2);
        mainHotel.addEmployees(employee3);
        mainHotel.addEmployees(manager1);
        Room room1 = new Room(1, 1, 50.00);//created room
        mainHotel.addRoom(room1);//added room to hotel

        LoginMenu login = new LoginMenu();//created login object
        Login(login,mainHotel); // calling methods created above to execute
        Menu main = new Menu();
        menus(main, main.getQuitOption(), mainHotel.getRooms(), mainHotel.getEmployees());
        
        
    }
        

    
}
