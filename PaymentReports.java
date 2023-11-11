
import java.util.HashMap;
import java.util.Map;

/**
 * @author Ludwig Scherer
 * @date 11-02-2023
 */

public class PaymentReports 
{
    private Map<Integer, Payment> payments;

    /**
     * Constructor for objects of class PaymentReports
     */
    public PaymentReports() 
    {
        payments = new HashMap<>();
    }
    /**
     * gets all payments
     * @return
     */
    public Map<Integer, Payment> getPayments()
    {
        return payments;
    }
    /**
     * adds payment to payments
     * @param payment
     */
    public void addPayment(Payment payment)
    {
        payments.put(payment.getPaymentID(), payment);
    }
}
