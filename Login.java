import java.util.Scanner;

public class Login {
    public static void CreateAccount() {

    }

    public static boolean ConfirmAccount(String name, String pass) {
        
    }

    public static void UserLogin() { 

    }

    public static void main(String[] args) { 
        Scanner myObj = new Scanner(System.in);

        while (true) {
            String MENU_OPTIONS = "Please press:\n" +
            "a - Add account\n" +
            "l - Login\n" +
            "q - quit\n";

            System.out.println(MENU_OPTIONS);

            // Takes user input for the menu
            String user_option = myObj.nextLine();
    
            if (user_option.equalsIgnoreCase("q")) {
                break;
            } else if (user_option.equalsIgnoreCase("a")) {
                CreateAccount();
            } else if (user_option.equalsIgnoreCase("l")) {
                UserLogin();
            } else {
                System.out.println("\nPlease enter a valid option\n");
            }
        }
        myObj.close();
    }
}