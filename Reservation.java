import java.util.Map;
/**
 * @author Ludwig Scherer
 * @date 11-12-2023
 */

public class Reservation 
{
    private int reservationNumber;
    private String guestName;
    private Map<Integer, Room> rooms;
    private byte durationInNights;
    private byte numberOfGuests;
    private static int counter = 1;

    /**
     * Constructor for objects of class Reservation
     * @param numberOfGuests
     * @param guestName
     * @param rooms
     * @param duration
     */
    public Reservation(String guestName, byte numberOfGuests, Map<Integer, Room> rooms, byte duration)
    {
        this.reservationNumber = counter;
        this.guestName = guestName;
        this.rooms = rooms;
        this.durationInNights = duration;
        this.numberOfGuests = numberOfGuests;
        System.out.println("The new reservation for " + guestName + " was created with reservation number: " + reservationNumber + " and duration: " + duration + " nights.");
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
    public String getGuestName()
    {
        return guestName;
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
    public void setGuestName(String guestName)
    {
        this.guestName = guestName;
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
