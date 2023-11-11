import java.util.Map;
import java.util.Scanner;
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
                System.out.print(firstAndLastName + " has a Reservation" + " for the following room(s): ");

                for(Integer RoomNum : reservation.getRooms().keySet()){
                    Room rooms = reservation.getRooms().get(RoomNum);
                    totalRoomPrice += rooms.getPricePerNight();
                    rooms.setUnavailable();
                    System.out.println(rooms.getRoomNumber() + " | Floor: " + rooms.getRoomNumber()/100);
                }

                double grandTotal = totalRoomPrice * reservation.getDuration();
                
                System.out.println("Amount due for a total of " + reservation.getDuration() + " nights is: $" + grandTotal);
                System.out.println("Enter Credit card Number: ");
                String creditCardNum = in.next();
                System.out.println("Enter amount to be paid: ");
                double payAmount = in.nextDouble();
                if(payAmount != grandTotal){
                    do{
                    grandTotal = grandTotal - payAmount;
                    System.out.println("amount due: " + grandTotal);
                    payAmount = in.nextDouble();
                }while(payAmount != grandTotal);

                }

                hotel.getGuests().get(firstAndLastName).setCreditCardNumber(creditCardNum);;
                Payment payment = new Payment(grandTotal, hotel.getGuests().get(firstAndLastName).getCreditCardNumber() );
                hotel.addPayment(payment.getPaymentID(), payment);
                System.out.println("Guest checked in");

            }
            else{

            }
        }
        else{
            System.out.println("This guest is not yet in the system. Please add guest in the 'Add New Guest' option. ");
        }
    }
    public void checkOutGuest(Hotel hotel){

        Scanner in = new Scanner(System.in);
        String firstAndLastName;
        System.out.println("Enter the guest first and last name to check out: ");
        firstAndLastName = in.nextLine();
        hotel.getGuests().remove(firstAndLastName);
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
