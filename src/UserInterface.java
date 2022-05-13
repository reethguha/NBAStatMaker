import java.util.*;

public class UserInterface {
    private Scanner input = new Scanner(System.in);

    public String inputFirstName(){
        boolean validFirstName = false;
        String firstName = null;
            while(!validFirstName){
                System.out.println("Enter player's first name or enter 'q' to quit");

                firstName = input.nextLine().toUpperCase();

                if(firstName.equals("Q")){
                    break;
                }
                else{
                    validFirstName = true;
                }

            }
            return firstName;

            }
    public String inputLastName(){
        boolean validLastName = false;
        String lastName = null;
        while(!validLastName){
            System.out.println("Enter player's last name or enter 'q' to quit");

            lastName = input.nextLine().toUpperCase();

            if(lastName.equals("Q")){
                break;
            }
            else{
                validLastName = true;
            }
        }
        return lastName;
    }

    public String seasons(){
        System.out.println("From what season do you want to see the stats?");
        String seasons = input.nextLine();
        return seasons;
    }



}