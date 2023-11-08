/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//package hotelmanagement;

import java.util.ArrayList;



/**
 *
 * @author Devon
 */
public class HotelManagement {
    
    public static void Login(LoginMenu login, Hotel hotel){
        do{
            login.displayLogin();
            login.checkUserCredentials(hotel.getEmployees());
        }
        while(login.isValid() == false);
    }

    public static void menus(Menu aMenu, byte option, ArrayList<Room> rooms, ArrayList<Employee> managers){
        do{
            aMenu.displayMenu();
            aMenu.checkInput(rooms, managers);
        }
        while(aMenu.getUserSelection() != option);
    }
    
    public static void main(String[] args) {
        
        Hotel mainHotel = new Hotel();
        Employee employee1 = new Employee("hello", 15);
        Employee employee2 = new Employee("hi", 15);
        Employee employee3 = new Employee("bye",15);
        Manager manager1 = new Manager("manager",20);
       
        mainHotel.addEmployees(employee1);
        mainHotel.addEmployees(employee2);
        mainHotel.addEmployees(employee3);
        mainHotel.addEmployees(manager1);
        Room room1 = new Room(1, 1, 50.00);
        mainHotel.addRoom(room1);

        LoginMenu login = new LoginMenu();
        Login(login,mainHotel);
        Menu main = new Menu();
        menus(main, main.getQuitOption(), mainHotel.getRooms(), mainHotel.getEmployees());
        
        
    }
        

    
}