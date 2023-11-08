import java.util.Scanner;

/**
 *
 * @author Devon
 */
public class ReservationMenu extends Menu {
    private byte userSelection;
    public void displayMenu(){
        Scanner in = new Scanner(System.in);
        System.out.println("=========================");
        System.out.println("| 1. Create Reservation |");
        System.out.println("| 2. Edit Reservation   |");
        System.out.println("| 3. Cancel Reservation |");
        System.out.println("| 4. Search Reservation |");
        System.out.println("| 5. Back to main menu  |");
        System.out.println("=========================");
        this.userSelection = in.nextByte();
    }
    public void checkInput(){
        switch(userSelection){
            case 1:
                System.out.println("created");
            break;
            case 2:
                System.out.println("edited");
            break;
            case 3:
                System.out.println("canceled");
            break;
            case 4:
                System.out.println("searched");
            break;
        }
    }

    public byte getUserSelection() {
        return userSelection;
    }
    
}
