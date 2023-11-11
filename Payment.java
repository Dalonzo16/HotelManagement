
/**
 * @author Ludwig Scherer
 * @date 11-02-2023
 */

public class Payment 
{
    private double amountDue;
    private double amountPaid;
    private String creditCardNumber;
    private int paymentID;
    private static int counter = 1;

    /**
     * Constructor for objects of class Payment
     * @param amountDue
     * @param creditCardNumber
     */
    public Payment(double amountDue, String creditCardNumber) 
    {
        this.amountDue = amountDue;
        this.creditCardNumber = creditCardNumber;
        amountPaid = 0;
        paymentID = counter;
        counter++;
    }
    /**
     * gets amount due
     * @return
     */
    public double getAmountDue()
    {
        return amountDue;
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
     * gets amount paid
     * @return
     */
    public double getAmountPaid()
    {
        return amountPaid;
    }
    public int getPaymentID()
    {
        return paymentID;
    }
    /**
     * sets amount due
     * @param amountDue
     */
    public void setAmountDue(double amountDue)
    {
        this.amountDue = amountDue;
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
     * sets amount paid
     * @param amountPaid
     */
    public void setAmountPaid(double amountPaid)
    {
        this.amountPaid = amountPaid;
    }
}
