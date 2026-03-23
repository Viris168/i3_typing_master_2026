import java.util.Scanner;

public class Register {
    public void showRegistration() {
    Scanner sc = new Scanner(System.in);
    System.out.println("\n---------------- New User Registration ----------------");
    System.out.print("Input a unique username (left blank to cancel): ");
    String username = sc.nextLine();

    if (username.isEmpty()) {
        return;
    }

    System.out.print("Input password: ");
    String pass = sc.nextLine();
    System.out.print("Input confirm password: ");
    String confirm = sc.nextLine();

    if (pass.equals(confirm)) {
        System.out.println("Registration successful!");
    } else {
        System.out.println("Passwords do not match.");
    }
    }
}