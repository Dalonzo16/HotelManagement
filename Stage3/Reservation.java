import java.util.Map;
/**
 * @author Ludwig Scherer
 * @date 11-12-2023
 */

public class Reservation 
{
    private int reservationNumber;
    private String guestFirstName;
    private String guestLastName;
    private Map<Integer, Room> rooms;
    private byte durationInNights;
    private byte numberOfGuests;
    private static int counter = 1;

    /**
     * Constructor for objects of class Reservation
     * @param firstName
     * @param lastName
     * @param numberOfGuests
     * @param rooms
     * @param duration
     */
    public Reservation(String firstName, String lastName, byte numberOfGuests, Map<Integer, Room> rooms, byte duration)
    {
        this.reservationNumber = counter;
        this.guestFirstName = firstName;
        this.guestLastName = lastName;
        this.rooms = rooms;
        this.durationInNights = duration;
        this.numberOfGuests = numberOfGuests;
        System.out.println("The new reservation for " + guestFirstName + " was created with reservation number: " + reservationNumber + " and duration: " + duration + " nights.");
        counter++;
    }
    /**
     * gets reservation number
     * @return
     */
    public int getReservationNumber()
    {
        return reservationNumber;
    }
    /**
     * gets guest name
     * @return
     */
    public String getGuestFirstName()
    {
        return guestFirstName;
    }
    public String getGuestLastName(){
        return guestLastName;
    }
    /**
     * gets rooms
     * @return
     */
    public Map<Integer, Room> getRooms()
    {
        return rooms;
    }
    /**
     * gets duration
     * @return
     */
    public int getDuration()
    {
        return durationInNights;
    }
    /**
     * adds room to rooms
     * @param room
     */
    public void addRoom(Room room)
    {
        rooms.put(room.getRoomNumber(), room);
    }
    /**
     * removes room from rooms
     * @param room
     */
    public void removeRoom(Room room)
    {
        rooms.remove(room.getRoomNumber());
    }
    /**
     * changes duration
     * @param duration
     */
    public void setDuration(byte durationInNights)
    {
        this.durationInNights = durationInNights;
    }
    /**
     * sets guest name
     * @param guestName
     */
    public void setfirstName(String firstName)
    {
        this.guestFirstName = firstName;
    }
    public void setLastName(String lastName){
        this.guestLastName = lastName;
    }
    /**
     * sets number of guests
     * @param numberOfGuests
     */
    public void setNumberOfGuests(byte numberOfGuests)
    {
        this.numberOfGuests = numberOfGuests;
    }
    /**
     * gets number of guests
     * @return
     */
    public byte getNumberOfGuests()
    {
        return numberOfGuests;
    }
    /**
     * sets rooms
     * @param rooms
     */
    public void setRooms(Map<Integer, Room> rooms)
    {
        this.rooms = rooms;
    }
    /**
     * sets reservation number
     * @param reservationNumber
     */
    public void setReservationNumber(int reservationNumber)
    {
        this.reservationNumber = reservationNumber;
    }
}
