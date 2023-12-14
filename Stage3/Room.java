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
    private int reservationNumber;
    
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
        reservationNumber = 0;
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
    /**
     * sets cleanliness to false
     */
    public void setDirty()
    {
        isClean = false;
    }
    /**
     * sets availability
     */
    public void setUnavailable()
    {
        isAvailable = false;
    }
    /**
     * sets cleanliness to true
     */
    public void clean()
    {
        isClean = true;
    }
    /**
     * sets availability
     */
    public void setAvailable()
    {
        isAvailable = true;
    }
    /**
     * sets price per night
     * @param pricePerNight
     */
    public void setPricePerNight(double pricePerNight)
    {
        this.pricePerNight = pricePerNight;
    }
    /**
     * sets room number
     * @param roomNumber
     */
    public void setRoomNumber(int roomNumber)
    {
        this.roomNumber = roomNumber;
    }
    /**
     * sets the reservation number of the room
     * @param reservationNumber
     */
    public void setReservationNumber(int reservationNumber)
    {
        this.reservationNumber = reservationNumber;
    }
    /**
     * resets the reservation number to 0
     */
    public void resetReservationNumber()
    {
        reservationNumber = 0;
    }
    public int getReservationNumber()
    {
        return reservationNumber;
    }
}
