/**
 *This is the Manager class a child class of Employee
 * @author Devon Alonzo
 * @date 11-8-2023
 */
public class Manager extends Employee {
    /** 
     * This is a constructor method it initializes manager pass word and pay rate
     * @param password manager password
     * @param payRate manager pay rate
    */
    public Manager(String password, int payRate){
        super(password, payRate);
    }
    /**
     * This method sets an employees pay rate
     * @param payRate the new pay rate
     */
    public void setPayRate(int payRate){ // wanted to make it to where only manager can change pay rate and shift
        super.payRate = payRate;
    }
    /**
     * This method sets an empolyees shift
     * @param shift the shift
     */
    public void setShift(String shift){
        super.shift = shift;
    }
    
}
