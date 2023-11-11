
import java.util.Map;
/**
 * @author Ludwig Scherer
 * @date 10-30-2023
 */

public class Reservation 
{
    private int reservationNumber;
    private String guestName;
    private Map<Integer, Room> rooms;
    private byte durationInDays;
    private byte numberOfGuests;

    /**
     * Constructor for objects of class Reservation
     * @param reservationNumber
     * @param guestName
     * @param rooms
     * @param duration
     */
    public Reservation(int reservationNumber, String guestName, byte numberOfGuests, Map<Integer, Room> rooms, byte duration)
    {
        this.reservationNumber = reservationNumber;
        this.guestName = guestName;
        this.rooms = rooms;
        this.durationInDays = duration;
        this.numberOfGuests = numberOfGuests;
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
        return durationInDays;
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
    public void changeDuration(byte durationInDays)
    {
        this.durationInDays = durationInDays;
    }
}
