
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
    Reservation reservation;

    /**
     * Constructor for objects of class Guest
     * @param firstAndLastName
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
        System.out.println("The guest " + firstAndLastName + " was added");
    }
    /**
     * gets first and last name
     * @return
     */
    public String getfirstAndLastName(){
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
     * gets reservation info
     * @return
     */
    public Reservation getReservationInfo()
    {
        return reservation;
    }
    /**
     * sets first and last name
     * @param firstName
     */
    public void setFirstAndLastName(String name)
    {
        firstAndLastName = name;
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
     * sets credit card number
     * @param creditCardNumber
     */
    public void setCreditCardNumber(String creditCardNumber)
    {
        this.creditCardNumber = creditCardNumber;
    }
}