/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package hotelmanagement;

/**
 *
 * @author Devon
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String password;
    private  int employeeId;
    public static int counter = 1;
    private String address;
    public String shift;
    public int payRate;
    
    
    public Employee(String password, int payRate){
        this.payRate = payRate;
        this.password = password;
        employeeId = counter++;
    }
    public Employee(int employeeId){
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    
    public int getEmployeeId() {
        return employeeId;
    }

    public String getPassword() {
        return password;
    }

    public int getPayRate() {
        return payRate;
    }
    
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
    
    
    
    
    
}
