/**
 *
 * @author Devon
 */
public class Manager extends Employee {
    
    public Manager(String password, int payRate){
        super(password, payRate);
    }
    
    public void setPayRate(int payRate){
        super.payRate = payRate;
    }
    public void setShift(String shift){
        super.shift = shift;
    }
    
}
