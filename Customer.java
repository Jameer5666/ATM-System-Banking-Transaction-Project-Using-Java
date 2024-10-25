import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Customer {

    public static void main(String[] args) throws IOException {
        ATM atm = new ATM();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Bank selectedBank = null;

        while (true) {
            System.out.println("\n--- Select a Bank ---");
            System.out.println("1. HDFC Bank");
            System.out.println("2. ICICI Bank");
            System.out.println("3. SBI Bank");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            String choice = reader.readLine();

            switch (choice) {
                case "1":
                    selectedBank = new HDFCbank();
                    break;
                case "2":
                    selectedBank = new ICICIbank();
                    break;
                case "3":
                    selectedBank = new SBIbank();
                    break;
                case "4":
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    continue;
            }

            if (selectedBank != null) {
                atm.insertCard(selectedBank);  // Start transactions for the selected bank
            }
        }
    }
}
