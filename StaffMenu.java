import java.util.Scanner;
/**
 * This is the staff menu class another child class of Menu
 * @author Devon Alonzo
 * @date 2023-11-09 19:46:59
 */
public class StaffMenu extends Menu {

    private byte userSelection;

    @Override
    public void displayMenu(){
        Scanner in = new Scanner(System.in);
        System.out.println("=========================");
        System.out.println("| 1. Rooms              |");
        System.out.println("| 2. Back to Main Menu  |");
        System.out.println("=========================");
        this.userSelection = in.nextByte();
    }
    /**
     * This method checks the user input
     */
    public void checkInput(Hotel hotel){
        if(userSelection == 1){
            Menu option1_2 = new RoomsMenu();
            do{
                option1_2.displayMenu();
                option1_2.checkInput(hotel);
            }while(option1_2.getUserSelection() != 3);
        }
    }
    /**
     * this method gets the users selection
     * @return the users selection
     */
    public byte getUserSelection(){
        return userSelection;
    }
    
}
