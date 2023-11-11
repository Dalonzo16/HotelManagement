
/**
 * @author Ludwig Scherer
 * @date 10-30-2023
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Reservation 
{
    private int reservationNumber;
    private String guestName;
    private Map<Integer, Room> rooms;
    private int duration;
    public static int counter = 0;

    /**
     * Constructor for objects of class Reservation
     * @param reservationNumber
     * @param guestName
     * @param rooms
     * @param duration
     */
     public Reservation(String guestName,  int duration)
    {
        reservationNumber = counter++;
        this.guestName = guestName;
        this.duration = duration;
        rooms = new HashMap<>();
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
        return duration;
    }
    /**
     * adds room to rooms
     * @param room
     */
    public void addRoom(int roomNum, Room room)
    {
        rooms.put(roomNum, room);
    }
    /**
     * removes room from rooms
     * @param room
     */
    public void removeRoom(Room room)
    {
        rooms.remove(room);
    }
    /**
     * changes duration
     * @param duration
     */
    public void changeDuration(int duration)
    {
        this.duration = duration;
    }
}
