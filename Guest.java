
/**
 * @author Ludwig Scherer
 * @date 11-02-2023
 */

public class Guest
{
    private String firstAndLastName;
    private String phoneNumber;
    private String email;
    private String creditCardNumber;

=======
    public static int counter = 1;
    private int guestId;

    Reservation reservation;
    private static int counter = 1;

    /**
     * Constructor for objects of class Guest
     * @param firstName
     * @param lastName
     * @param phoneNumber
     * @param email
     * @param reservation
     */
    public Guest(String firstAndLastName, String phoneNumber, String email, Reservation reservation) 
    {
        this.firstAndLastName = firstAndLastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.reservation = reservation;

        guestId = counter;
        counter++;

        guestId = counter++;

    }
    public Guest(String firstAndLastName, String phoneNumber, String email) 
    {
        this.firstAndLastName = firstAndLastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        guestId = counter++;
    }
    /**
     * gets first name
     * @return
     */
    public String getFirstAndLastName() 
    {
        return firstAndLastName;
    }
    /**
     * gets phone number
     * @return
     */
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    /**
     * gets email
     * @return
     */
    public String getEmail()
    {
        return email;
    }
    /**
     * gets credit card number
     * @return
     */
    public String getCreditCardNumber()
    {
        return creditCardNumber;
    }
    /**
     * gets guest ID
     * @return
     */
    public int getGuestId()
    {

        return guestId;
    }
    /**
     * gets reservation info
     * @return
     */
    public Reservation getReservationInfo()
    {
        return reservation;
    }
    /**
     * sets first name
     * @param firstName
     */
    public void setFirstAndLastName(String firstAndLastName)
    {
        this.firstAndLastName = firstAndLastName;
    }
    /**
     * sets phone number
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    /**
     * sets email
     * @param email
     */
    public void setEmail(String email)
    {
        this.email = email;
    }
    /**
     * sets guestID
     * @param guestID
     */
    public void setGuestID(int guestID)
    {

        this.guestId = guestId;
    }
    /**
     * sets credit card number
     * @param creditCardNumber
     */
    public void setCreditCardNumber(String creditCardNumber)
    {
        this.creditCardNumber = creditCardNumber;
    }
}