import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
/**
 *This is the Receptionsist class
 * @author Devon Alonzo
 * @date 11-8-2023
 */
public class Receptionist extends Employee{
    public Receptionist(String password, int payRate){ // need to add new methods
        super(password, payRate);
    }
    /**
     * This method checks in a guest into the hotel
     * @param hotel the hotel
     */
    public void checkInGuest(Hotel hotel){
        String firstAndLastName;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter guests first and last name");
        firstAndLastName = in.nextLine();
        Guest theGuest = checkGuestExists(firstAndLastName, hotel.getGuests());
        if(checkGuestExists(firstAndLastName, hotel.getGuests()) != null){
             Reservation reservation = hasReservation(theGuest);
            if(reservation != null){
                double totalRoomPrice = 0; 
                for(Integer RoomNum : reservation.getRooms().keySet()){
                    Room rooms = reservation.getRooms().get(RoomNum);
                    totalRoomPrice += rooms.getPricePerNight();
                }
                double grandTotal = totalRoomPrice * reservation.getDuration();
                System.out.println(firstAndLastName + "has a Reservation" + " for the following room(s)");
                for(Integer RoomNum : reservation.getRooms().keySet()){
                    Room rooms = reservation.getRooms().get(RoomNum);
                    System.out.print(" " + rooms.getRoomNumber() + " ");
                }
            }
            else{

            }
        }
        else{
            System.out.println("This guest is not yet in the system. Please add guest in the 'Add New Guest' option. ");
        }
    }
    /**
     * This method checks to see if a guest exists in the hotel system
     * @param firstAndLastNamem the guests first and last name
     * @param guests all guests in the hotel
     * @return the guest that has been entered
     */
     private Guest checkGuestExists(String firstAndLastName, Map<String, Guest> guests){
        Guest guest = guests.get(firstAndLastName);
        return guest;
    }
    /**
     * This method check to see if the guest has a reservation
     * @param guest the guest
     * @return reservation number
     */
    private Reservation hasReservation(Guest guest){
        Reservation reservation = guest.getReservationInfo();
        return reservation;
    }
}
