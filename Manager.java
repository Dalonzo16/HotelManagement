/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package hotelmanagement;

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
