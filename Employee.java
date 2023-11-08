/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package hotelmanagement;

/**
 *This is the Employee class it is a parent class
 * @author Devon Alonzo
 * @date 11-8-2023
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
    
    /**
     * This is a constructor method that initalizes password and pay rate as well as employee ID
     * @param password the employee password
     * @param payRate the employees pay rate
     */
    public Employee(String password, int payRate){
        this.payRate = payRate;
        this.password = password;
        employeeId = counter++; // ID is automatically incremented by 1 by using the public variable counter everytime a new employee is created
    }
    /**
     * This is another constructor to initialize employee ID manually
     * @param employeeId the employees ID
     */
    public Employee(int employeeId){
        this.employeeId = employeeId;
    }
   /**
    * This method gets the employees first name
    * @return the employees first name
    */
    public String getFirstName() {
        return firstName;
    }
    /**
     * This method gets the employees last name
     * @return the employees last name
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * This method gets the employees address
     * @return the employees address
     */
    public String getAddress() {
        return address;
    }
    /**
     * This method gets the employees phone number
     * @return the employees phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    /**
     * This method gets the employees ID
     * @return the employees ID
     */
    public int getEmployeeId() {
        return employeeId;
    }
    /**
     * This method gets the employees password
     * @return the employees password
     */
    public String getPassword() {
        return password;
    }
    /**
     * This method gets the employees pay rate
     * @return the employees pay rate
     */
    public int getPayRate() {
        return payRate;
    }
    /**
     * This method sets the employees ID
     * @param employeeId the new employee ID
     */
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    /**
     * This method sets the employees first name
     * @param firstName the employees first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * This method sets the employees last name
     * @param lastName the employees last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * This method sets the employees phone number
     * @param phoneNumber the employees phone number
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    /**
     * This method sets the employees password
     * @param password the employees password
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * This method sets the employees address
     * @param address the employees address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    
    
    
    
    
    
}
