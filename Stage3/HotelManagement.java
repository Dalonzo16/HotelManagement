import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Random;
import java.util.HashMap;
import java.util.HashSet;
import javax.swing.JOptionPane;
/**
 *This program is a hotel management program
 * @author Devon
 */
public class HotelManagement 
{
    private static void readRooms(Hotel hotel, Sign_in_GUI gui){
        String fileName = "Rooms.csv";
        String delimiter = ",";
        
        try{
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            String line = "";
            String[] temp;
            
            while((line = br.readLine()) != null){
                temp = line.split(delimiter);
                
                String roomNumber = temp[0];
                String floorNumber = temp[1];
                String pricePerNight = temp[2];
                String isClean = temp[3];
                
                Room room = new Room(Integer.parseInt(roomNumber),Integer.parseInt(floorNumber),Double.parseDouble(pricePerNight));
                hotel.addRoom(room);
                
            }
            br.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(gui,"Error reading this file");
        }
    }
    private static void readCSV(Hotel hotel, Sign_in_GUI gui){
        String fileName = "Guests.csv";
        String delimiter = ",";
        try {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            String line = "";
            String[] temp;
            
            while((line = br.readLine()) != null){
                temp = line.split(delimiter);

                String firstName = temp[1];
                String lastName = temp[2];
                String phoneNumber = temp[3];
                String email = temp[4];
                String creditCardNum = temp[5];
                Reservation reservation = new Reservation(firstName,lastName,3,4);
                Guest guest = new Guest(firstName,lastName,phoneNumber,email, creditCardNum, reservation);
                hotel.addReservation(reservation);
                hotel.addGuest(guest);
            }
            br.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(gui,"Error reading this file");
        }
        
    }
    
    private static void readFileReservations(Hotel hotel, Sign_in_GUI gui){
        String fileName = "Reservations.txt";
        Map<Integer, Guest> guests = hotel.getAllGuests(); 
        
        try {
                
                File file = new File(fileName);
                BufferedWriter bf = new BufferedWriter(new FileWriter(file));
                int counter = 1;
                for(Map.Entry aguest : guests.entrySet()){
                    String row = "";
                    Reservation reservation = hotel.getAllGuests().get(counter).getReservation();
                    HashSet<String> roomNumbers = new HashSet<>(); 
                
                    //filling set with rooms
                    for(Integer number : reservation.getRooms().keySet()){
                        String roomNumber = String.valueOf(number);
                        roomNumbers.add(roomNumber);
                    }
                    row = String.valueOf(reservation.getReservationNumber()) + "." + reservation.getGuestFirstName() + "." + reservation.getGuestLastName() + "." + 
                            roomNumbers.toString() + "." + String.valueOf(reservation.getNumberOfGuests()) + "." + String.valueOf(reservation.getDuration()) + "\n";
                    bf.write(row);
                    counter++;
                        
                }
                bf.close();
            } catch (IOException ex) {
            JOptionPane.showMessageDialog(gui,"Error reading this file reservation");
        }
    }
    private static void readEmployeesCSV(Hotel hotel, Sign_in_GUI gui){
        String fileName = "Employees.csv";
        String delimiter = ",";
        try {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            String line = "";
            String[] temp;
            
            while((line = br.readLine()) != null){
                temp = line.split(delimiter);
                String employeeId = temp[0];
                String firstName = temp[1];
                String lastName = temp[2];
                String password = temp[3];
                String phoneNumber = temp[4];
                String payRate = temp[5];
                String address = temp[6];
                String hours = temp[7];
                
                Employee employee = new Employee(firstName,lastName,password,Double.parseDouble(payRate));
                employee.setShift(Double.parseDouble(hours));
                employee.setAddress(address);
                employee.setPhoneNumber(phoneNumber);
                hotel.addEmployee(employee);
                
            }
            br.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(gui,"Error reading this file");
        }
        
    }
    public static void main(String[] args) 
    {    
        Hotel mainHotel = new Hotel("Best Hotel Ever"); //created hotel object
 

       // Reservation reservation1 = new Reservation("Alonzo", numberOfGuests, reservedRooms, duration); //created reservations
        //Reservation reservation2 = new Reservation("Scherer", numberOfGuests, reservedRooms2, duration);
        
        //mainHotel.addReservation(reservation1); //add objects to hotel
        //mainHotel.addReservation(reservation2);

   

        //Guest guest1 = new Guest("Devon", "Alonzo", "(555) 5555-555", "hello@gmail.com", "4587345160345", reservation1);//created guests
        //Guest guest2 = new Guest("Ludwig", "Scherer", "(555) 5555-555", "bye@yahoo.com", "8924572371430", reservation2);
        
        //mainHotel.addGuest(guest1);//added guests to hotel
        //mainHotel.addGuest(guest2);
        
        Sign_in_GUI GUI = new Sign_in_GUI(mainHotel);
        GUI.setVisible(true);
        readEmployeesCSV(mainHotel, GUI);
        readRooms(mainHotel,GUI);
        readCSV(mainHotel,GUI);
        readFileReservations(mainHotel,GUI);
        Room room1 = mainHotel.getRooms().get(1);
        Room room2 = mainHotel.getRooms().get(14);
        Room room3 = mainHotel.getRooms().get(4);
        System.out.println(room3);
        System.out.println(room2);
        System.out.println(room1);
        mainHotel.getAllGuests().get(1).getReservation().addRoom(room1);
        mainHotel.getAllGuests().get(2).getReservation().addRoom(room2);
        mainHotel.getAllGuests().get(3).getReservation().addRoom(room3);
        room1.setReservationNumber(1);
        room2.setReservationNumber(2);
        room3.setReservationNumber(3);
        mainHotel.addReservedRoom(room1.getRoomNumber());
        mainHotel.addReservedRoom(room2.getRoomNumber());
        mainHotel.addReservedRoom(room3.getRoomNumber());
        mainHotel.getRooms().get(1).setUnavailable();
        mainHotel.getRooms().get(14).setUnavailable();
        mainHotel.getRooms().get(4).setUnavailable();
        mainHotel.removeRoom(1);
        mainHotel.removeRoom(14);
        mainHotel.removeRoom(4);
        mainHotel.getAllGuests().get(1).setCheckedIn(true);
        mainHotel.getAllGuests().get(2).setCheckedIn(true);
        mainHotel.getAllGuests().get(3).setCheckedIn(true);
        InitialLogin initialLogin = new InitialLogin();//created initial login object
        initialLogin.displayMenu(mainHotel);//displayed initial login menu
        
        
    }
}
