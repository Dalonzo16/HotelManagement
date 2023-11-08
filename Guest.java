
/**
 * @author Ludwig Scherer
 * @date 11-02-2023
 */

public class Guest
{
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String creditCardNumber;
    private int GuestID;
    Reservation reservation;

    /**
     * Constructor for objects of class Guest
     * @param firstName
     * @param lastName
     * @param phoneNumber
     * @param email
     * @param reservation
     */
    public Guest(String firstName, String lastName, String phoneNumber, String email, Reservation reservation) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.reservation = reservation;
    }
    /**
     * gets first name
     * @return
     */
    public String getFirstName() 
    {
        return firstName;
    }
    /**
     * gets last name
     * @return
     */
    public String getLastName()
    {
        return lastName;
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
    public int getGuestID()
    {
        return GuestID;
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
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    /**
     * sets last name
     * @param lastName
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
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
     * sets GuestID
     * @param GuestID
     */
    public void setGuestID(int GuestID)
    {
        this.GuestID = GuestID;
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