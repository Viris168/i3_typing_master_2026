import java.util.Scanner;

public class welcome_page {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("\n------------- Welcome to I3 Typing Master v2026 -------------");
            System.out.println("To Begin, please select one of the following options:");
            System.out.println("1. User registering");
            System.out.println("2. User reset password");
            System.out.println("3. User login");
            System.out.println("4. List of test results for a user");
            System.out.println("5. User typing test");
            System.out.println("6. About Us");
            System.out.println("7. Exit");
            System.out.print("Choose an option: - ");

            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    new Register().showRegistration();
                    break;
                case "2":
                    new ResetPassword().show();
                    break;
                case "3":
                    new Login().show();
                    break;
                case "4":
                    new TestResults().displayResults();
                    break;
                case "5":
                    new TypingTest().startTest();
                    break;
                case "6":
                    new AboutUs().showInfo();
                    break;
                case "7":
                    System.out.println("Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }

        sc.close();
    }
}
