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
        
        if (ConfirmAccount(username, password)) {
            // Adds user object to the ArrayList
            users.add(user);
        } else {
            return;
        }
    }

    public boolean ConfirmAccount(String name, String pass) {
        while (true) {
            System.out.println("\nWould you like your account to have the username: " + name + " with the password: " + pass + " (y or n)");
            String confirmation = scanner.nextLine();
    
            if (confirmation.equals("y")) { 
                return true;
            } else if (confirmation.equals("n")) {
                return false;
            } else {
                System.out.println("\nPlease enter a valid option\n");
            }
        }
    }

    public void UserLogin() { 
        System.out.println("\nWhat is your username? ");
        String username = scanner.nextLine();

        String[] account = {};
        // Checks if the entered username is valid
        for (String[] user : users) {
            if (user[0].equals(username)) {
                account = user;
            }
        }
        // Checks if the account is not blank
        if (account.length == 0) {
            System.out.println("\nSorry, that account does not exist in our database.");
            return;
        }

        // Checks if the users password is correct
        System.out.println("\nWhat is your password? ");
        String password = scanner.nextLine();

        if (account[1].equals(password)) {
            System.out.println("\nWelcome back, " + account[0]);
        } else {
            System.out.println("\nSorry, the password is incorrect");
        }
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