import java.util.Scanner;
import java.util.ArrayList;

public class Login {
    ArrayList<String[]> users = new ArrayList<String[]>();
    Scanner scanner = new Scanner(System.in);

    public void CreateAccount() {
        System.out.println("\nHello, what would you like your name to be? ");

        String username = scanner.nextLine();

        // Checks if the username picked is already in use
        for (String[] user : users) {
            if (user[0].equals(username)) {
                System.out.println("\nSorry, that name is already in use. Please enter a different username.");
                return;
            }
        }

        System.out.println("\nWhat would you like your password to be");
        String password = scanner.nextLine();

        // Creates user object
        String[] user = {username, password};
        
        // Adds user object to the ArrayList
        users.add(user);
    }

    public boolean ConfirmAccount(String name, String pass) {
    }

    public void UserLogin() { 

    }

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        // Creates new class instance
        Login L = new Login();

        while (true) {
            String MENU_OPTIONS = "\nPlease press:\n" +
            "a - Add account\n" +
            "l - Login\n" +
            "q - quit";

            System.out.println(MENU_OPTIONS);

            // Takes user input for the menu
            String user_option = scanner.nextLine();
    
            if (user_option.equalsIgnoreCase("q")) {
                break;
            } else if (user_option.equalsIgnoreCase("a")) {
                L.CreateAccount();
            } else if (user_option.equalsIgnoreCase("l")) {
                L.UserLogin();
            } else {
                System.out.println("\nPlease enter a valid option\n");
            }
        }
        scanner.close();
    }
}