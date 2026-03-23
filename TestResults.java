import java.util.Scanner;

public class TestResults {
    public void displayResults() {
        displayResults(60, 40, 200, 8);
    }

    public void displayResults(int charsPerMin, int wordsPerMin, int totalChars, int mistakes) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n---------------- Typing Test Level 1 Result ----------------");
        System.out.println();
        System.out.println("Speed (characters/min): " + charsPerMin);
        System.out.println("Speed (words/min): " + wordsPerMin);
        System.out.println("Total input characters: " + totalChars);
        System.out.println("Total mistakes: " + mistakes);
        System.out.println("------------------------------------------------------------");
        System.out.println("1. Next level");
        System.out.println("2. Logout");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");

        String option = sc.nextLine();

        switch (option) {
            case "1":
                System.out.println("Next level is not available yet.");
                break;
            case "2":
                System.out.println("Logging out...");
                break;
            case "3":
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid option.");
        }
    }
}
