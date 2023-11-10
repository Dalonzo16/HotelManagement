
/**
 * @author Ludwig Scherer
 * @date 10-30-2023
 */

public class Room 
{
    private int roomNumber;
    private double pricePerNight;
    private boolean isAvailable;
    private boolean isClean;
    
    /**
     * Constructor for objects of class Room
     * @param roomNumber
     * @param pricePerNight
     */
    public Room(int roomNumber, double pricePerNight)
    {
        this.roomNumber = roomNumber;
        this.pricePerNight = pricePerNight;
        isAvailable = true;
    }
    /**
     * gets room number
     * @return
     */
    public int getRoomNumber()
    {
        return roomNumber;
    }
    /**
     * gets price per night
     * @return
     */
    public double getPricePerNight()
    {
        return pricePerNight;
    }
    /**
     * gets availability
     * @return
     */
    public boolean getIsAvailable()
    {
        return isAvailable;
    }
    /**
     * gets cleanliness
     * @return
     */
    public boolean getIsClean()
    {
        return isClean;
    }
}
