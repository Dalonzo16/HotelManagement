import java.util.Scanner;
/**
 *This is the GuestsMenu class a child class of Menu
 * @author Devon Alonzo
 * @date 11-8-2023
 */
public class GuestsMenu extends Menu 
{
    private byte userSelection;
    
    @Override
    public void displayMenu() 
    {
            Scanner in = new Scanner(System.in);
            System.out.println("=========================");
            System.out.println("| 1. Check in           |");
            System.out.println("| 2. Check out          |");
            System.out.println("| 3. Add new guest      |");
            System.out.println("| 4. Remove guest       |");
            System.out.println("| 5. Edit guest         |");
            System.out.println("| 6. See all guests     |");
            System.out.println("| 7. Back to main menu  |");
            System.out.println("=========================");
            userSelection = in.nextByte();
    }
    /**
     * This is the checkInput method uses a switch case statement to determine what computations to perfor,
     * has no parameters yet because we have not worked on the actual computations
     */
    public void checkInput(Hotel hotel, Receptionist employee) 
    {
        switch(this.userSelection)
        {
            case 1:
                employee.checkInGuest(hotel);
                break;
            case 2:
                employee.checkOutGuest(hotel);
                break;
            case 3:
                Scanner in = new Scanner(System.in);
                System.out.println("Guest Name: ");
                String firstAndLastName = in.nextLine();
                System.out.println("Guest Phone Number: ");
                String phoneNumber = in.next();
                System.out.println("Guest Email: ");
                String email = in.next();
                Guest newGuest = new Guest(firstAndLastName, phoneNumber, email);
                hotel.addGuest(firstAndLastName, newGuest);
                System.out.println("Guest " + firstAndLastName + " created" );
                break;
            case 4:
                System.out.println("Removed Guest");
                break;
            case 5:
                System.out.println("Edited Guest");
                break;
            case 6:
                System.out.println("Guests");
                break;
        }
    }
    @Override
    public byte getUserSelection() 
    {
        return userSelection;
    }
}
