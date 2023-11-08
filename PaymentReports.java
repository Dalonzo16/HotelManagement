import java.util.ArrayList;

/**
 * @author Ludwig Scherer
 * @date 11-02-2023
 */

public class PaymentReports 
{
    private ArrayList<Payment> payments;

    /**
     * Constructor for objects of class PaymentReports
     */
    public PaymentReports() 
    {
        payments = new ArrayList<Payment>();
    }
    /**
     * gets all payments
     * @return
     */
    public ArrayList<Payment> getPayments()
    {
        return payments;
    }
    /**
     * adds payment to payments
     * @param payment
     */
    public void addPayment(Payment payment)
    {
        payments.add(payment);
    }
}
