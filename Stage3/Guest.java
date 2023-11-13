
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
    private int guestID;
    private Reservation reservation;
    private static int counter = 1;

    /**
     * Constructor for objects of class Guest
     * @param firstName
     * @param lastName
     * @param phoneNumber
     * @param email
     * @param creditCardNumber
     * @param reservation
     */
    public Guest(String firstName, String lastName, String phoneNumber, String email, String creditCardNumber, Reservation reservation) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.reservation = reservation;
        this.creditCardNumber = creditCardNumber;
        this.guestID = counter;
        System.out.println("The guest " + firstName + " " + lastName + " was added with guest ID: " + guestID);
        counter++;
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
        return guestID;
    }
    /**
     * gets reservation info
     * @return
     */
    public Reservation getReservation()
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
     * sets guestID
     * @param guestID
     */
    public void setGuestID(int guestID)
    {
        this.guestID = guestID;
    }
    /**
     * sets reservation
     * @param reservation
     */
    public void setReservation(Reservation reservation)
    {
        this.reservation = reservation;
    }
    /**
     * sets credit card number
     * @param creditCardNumber
     */
    public void setCreditCardNumber(String creditCardNumber)
    {
        this.creditCardNumber = creditCardNumber;
    }
    /**
     * gets reservation number
     * @return
     */
    public int getReservationNumber()
    {
        return reservation.getReservationNumber();
    }
}
