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
        System.out.println("The room " + roomNumber + " was successfully created. Its price per night is: " + pricePerNight);
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
     * gets availability of room
     * @return
     */
    public boolean isAvailable()
    {
        return isAvailable;
    }
    /**
     * gets cleanliness
     * @return
     */
    public boolean isClean()
    {
        return isClean;
    }
    public void setDirty()
    {
        isClean = false;
    }
    public void setUnavailable()
    {
        isAvailable = false;
    }
    public void clean()
    {
        isClean = true;
    }
    public void setAvailable()
    {
        isAvailable = true;
    }
}
