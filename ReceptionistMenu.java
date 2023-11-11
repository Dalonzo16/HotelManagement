import java.util.Scanner;
/**
 * This is the ReceptionistMenu class another child class of Menu
 * @Author Devon Alonzo
 * @date 2023-11-09 19:48:58
 */
public class ReceptionistMenu {

    private byte userSelection;
    

    public void displayMenu() {
        Scanner in = new Scanner(System.in);
        System.out.println("=========================");
        System.out.println("| 1. Guests             |");
        System.out.println("| 2. Rooms              |");
        System.out.println("| 3. Reservations       |");
        System.out.println("| 4. Back to Main Menu  |");
        System.out.println("=========================");
        this.userSelection = in.nextByte();
    }
    /**
     * This method check the input of the user by using a switch case statement and then calls other submenus
     */
    public void checkInput(Hotel hotel, Receptionist anEmployee){
        switch(userSelection){
            case 1:
                GuestsMenu option1_1 = new GuestsMenu();
                do{
                    option1_1.displayMenu();
                    option1_1.checkInput(hotel, anEmployee);
                }while(option1_1.getUserSelection() != 7);
                break;
            case 2:
                RoomsMenu option2_1 = new RoomsMenu();
                do{
                    option2_1.displayMenu();
                    option2_1.checkInput(hotel);
                }while(option2_1.getUserSelection() != 3);
                break;
            case 3:
                Menu option3_1 = new ReservationMenu();
                do{
                    option3_1.displayMenu();
                    option3_1.checkInput(hotel, anEmployee);
                }while(option3_1.getUserSelection() != 5);
                break;
        }
    }
    /**
     * This method gets the users selection
     * @return the users selection
     */
    public byte getUserSelection(){
        return userSelection;
    }

}
