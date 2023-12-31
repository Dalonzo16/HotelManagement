/**
 *This is the Employee class it is a parent class
 * @author Devon Alonzo
 * @date 11-8-2023
 */
public class Employee 
{
    private String firstName;
    private String lastName;
    private String password;
    private int employeeId;
    public static int counter = 1;
    private String email;
    public double shiftDuration;
    public double payRate;
    
    /**
     * This is a constructor method that initalizes password and pay rate as well as employee ID
     * @param firstName the employees first name
     * @param lastName the employees last name
     * @param password the employee password
     * @param payRate the employees pay rate
     */
    public Employee(String firstName, String lastName,String password, double payRate)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.payRate = payRate;
        this.password = password;
        employeeId = counter; // ID is automatically incremented by 1 by using the public variable counter everytime a new employee is created
        email = "";
        shiftDuration = 0;
        counter++;
        System.out.println("The new employee " + firstName + " " + lastName + " was created with ID number: " + employeeId + " and password: " + password + 
            " ; His pay rate per hour is: $" + payRate);
    }
   /**
    * This method gets the employees first name
    * @return the employees first name
    */
    public String getFirstName()
    {
        return firstName;
    }
    /**
     * This method gets the employees last name
     * @return the employees last name
     */
    public String getLastName()
    {
        return lastName;
    }
    /**
     * This method gets the employees address
     * @return the employees address
     */
    public String getEmail()
    {
        return email;
    }
    /**
     * This method gets the employees ID
     * @return the employees ID
     */
    public int getEmployeeId()
    {
        return employeeId;
    }
    /**
     * This method gets the employees password
     * @return the employees password
     */
    public String getPassword()
    {
        return password;
    }
    /**
     * This method gets the employees pay rate
     * @return the employees pay rate
     */
    public double getPayRate()
    {
        return payRate;
    }
    /**
     * This method gets the employees shift duration
     * @return the employees shift duration
     */
    public double getShift()
    {
        return shiftDuration;
    }
    /**
     * This method sets the employees ID
     * @param employeeId the new employee ID
     */
    public void setEmployeeId(int employeeId)
    {
        this.employeeId = employeeId;
    }
    /**
     * This method sets the employees first name
     * @param firstName the employees first name
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    /**
     * This method sets the employees last name
     * @param lastName the employees last name
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    /**
     * This method sets the employees password
     * @param password the employees password
     */
    public void setPassword(String password)
    {
        this.password = password;
    }
    /**
     * This method sets the employees address
     * @param email the employees address
     */
    public void setEmail(String email)
    {
        this.email = email;
    }
    /**
     * This method sets the employees shift duration
     * @param shiftDuration the employees shift duration
     */
    public void setShift(double shiftDuration)
    {
        this.shiftDuration = shiftDuration;
    }
    /**
     * This method sets the employees pay rate
     * @param payRate the employees pay rate
     */
    public void setPayRate(double payRate)
    {
        this.payRate = payRate;
    }
}
