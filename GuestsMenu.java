import java.util.Scanner;
/**
 *
 * @author Devon
 */
public class GuestsMenu extends Menu {
    private byte userSelection;
    

    @Override
    public void displayMenu() {
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
            this.userSelection = in.nextByte();
    }
    
    public void checkInput() {
        switch(this.userSelection){
            case 1:
                
            break;
            case 2:
                System.out.println("Guest Checked out");
            break;
            case 3:
                
                System.out.println("created Guest");
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
    public byte getUserSelection() {
        return userSelection;
    }


    
    
}
